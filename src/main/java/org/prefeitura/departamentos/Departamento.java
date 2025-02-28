package org.prefeitura.departamentos;

import java.util.concurrent.atomic.AtomicLong;

public class Departamento {

    private static final AtomicLong generatedId = new AtomicLong(0);
    private final long id;
    private final String nomeDoDepartamento;
    private int qtdPessoas;

    public Departamento(String nomeDoDepartamento, int qtdPessoas) {
        this.id = generatedId.incrementAndGet(); // gerar id
        this.nomeDoDepartamento = nomeDoDepartamento;
        this.qtdPessoas = qtdPessoas;
    }

    public Departamento(String nomeDoDepartamento) {
        this.id = generatedId.incrementAndGet(); // gerar id
        this.nomeDoDepartamento = nomeDoDepartamento;
        this.qtdPessoas = 0;
    }

    public long getId() {
        return id;
    }

    public String getNomeDoDepartamento() {
        return nomeDoDepartamento;
    }

    public int getQtdPessoas() {
        return qtdPessoas;
    }

    public void setQtdPessoas(int qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
    }
}