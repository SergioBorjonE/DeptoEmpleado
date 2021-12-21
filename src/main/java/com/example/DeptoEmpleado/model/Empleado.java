package com.example.DeptoEmpleado.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="EMPLEADO")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="NUM_EMP")
    private Integer numEmpleado;

    @Column(name="NOMBRE")
    private String nombre;

    @OneToMany(mappedBy = "empleado")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<DeptoEmpleado> deptoEmpleadoList;

    public Integer getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(Integer numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<DeptoEmpleado> getDeptoEmpleadoList() {
        return deptoEmpleadoList;
    }

    public void setDeptoEmpleadoList(List<DeptoEmpleado> deptoEmpleadoList) {
        this.deptoEmpleadoList = deptoEmpleadoList;
    }
}

