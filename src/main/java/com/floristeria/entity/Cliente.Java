package com.floristeria.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="clientes")

public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String correo;
    
}
