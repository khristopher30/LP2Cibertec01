package com.Cibertec.springProjectCibertecT1.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class alumno {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int Id;
    private String Nombre;
    private String Apellido;
    private int Edad;
    private String Telefono;
    private String Correo;
}
