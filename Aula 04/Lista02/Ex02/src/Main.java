/*
2) Faça um algoritmo para ler o salário de um funcionário e aumentá-lo em 15%. 
Após o aumento, desconte 8% de impostos. Imprima o salário inicial, o salário com o aumento e o salário final.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float salarioInicial, aumento, salarioComAumento, imposto, salarioFinal;

        System.out.print("Informe o salário do funcionário: ");
        salarioInicial = input.nextFloat();

        aumento = salarioInicial * 0.15f;
        salarioComAumento = salarioInicial + aumento;

        imposto = salarioComAumento * 0.08f;
        salarioFinal = salarioComAumento - imposto;
		// ou 
		//salarioFinal = salarioComAumento * 0.92f;

        System.out.printf("Salário inicial: %.2f%n", salarioInicial);
        System.out.printf("Salário com aumento: %.2f%n", salarioComAumento);
        System.out.printf("Salário final após imposto: %.2f%n", salarioFinal);

        input.close();
    }
}
