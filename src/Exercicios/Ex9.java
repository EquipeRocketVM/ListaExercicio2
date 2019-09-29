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
public class Ex9 {

    /**
     * Escreva um programa para ler a quantidade de alunos existentes em uma
     * turma. Depois disso, o programa deve ler as notas de cada um destes
     * alunos, calcular e mostrar na tela a média aritmética destas notas.
     * Utilize o laço WHILE
     *
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Digite a quantidade de alunos na turma: ");
        int quantidadeAlunos = Integer.parseInt(console.nextLine());

        int index = 0, somaNotas = 0;
        while (index < quantidadeAlunos) {
            System.out.println("Digite a nota do aluno(" + index + "):");
            somaNotas += Integer.parseInt(console.nextLine());

            index++;
        }
        System.out.println("A média da turma é " + (somaNotas / index));
    }
}
