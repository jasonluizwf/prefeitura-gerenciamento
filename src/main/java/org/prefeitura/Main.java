package org.prefeitura;

import org.prefeitura.cargos.Cargo;
import org.prefeitura.cargos.ChefeDepartamento;
import org.prefeitura.departamentos.Arrecadacao;
import org.prefeitura.funcionarios.Funcionario;

public class Main {
    public static void main(String[] args) {
        Arrecadacao arrecadacao = new Arrecadacao(3);
        Cargo cargo = new Cargo("Fiscal de Obras", 1700, arrecadacao);
        ChefeDepartamento chefia = new ChefeDepartamento(arrecadacao);
        Funcionario funcionario = new Funcionario("Victor",23, chefia);

        System.out.println(funcionario.toString());
    }
}