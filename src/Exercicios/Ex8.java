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
public class Ex8 {

    /**
     * Calcular e mostrar a média aritmética dos números pares compreendidos
     * entre 13 e 73. Utilize o laço que lhe for mais conveniente.
     */
    public static void main(String[] args) {

        int soma = 0, contador = 0, index = 13;
        while (index <= 73) {
            if (index % 2 == 0) {
                soma = soma + index;
                System.out.println(index);
                contador++;
            }
            index++;
        }
        System.out.println("Media: " + (soma / contador));
    }
}
