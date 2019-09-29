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
public class Ex3 {

    /**
     * Escreva um programa que leia um conjunto de 10 números inteiros
     * positivos. Seu programa deve determinar e imprimir o maior deles. Use o
     * laço FOR
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maiorNumero = 0, posicao = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println(" ( " + i + " ) Digite um número inteiro: ");
            int numero = sc.nextInt();

            if (numero > maiorNumero) {
                maiorNumero = numero;
                posicao = i;
            }
        }
        System.out.println("O maior número foi: " + maiorNumero + " De posição : ( " + posicao + ")");

    }
}
