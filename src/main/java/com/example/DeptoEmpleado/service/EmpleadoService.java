package com.example.DeptoEmpleado.service;

import com.example.DeptoEmpleado.model.Empleado;

import java.util.List;

public interface EmpleadoService {

    Empleado getEmpleado(Integer numEmpleado);

    List<Empleado> getEmpleados();
}
