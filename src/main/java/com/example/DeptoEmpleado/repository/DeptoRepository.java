package com.example.DeptoEmpleado.repository;
import com.example.DeptoEmpleado.model.Depto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeptoRepository extends CrudRepository <Depto, Integer> {
    Depto findBynumdepto(Integer numDepto);

    List<Depto> findAll();
}
