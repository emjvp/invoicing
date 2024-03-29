package com.example.invoicing.repository;

import com.example.invoicing.model.FacturaModel;
import com.example.invoicing.model.ProductoModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface ProductoRepository extends JpaRepository<ProductoModel, Long> {

    List<ProductoModel> findByFechaEliminacion(LocalDate fechaEliminacion);
}
