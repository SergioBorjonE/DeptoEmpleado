package com.example.DeptoEmpleado.controller;

import com.example.DeptoEmpleado.model.DeptoEmpleado;
import com.example.DeptoEmpleado.service.DeptoEmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/deptoEmpleado")
public class DeptoEmpleadoController {
    private final DeptoEmpleadoService deptoEmpleadoService;

    public DeptoEmpleadoController(@Autowired DeptoEmpleadoService deptoEmpleadoService) {
        this.deptoEmpleadoService = deptoEmpleadoService;
    }

    @GetMapping("/all")
    public List<DeptoEmpleado> getAll(){
        return deptoEmpleadoService.getAll();
    }
}
