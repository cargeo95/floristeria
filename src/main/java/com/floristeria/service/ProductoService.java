package com.floristeria.service;

import com.floristeria.entity.Producto;
import com.floristeria.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ProductoService {

    @Autowired
    ProductoRepository productoRepository;

    public List<Producto> getProductos() {
        return productoRepository.findAll();
    }

    public Optional<Producto> getProducto(Long id) {
        return productoRepository.findById(id);
    }

    public void saveOrUpdate(Producto producto){
        productoRepository.save(producto);
    }

    public void delete(Long id){
        productoRepository.deleteById(id);
    }
}
