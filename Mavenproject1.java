/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Mavenproject1 {
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
     Scanner input = new Scanner(System.in);
    ArrayList<Empregado>empregados= new ArrayList();
    do {
            System.out.println("\n::::::::::::::OPÇÕES::::::::::::::\n");
            System.out.println("""
                                [1] Cadastrar
                                [2] Promover
                                [3] demitir
                                [] Funcionario está fazendo aniversario
                                """);
            System.out.println("Escolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.println("\n::::::::::::::OPÇÕES::::::::::::::\n");

                    System.out.println("Gentileza digitar o nome");
                    String nome = input.nextString();
                    System.out.println("Gentileza digitar a idade");
                    int idade = input.nextInt();
                    System.out.println("Gentileza digitar o salario");
                    double salario = input.nextDouble();
                    empregados.add(new Empregado(String nome, int idade, double salario));
                    
                    System.out.println("Escolha uma opção: ");
                    opcao2 = input.nextInt();
                    input.nextLine();  // Limpa o buffer
                    switch (opcao2) {

                        case 1 -> {
                            System.out.println("A idade do funcionario: ");
                            int idade = input.nextInt();
                         promover(idade);
                           
                        }
                        
                        

                case 2 -> {

                    System.out.println("informe o motivo da demissão: ");
                            int motivo = input.nextInt();
                         ca.demitir(int motivo));


                }
                case 3 ->
                    System.out.println("Volte sempre!");
                default ->
                    System.out.println("Opção Inválida!");

            }
        } while (opcao != 3);

    }
    
        empregados.add(new Empregado(String nome, int idade, double salario));