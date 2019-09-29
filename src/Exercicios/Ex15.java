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
public class Ex15 {

    /**
     * Faça um programa que leia um número inteiro N maior do que zero e calcule
     * o fatorial desse número. Fatorial de N é representado por N! e calculado
     * da seguinte maneira: 𝑁𝑁! = 𝑁𝑁 ∗ (𝑁𝑁 − 1) ∗ (𝑁𝑁 − 2) ∗. . .∗ 3 ∗ 2
     * ∗ 1 Utilize o laço que lhe for mais conveniente.
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Digite um numero maior do que zero: ");
        int numero = Integer.parseInt(console.nextLine());

        int fatorial = 1;
        String texto = numero + "! = ";
        if (numero == 0) {
            numero++;
        }

        for (int i = numero; i > 0; i--) {
            fatorial *= i;
            if (i != 1) {
                texto += i + " * ";
            } else {
                texto += i;
            }
        }
        System.out.println(texto + " = " + fatorial);

    }
}
