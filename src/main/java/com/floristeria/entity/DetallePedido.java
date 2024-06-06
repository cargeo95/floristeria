package com.floristeria.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="detallePedidos")

public class DetallePedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long cantidad;
    private Long precio_unitario;
    private Long subtotal;
    
}
