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
public class Ex12 {

    /**
     * Faça um programa que leia um número natural N e calcule a soma abaixo
     * (lembre-se de que tanto as divisões quanto o resultado devem ser
     * decimais). Utilize o laço que lhe for mais conveniente. 𝑆𝑆 = 1 𝑁𝑁 + 2
     * 𝑁𝑁 − 1 + 3 𝑁𝑁 − 2 +. . . + 𝑁𝑁 − 1 2 + 𝑁𝑁 1
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double soma = 0;

        System.out.println("Digite o valor de N:");
        int n = Integer.parseInt(console.nextLine());

        double divisao = 0;
        int contador = 2;
        System.out.println("1 = 1");
        soma += 1;
        for (int i = 0; i <= n; i++) {
            String linhaUm = "", linhaDois = "";
            double resultadoLinhaUm = 1, resultadoLinhaDois = 1;
            int segundaLinha = 1;
            for (int j = 1; j <= contador; j++) {
                if (j != 1) {
                    segundaLinha += 2;
                }

                if (i == n && j == contador) {
                    linhaDois += "(2 * " + n + " - 1)";
                    linhaUm += n;
                    resultadoLinhaUm *= n;
                    resultadoLinhaDois *= (2 * n) - 1;
                } else {
                    linhaDois += segundaLinha;
                    linhaUm += j;
                    resultadoLinhaUm *= j;
                    resultadoLinhaDois *= segundaLinha;
                }

                if (j != contador) {
                    linhaUm += " * ";
                    linhaDois += " * ";
                }
            }
            divisao = resultadoLinhaUm / resultadoLinhaDois;
            System.out.printf("%s / %s = %.2f \n", linhaUm, linhaDois, divisao);
            soma += divisao;
            contador++;
        }
        System.out.printf("O resultado é: %.2f \n", soma);

    }
}
