package com.example.DeptoEmpleado.controller;

import com.example.DeptoEmpleado.model.Depto;
import com.example.DeptoEmpleado.service.DeptoService;
import com.example.DeptoEmpleado.service.DeptoServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/depto")
public class DeptoController {

    private final DeptoService deptoService;

    public DeptoController(@Autowired DeptoService deptoService) {
        this.deptoService = deptoService;
    }

    @GetMapping("/{numDepto}")
    public Depto getDepto(@PathVariable int numDepto){
        return deptoService.getDepto(numDepto);
    }

    @GetMapping("/all")
    public List<Depto> getAll(){
        return deptoService.getDesptos();
}
}
