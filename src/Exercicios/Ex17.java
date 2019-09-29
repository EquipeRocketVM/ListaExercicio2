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
public class Ex17 {

    /**
     * Ler um número inteiro N e calcular e imprimir todos os seus divisores.
     * Exemplo: para o número 6, temos os seguintes divisores 1, 2, 3, 6.
     * Utilize o laço que lhe for mais conveniente.
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Digite o valor do divisor: ");
        int divisor = Integer.parseInt(console.nextLine());
        int contador = 1;
        System.out.printf(divisor + " é divisivel por: ");
        while (contador <= divisor) {
            if (divisor % contador == 0) {
                System.out.printf(String.valueOf(contador));
                if (contador < divisor) {
                    System.out.printf(", ");
                } else {
                    System.out.printf("\n");
                }
            }
            contador++;
        }
    }
}
