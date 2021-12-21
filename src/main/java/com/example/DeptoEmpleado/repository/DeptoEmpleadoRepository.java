package com.example.DeptoEmpleado.repository;

import com.example.DeptoEmpleado.model.DeptoEmpleado;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeptoEmpleadoRepository extends CrudRepository <DeptoEmpleado, Integer> {

    List<DeptoEmpleado> findAll();
}
