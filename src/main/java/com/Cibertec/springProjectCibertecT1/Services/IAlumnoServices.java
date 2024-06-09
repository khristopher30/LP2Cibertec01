package com.Cibertec.springProjectCibertecT1.Services;

import com.Cibertec.springProjectCibertecT1.Model.alumno;

import java.util.List;

public interface IAlumnoServices {

    List<alumno> GetAllAlumno();
    alumno GetAlumnoById(int id);
    alumno SaveAlumno(alumno entity);
    Integer updateAlumno(Integer id, alumno _alumno);
    Integer deleteAlumno(Integer id);
}
