package com.floristeria.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="productos")

public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String color;
    private Long costo;
}
