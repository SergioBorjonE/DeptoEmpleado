package com.example.DeptoEmpleado.controller;

import com.example.DeptoEmpleado.model.Empleado;
import com.example.DeptoEmpleado.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/empleados")
public class EmpleadoController {

    private final EmpleadoService empleadoService;

    public EmpleadoController(@Autowired  EmpleadoService empleadoService) {
        this.empleadoService = empleadoService;
    }

    @GetMapping("/{numEmpleado}")
    public Empleado getEmpleado(@PathVariable int numEmpleado){
        return empleadoService.getEmpleado(numEmpleado);
    }

    @GetMapping("/all")
    public List<Empleado> getAll(){
        return empleadoService.getEmpleados();
    }
}
