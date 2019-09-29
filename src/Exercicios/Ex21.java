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
public class Ex21 {

    /**
     * Na matemática, um número perfeito é um número inteiro para o qual a soma
     * de todos os seus divisores positivos próprios (excluindo ele mesmo) é
     * igual ao próprio número. Por exemplo o número 6 é perfeito, pois 1+2+3 é
     * igual a 6. Sua tarefa é escrever um programa que imprima se um
     * determinado número é perfeito ou não. Utilize o laço que lhe for mais
     * conveniente.
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = Integer.parseInt(console.nextLine());

        int sequencia = 0, soma = 0;
        String texto = "0";
        while (soma < numero) {
            sequencia += 1;
            soma += sequencia;
            if (sequencia < numero) {
                texto += " + " + sequencia;
            }
        }
        if (soma > numero) {
            System.out.println(numero + " NÃO É UM NUMERO PERFEITO.");
        } else if (soma == numero) {
            System.out.println(numero + " É UM NUMERO PERFEITO.");
            System.out.println(texto + " = " + numero);
        }
    }
}
