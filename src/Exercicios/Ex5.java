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
public class Ex5 {

    /**
     * Faça um programa para imprimir os números pares entre 100 e 1, em ordem
     * decrescente, ou seja, o laço deve iniciar em 100 e encerrar em 1. Use o
     * laço FOR.
     */
    public static void main(String[] args) {
        for (int i = 100; i > 0; i--) {
            if(i%2 ==0){
                System.out.println(i);
            }
           
        }
    }

}
