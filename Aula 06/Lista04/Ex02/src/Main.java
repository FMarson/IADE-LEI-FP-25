/*
2) Crie um programa que verifica se um número inteiro informado pelo usuário 
é divisível por 3.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;

        System.out.print("Informe um número inteiro: ");
        numero = input.nextInt();

        if (numero % 3 == 0) {
            System.out.println("O número é divisível por 3.");
        } else {
            System.out.println("O número não é divisível por 3.");
        }

        input.close();
    }
}
