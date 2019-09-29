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
public class Ex18 {

    /**
     * A seguinte sequência de números 0, 1, 1, 2, 3, 5, 8, 13, 21... é
     * conhecida como série de Fibonacci. Nessa sequência, cada número, depois
     * dos 2 primeiros, é igual à soma dos 2 anteriores. Escreva um algoritmo
     * que leia um inteiro N (onde N < 46) e mostre os N primeiros números dessa
     * série. Utilize o laço que lhe for mais conveniente.
     *
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int numeroA = 0;
        int numeroB = 1;
        int fibonacci = 0;

        System.out.println("Digite um numero: ");
        int numero = Integer.parseInt(console.nextLine());
        if (numero > 46) {
            numero = 46;
        }

        int contador = 0;
        while (fibonacci < numero) {
            System.out.println(fibonacci);
            if (contador >= 1) {
                fibonacci = numeroA + numeroB;
                numeroA = numeroB;
                numeroB = fibonacci;
            } else {
                fibonacci++;
            }
            contador++;
        }
        
    }
}
