/*
1) Faça um algoritmo para receber um número qualquer e informar na tela 
se o número é par ou é ímpar.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;

        System.out.print("Informe um número inteiro: ");
        numero = input.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }

        input.close();
    }
}
