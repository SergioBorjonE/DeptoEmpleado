package com.example.DeptoEmpleado.service;

import com.example.DeptoEmpleado.model.Empleado;
import com.example.DeptoEmpleado.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoServiceImp implements  EmpleadoService{
   private EmpleadoRepository empleadoRepository;

    public EmpleadoServiceImp( EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    @Override
    public Empleado getEmpleado(Integer numEmpleado) {
        return empleadoRepository.findBynumEmpleado(numEmpleado);
    }

    @Override
    public List<Empleado> getEmpleados() {
        return empleadoRepository.findAll();
    }
}
