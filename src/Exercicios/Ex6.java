/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios;

import java.util.Scanner;

/**
 *
 * @author Vitoria Cristina
 */
public class Ex6 {

    /**
     * Faça um programa para ler e escrever dados de uma turma de 5 alunos. O
     * programa deve pedir dados como nome, idade e sexo. O programa deve
     * imprimir os dados do aluno mais velho. Use o laço DO-WHILE
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int idadeVelho = 0;
        String nomeVelho = "", sexoVelho = "";

        int conta = 0;
        do {
            System.out.println("Digite o nome do aluno: ");
            String nomeAluno = console.nextLine();

            System.out.println("Digite o sexo do aluno: (F ou M)");
            String sexoAluno = console.nextLine();

            System.out.println("Digite a idade do aluno: ");
            int idadeAluno = Integer.parseInt(console.nextLine());

            if (idadeAluno > idadeVelho) {
                idadeVelho = idadeAluno;
                nomeVelho = nomeAluno;
                sexoVelho = sexoAluno;
            }
            conta++;
        } while (conta < 5);

        System.out.println("O aluno " + nomeVelho
                + " do sexo " + sexoVelho
                + " possui " + idadeVelho + " anos e, é o aluno mais velho da turma.");
    }

}
