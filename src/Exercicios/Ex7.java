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
public class Ex7 {

    /**
     * Escreva um programa que imprima todos os múltiplos de 7 menores que 200.
     * Use o laço WHILE.
     */
    public static void main(String[] args) {

        int numero = 0;

        while (numero < 200) {
            if (numero % 7 == 0 && numero != 0) {
                System.out.println(numero + " é multiplo de 7 = " + (numero * 7));
            }
            numero++;
        }

    }
}

