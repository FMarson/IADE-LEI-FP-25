/*
1) O restaurante a quilo Bem-Bom cobra 21,00 euros por quilo de refeição. 
Escreva um algoritmo que leia o peso do prato servido pelo cliente (em gramas) e imprima o valor a pagar. 
A balança já desconta automaticamente o peso do prato, por isso considere apenas o peso da comida.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float pesoGramas, pesoQuilos, precoPorQuilo, valorPagar;
		
		precoPorQuilo = 21.0f;

        System.out.print("Informe o peso da comida em gramas: ");
        pesoGramas = input.nextFloat();

        pesoQuilos = pesoGramas / 1000.0f;
        valorPagar = pesoQuilos * precoPorQuilo;

        System.out.printf("Valor a pagar: %.2f euros%n", valorPagar);

        input.close();
    }
}
