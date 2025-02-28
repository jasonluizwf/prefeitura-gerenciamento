package org.prefeitura.cargos;

import org.prefeitura.departamentos.Departamento;

import java.util.concurrent.atomic.AtomicLong;

public class Cargo {
    private static final AtomicLong generatedId = new AtomicLong(0);
    private final long id;
    private String nomeDoCargo;
    private double salario;
    private Departamento departamento;

    public Cargo(String nomeDoCargo, double salario, Departamento departamento) {
        this.id = generatedId.incrementAndGet();
        this.nomeDoCargo = nomeDoCargo;
        this.salario = salario;
        this.departamento = departamento;
    }

    public long getId() {
        return id;
    }

    public String getNomeDoCargo() {
        return nomeDoCargo;
    }

    public void setNomeDoCargo(String nomeDoCargo) {
        this.nomeDoCargo = nomeDoCargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
