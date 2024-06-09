package com.Cibertec.springProjectCibertecT1.Rest;

import com.Cibertec.springProjectCibertecT1.Model.alumno;
import com.Cibertec.springProjectCibertecT1.Services.IAlumnoServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class alumnoController {

    IAlumnoServices alumnoService;

    public alumnoController(IAlumnoServices alumnoService) {
        this.alumnoService = alumnoService;
    }

    @GetMapping("/alumnos")
    public List<alumno> getAlumnos() {
        return alumnoService.GetAllAlumno();
    }


    @GetMapping("/alumno/{id}")
    public alumno getAll(@PathVariable int id) {
        return alumnoService.GetAlumnoById(id);
    }

    @PostMapping("/save")
    public alumno saveAlumno(@RequestBody alumno entity) {
        return alumnoService.SaveAlumno(entity);
    }


    @PutMapping("/update/{id}")
    public ResponseEntity<Integer> updateAlumno(@PathVariable Integer id, @RequestBody alumno _alumno) {
        Integer updated = alumnoService.updateAlumno(id, _alumno);
        if (updated == 1) {
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Integer> deleteAlumno(@PathVariable Integer id) {
        Integer deleted = alumnoService.deleteAlumno(id);
        if (deleted == 1) {
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
