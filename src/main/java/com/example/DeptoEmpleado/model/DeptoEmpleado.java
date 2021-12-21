package com.example.DeptoEmpleado.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="deptoempleado")
public class DeptoEmpleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    Integer id;

    @ManyToOne
    @JoinColumn(name ="NUM_DEPTO")
    private Depto depto;

    @ManyToOne
    @JoinColumn(name="NUM_EMPLEADO")
    private Empleado empleado;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Depto getDepto() {
        return depto;
    }

    public void setDepto(Depto depto) {
        this.depto = depto;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
}
