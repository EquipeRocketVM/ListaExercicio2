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
public class Ex2 {
    /**
     * Faça um programa que leia um número N do usuário, some todos os números
     * inteiros de 1 a N, e mostre o resultado obtido. Use o laço WHILE.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int i = 1, soma =0;
        
        System.out.println("Digite um número inteiro: ");
        int numero = sc.nextInt();
        
        while (i <= numero){
            System.out.println(soma + " + " + i);
            soma = soma + i;
            i++;
          
        }
          System.out.println("Resultado da soma é: " + soma);
    }
}
