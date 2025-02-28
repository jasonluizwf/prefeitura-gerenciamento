package org.prefeitura.funcionarios;

import org.prefeitura.cargos.Cargo;
import org.prefeitura.departamentos.Departamento;

import java.util.concurrent.atomic.AtomicLong;

public class Funcionario {

    private static final AtomicLong generatedId = new AtomicLong(0);
    private final long id;
    private String nomeDoFuncionario;
    private int idade;
    private Cargo cargo;

    public Funcionario(String nomeDoFuncionario, int idade, Cargo cargo) {
        this.id = generatedId.incrementAndGet();
        this.nomeDoFuncionario = nomeDoFuncionario;
        this.idade = idade;
        this.cargo = cargo;
    }

    public long getId() {
        return id;
    }

    public String getNomeDoFuncionario() {
        return nomeDoFuncionario;
    }

    public void setNomeDoFuncionario(String nomeDoFuncionario) {
        this.nomeDoFuncionario = nomeDoFuncionario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nomeDoFuncionario='" + nomeDoFuncionario + '\'' +
                ", idade=" + idade +
                ", cargo=" + cargo.getNomeDoCargo() +
                ", salario= R$" + cargo.getSalario() +
                '}';
    }
}
