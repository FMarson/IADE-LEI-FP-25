/*
3) O IMC – Índice de Massa Corporal é um critério da Organização Mundial de Saúde para dar uma indicação sobre a condição de peso de uma pessoa adulta.
A fórmula é:
    IMC = peso / altura²
Elabore um algoritmo que leia o peso e a altura de um adulto e mostre sua condição de acordo com a tabela abaixo:
Menor que 18,5   -> Magreza
Entre 18,5 e 24,9 -> Normal
Entre 25,0 e 29,9 -> Sobrepeso
Entre 30,0 e 39,9 -> Obesidade
Maior que 40,0    -> Obesidade Grave
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float peso, altura, imc;

        System.out.print("Informe o peso (kg): ");
        peso = input.nextFloat();

        System.out.print("Informe a altura (m): ");
        altura = input.nextFloat();

        if (altura <= 0) {
            System.out.println("Altura inválida.");
            input.close();
            return;
        }

        imc = peso / (altura * altura);

        System.out.printf("IMC calculado: %.2f%n", imc);

        if (imc < 18.5f) {
            System.out.println("Condição: Magreza");
        } else if (imc >= 18.5f && imc <= 24.9f) {
            System.out.println("Condição: Normal");
        } else if (imc >= 25.0f && imc <= 29.9f) {
            System.out.println("Condição: Sobrepeso");
        } else if (imc >= 30.0f && imc <= 39.9f) {
            System.out.println("Condição: Obesidade");
        } else { // imc >= 40.0
            System.out.println("Condição: Obesidade Grave");
        }

        input.close();
    }
}
