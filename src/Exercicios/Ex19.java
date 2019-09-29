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
public class Ex19 {

    /**
     * Escreva um programa que repita a leitura de uma senha até que ela seja
     * válida. Para cada leitura de senha incorreta informada, escrever a
     * mensagem "Senha Invalida". Quando a senha for informada corretamente deve
     * ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado.
     * Considere que a senha correta é o valor 2002. Utilize o laço que lhe for
     * mais conveniente.
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        while (true) {
            System.out.println("Digite uma senha: ");
            String senha = console.nextLine();

            if (!senha.equals("2002")) {
                System.out.println("Senha invalida!");
            } else {
                break;
            }
        }
        System.out.println("Acesso permitido!");
    }
}
