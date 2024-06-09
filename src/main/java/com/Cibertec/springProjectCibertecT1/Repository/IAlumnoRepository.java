package com.Cibertec.springProjectCibertecT1.Repository;

import com.Cibertec.springProjectCibertecT1.Model.alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAlumnoRepository extends JpaRepository<alumno, Integer>  {



}
