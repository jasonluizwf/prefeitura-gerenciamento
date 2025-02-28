package org.prefeitura.cargos;


import org.prefeitura.departamentos.Departamento;

public class ChefeDepartamento extends Cargo {

    public ChefeDepartamento(Departamento departamento) {
        super("Chefe do Departamento de "+ departamento.getNomeDoDepartamento(),3000, departamento);
    }

    public String enviarTarefas() {
        return "faça tarefa!";
    }
}
