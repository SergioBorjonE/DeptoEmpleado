package com.example.DeptoEmpleado.repository;
import com.example.DeptoEmpleado.model.Empleado;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpleadoRepository extends CrudRepository<Empleado, Integer> {

    Empleado findBynumEmpleado(Integer numEmpleado);

    List<Empleado> findAll();
}
