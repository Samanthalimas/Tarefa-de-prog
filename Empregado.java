/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author aluno
 */
public class Empregado {

    private int idade;
    private String nome;
    private double salario;

    public Empregado(String nome, int idade, double salario) {
        this.nome = nome;
        this.salario = salario;
        this.idade = idade;
    }

    public void promover() {
        if (idade >= 18) {
            aumentarSalario(0.25);
        }
    }

    public void aumentarSalario(double percentual) {
        salario += salario * percentual;
    }

    public void demitir(int motivo) {
        if (motivo == 1) {
            System.out.println("O funcionario devera cumprir o aviso previo");
        } else if (motivo == 2) {
            salario = salario * 0.4;
            System.out.println("O funcionario recebera" + salario);
        } else if (motivo == 3) {
            if (1000 < salario &&salario <= 1500) {
                System.out.println("O funcionario recebera R$1500");
            } else if (2000 < salario &&salario <= 3000) {
                System.out.println("O funcionario recebera R$2500");
            } else if (3000 < salario &&salario <= 4000) {
                System.out.println("O funcionario recebera R$3500");
            } else if (salario > 4000) {
                System.out.println("O funcionario recebera R$4000");
            }
        }
    }

    void fazerAniversario() {
        idade = idade++;
    }

}


