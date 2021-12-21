package com.example.DeptoEmpleado.service;
import com.example.DeptoEmpleado.model.Depto;
import java.util.List;

public interface DeptoService {
    Depto getDepto(Integer numDepto);

    List<Depto> getDesptos();
}
