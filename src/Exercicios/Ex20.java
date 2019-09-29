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
public class Ex20 {

    /**
     * Escreva um programa capaz de ler o saldo inicial de uma conta bancária e
     * um número indeterminado de operações de depósito e saque. O usuário deve
     * digitar “1” para realizar um depósito, “2” para realizar um saque. Após
     * digitar o código da operação, o usuário deve digitar o valor. As
     * operações devem continuar sendo realizadas até que o usuário digite o
     * código de operação “3”. Ao digitar “3”, o programa deve ser encerrado e o
     * saldo final da conta deve ser impresso com as seguintes mensagens: CONTA
     * ZERADA (caso o saldo final seja 0), CONTA ESTOURADA (se o saldo for
     * negativo) ou CONTA PREFERENCIAL (se o saldo for positivo). Utilize o laço
     * DO-WHILE.
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Digite o saldo inicial: ");
        double saldoInicial = Double.parseDouble(console.nextLine());

        int operacao = 0;
        double saldoAtual = saldoInicial;
        do {
            System.out.println("Digite uma operação. (1 = Deposito, 2 = Saque, 3 = Sair)");
            operacao = Integer.parseInt(console.nextLine());

            switch (operacao) {
                case 1:
                    System.out.println("Digite o valor do deposito: ");
                    double deposito = Double.parseDouble(console.nextLine());

                    saldoAtual += deposito;
                    System.out.println("Saldo atual R$ " + saldoAtual);
                    break;
                case 2:
                    System.out.println("Digite o valor do saque: ");
                    double saque = Double.parseDouble(console.nextLine());

                    saldoAtual -= saque;
                    System.out.println("Saldo atual R$ " + saldoAtual);
                    break;
                case 3:
                    System.out.println("Saindo..");
                    break;
                default:
                    System.out.println("Operação invalida!");
                    break;
            }
        } while (operacao != 3);

        if (saldoAtual > 0) {
            System.out.println("CONTA PREFERENCIAL.");
        } else if (saldoAtual < 0) {
            System.out.println("CONTA ESTOURADA.");
        } else {
            System.out.println("CONTA ZERADA");
        }

    }
}
