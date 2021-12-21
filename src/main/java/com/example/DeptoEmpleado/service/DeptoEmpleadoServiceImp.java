package com.example.DeptoEmpleado.service;

import com.example.DeptoEmpleado.model.DeptoEmpleado;
import com.example.DeptoEmpleado.repository.DeptoEmpleadoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptoEmpleadoServiceImp implements  DeptoEmpleadoService{

    private DeptoEmpleadoRepository deptoEmpleadoRepository;

    public List<DeptoEmpleado> getAll(){
        return deptoEmpleadoRepository.findAll();
    }
}
