/*
6) Após dois anos de namoro, um casal resolveu morar junto para diminuir as despesas e dividi-las de forma equilibrada. 
Leia as informações: salário de cada um e o total das despesas. Calcule o percentual e o valor que cada um deve pagar; quem ganha mais, paga mais.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float salario1, salario2, despesasTotais, totalSalarios, percentual1, percentual2, valorPagar1, valorPagar2;

        System.out.print("Salário da primeira pessoa: ");
        salario1 = input.nextFloat();

        System.out.print("Salário da segunda pessoa: ");
        salario2 = input.nextFloat();

        System.out.print("Total das despesas: ");
        despesasTotais = input.nextFloat();

        totalSalarios = salario1 + salario2;

        percentual1 = salario1 / totalSalarios;
        percentual2 = salario2 / totalSalarios;

        valorPagar1 = despesasTotais * percentual1;
        valorPagar2 = despesasTotais * percentual2;

        System.out.printf("Pessoa 1 deve pagar %.2f euros (%.2f%%)%n", valorPagar1, percentual1 * 100);
        System.out.printf("Pessoa 2 deve pagar %.2f euros (%.2f%%)%n", valorPagar2, percentual2 * 100);

        input.close();
    }
}
