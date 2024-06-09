package com.Cibertec.springProjectCibertecT1.Services.impl;

import com.Cibertec.springProjectCibertecT1.Model.alumno;
import com.Cibertec.springProjectCibertecT1.Repository.IAlumnoRepository;
import com.Cibertec.springProjectCibertecT1.Services.IAlumnoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlumnoServices implements IAlumnoServices {

    IAlumnoRepository _alumnoRepository;

    @Autowired
    public AlumnoServices(IAlumnoRepository alumnoRepository) {
        _alumnoRepository = alumnoRepository;
    }

    @Override
    public List<alumno> GetAllAlumno() {

        return _alumnoRepository.findAll();
    }

    @Override
    public alumno GetAlumnoById(int id) {
        Optional<alumno> rowInDB = _alumnoRepository.findById(id);
        if (rowInDB.isPresent())
            return rowInDB.get();
        else
            return new alumno();
    }

    @Override
    public alumno SaveAlumno(alumno entity) {
        alumno guardarAlumno = _alumnoRepository.save(entity);
        return guardarAlumno;
    }

    @Override
    public Integer updateAlumno(Integer id, alumno _alumno) {
        Optional<alumno> existingAlumno = _alumnoRepository.findById(id);
        if (existingAlumno.isPresent()) {
            alumno AlumnoToUpdate = existingAlumno.get();
            AlumnoToUpdate.setNombre(_alumno.getNombre());
            AlumnoToUpdate.setApellido(_alumno.getApellido());
            AlumnoToUpdate.setEdad(_alumno.getEdad());
            AlumnoToUpdate.setTelefono(_alumno.getTelefono());
            AlumnoToUpdate.setCorreo(_alumno.getCorreo());
            _alumnoRepository.save(AlumnoToUpdate);
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public Integer deleteAlumno(Integer id) {
        Optional<alumno> optionalAnimal = _alumnoRepository.findById(id);

        if (optionalAnimal.isPresent()) {
            _alumnoRepository.deleteById(id);
            return 1;
        } else {
            return 0;
        }
    }


}
