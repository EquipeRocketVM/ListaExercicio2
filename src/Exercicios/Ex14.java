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
public class Ex14 {

    /**
     * Faça um programa que leia um número natural N e calcule a soma abaixo
     * (lembre-se de que tanto as divisões quanto o resultado devem ser
     * decimais). Utilize o laço que lhe for mais conveniente. 𝑆𝑆 = 1 + 2 3 +
     * 4 5 + 6 7 +. . . + 2𝑁𝑁 (2𝑁𝑁 + 1)
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double soma = 0;

        System.out.println("Digite o valor de N:");
        int n = Integer.parseInt(console.nextLine());

        double divisao = 0;
        for (int i = 1; i < n; i++) {
            divisao = (i + 1.0) / (n - i);
            soma += divisao;
            if (i == 1) {
                System.out.println("1");
            } else {
                System.out.printf((i - 1) + "/" + i + " = %.2f \n", divisao);
            }
        }
        divisao = (2.0 * n) / (2.0 * n + 1);
        soma += divisao;
        System.out.printf("2 * " + n + " / " + "(2* " + n + " + 1)" + " = %.2f \n", divisao);
        System.out.printf("O resultado é: %.2f \n", soma);
    }
}

