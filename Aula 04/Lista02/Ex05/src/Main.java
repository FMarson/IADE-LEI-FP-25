/*
5) Faça um algoritmo que receba o valor do salário mínimo e o valor do salário recebido por um funcionário. 
Calcule e mostre quantos salários mínimos esse funcionário recebe por mês.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float salarioMinimo, salarioFuncionario, qtdSalariosMinimos;

        System.out.print("Informe o valor do salário mínimo: ");
        salarioMinimo = input.nextFloat();

        System.out.print("Informe o salário do funcionário: ");
        salarioFuncionario = input.nextFloat();

        qtdSalariosMinimos = salarioFuncionario / salarioMinimo;

        System.out.printf("O funcionário recebe %.2f salários mínimos.%n", qtdSalariosMinimos);

        input.close();
    }
}
