package com.floristeria.repository;

import com.floristeria.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;

@Repository
public interface ProductoRepository extends JpaRepository<Producto,Long> {
    void saveOrUpdate(Producto producto);
    
    ArrayList<Producto> getProducto();
    
}
