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
public class Ex11 {

    /**
     * Faça um programa que leia um número natural N e calcule a soma abaixo
     * (lembre-se de que tanto as divisões quanto o resultado devem ser
     * decimais). Utilize o laço que lhe for mais conveniente. 𝑆𝑆 = 1 − 1 / 2
     * + 1 / 3 − 1 / 4 + 1 / 5 −. . . + 1 / n *
     *
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double soma = 0;
        int index = 1;

        System.out.println("Digite o valor de N:");
        int n = Integer.parseInt(console.nextLine());

        do {

            double divisao = 1.0 / index;
            soma += divisao;
            System.out.printf("1/" + index + " = %.2f \n", divisao);
            index++;
        } while (index <= n);

        System.out.printf("O resultado é: %.2f \n", soma);
    }
}
