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
public class Ex16 {

    /**
     * Leia um valor inteiro N. Este valor será a quantidade de valores que
     * serão lidos em seguida do usuário. Para cada valor lido, mostre uma
     * mensagem em português dizendo se este valor lido é par (PAR), ímpar
     * (ÍMPAR), positivo (POSITIVO) ou negativo (NEGATIVO). No caso do valor ser
     * igual a zero (0), seu programa deverá imprimir apenas NULO. Utilize o
     * laço DO-WHILE.
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = Integer.parseInt(console.nextLine());

        int contador = 0;
        do {
            System.out.printf(contador + ": ");
            if (contador == 0) {
                System.out.println("(NULO)");
            } else {
                if (contador % 2 == 0) {
                    System.out.printf("(PAR)");
                } else {
                    System.out.printf("(IMPAR)");
                }

                if (contador > 0) {
                    System.out.println("(POSITIVO)");
                } else {
                    System.out.println("(NEGATIVO)");
                }
            }
            if (numero > 0) {
                contador++;
            } else {
                contador--;
            }
        } while (contador != numero);

    }
}
