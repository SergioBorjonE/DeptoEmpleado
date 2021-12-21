package com.example.DeptoEmpleado.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="DEPTO")
public class Depto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="NUM_DEPTO")
    private Integer numdepto;

    @Column(name="DEPARTAMENTO")
    private String departamento;

    @OneToMany(mappedBy = "depto")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<DeptoEmpleado> deptoEmpleadoList;

    public Integer getNumdepto() {
        return numdepto;
    }

    public void setNumdepto(Integer numdepto) {
        this.numdepto = numdepto;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public List<DeptoEmpleado> getDeptoEmpleadoList() {
        return deptoEmpleadoList;
    }

    public void setDeptoEmpleadoList(List<DeptoEmpleado> deptoEmpleadoList) {
        this.deptoEmpleadoList = deptoEmpleadoList;
    }
}
