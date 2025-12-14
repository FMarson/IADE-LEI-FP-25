/*
4) Crie um programa que solicite inicialmente o saldo inicial em euros de uma conta bancária. 
Em seguida, leia um código de operação (caractere) representando uma ação bancária e execute a ação correspondente, utilizando a estrutura switch/case:

'D' para Depósito: solicitar o valor a depositar e atualizar o saldo.
'S' para Saque: solicitar o valor a sacar e atualizar o saldo, se houver saldo suficiente; caso contrário, mostrar mensagem de saldo insuficiente.
'C' para Consulta de saldo: mostrar o saldo atual.
'E' para Encerrar a conta: informar que o valor foi sacado e mostrar uma mensagem de encerramento da conta.

O programa deve executar apenas uma operação e terminar. Se a opção digitada for inválida, informar ao usuário.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float saldo;
        char operacao;
        float valor;

        System.out.print("Informe o saldo inicial em euros: ");
        saldo = input.nextFloat();

        System.out.print("Informe a operação (D-Depósito, S-Saque, C-Consulta, E-Encerrar): ");
        operacao = input.next().toUpperCase().charAt(0);

        switch (operacao) {
            case 'D':
                System.out.print("Informe o valor a depositar: ");
                valor = input.nextFloat();
                if (valor > 0) {
                    saldo += valor;
                    System.out.printf("Depósito efetuado. Novo saldo: %.2f euros.%n", saldo);
                } else {
                    System.out.println("Valor inválido para depósito.");
                }
                break;

            case 'S':
                System.out.print("Informe o valor a sacar: ");
                valor = input.nextFloat();
                if (valor <= 0) {
                    System.out.println("Valor inválido para saque.");
                } else if (valor > saldo) {
                    System.out.println("Saldo insuficiente.");
                } else {
                    saldo -= valor;
                    System.out.printf("Saque efetuado. Novo saldo: %.2f euros.%n", saldo);
                }
                break;

            case 'C':
                System.out.printf("Saldo atual: %.2f euros.%n", saldo);
                break;

            case 'E':
                System.out.printf("Valor sacado: %.2f euros.%n", saldo);
                System.out.println("Conta encerrada.");
                saldo = 0;
                break;

            default:
                System.out.println("Operação inválida.");
        }

        input.close();
    }
}
