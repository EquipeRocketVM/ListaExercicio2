/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios;

/**
 *
 * @author Vitoria Cristina
 */
public class Ex10 {

    /**
     * Faça um programa que calcule e imprima o resultado da soma abaixo
     * (lembre-se de que tanto as divisões quanto o resultado devem ser
     * decimais). Utilize o laço que lhe for mais conveniente. 
     * 𝑆𝑆 = 1 + 1 / 2 + 1 / 3 + 1 / 4 +. . . + 1 / 20
     */
    public static void main(String[] args) {
        double soma = 0;
        int contador = 1;

        do {
            double divisao = 1.0 / contador;
            soma += divisao;
            System.out.printf("1/%d = %.2f \n", contador, divisao);
            contador++;
        } while (contador <= 20);

        System.out.printf("O resultado é: %.2f \n", soma);
    }
}
