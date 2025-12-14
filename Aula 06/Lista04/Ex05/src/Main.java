/*
5) Faça um conversor de câmbio de reais/dólares/euros. O usuário deve informar inicialmente a cotação de cada moeda em relação ao Euro. Depois apresente o seguinte menu:
a) Converter de Real para Euro
b) Converter de Real para Dólar
c) Converter de Euro para Dólar
d) Converter de Euro para Real
e) Converter de Dólar para Euro
f) Converter de Dólar para Real

Leia o valor a ser convertido na moeda de origem e imprima na tela a quantidade na moeda destino. Execute apenas uma vez.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float cotacaoReal, cotacaoDolar;
        char opcao;
        float valorOrigem, valorDestino;

        // Cotação em relação ao Euro
        System.out.print("Informe a cotação do Real em relação ao Euro: ");
        cotacaoReal = input.nextFloat();

        System.out.print("Informe a cotação do Dólar em relação ao Euro: ");
        cotacaoDolar = input.nextFloat();

        // Menu
        System.out.println("\nMenu:");
        System.out.println("a) Converter de Real para Euro");
        System.out.println("b) Converter de Real para Dólar");
        System.out.println("c) Converter de Euro para Dólar");
        System.out.println("d) Converter de Euro para Real");
        System.out.println("e) Converter de Dólar para Euro");
        System.out.println("f) Converter de Dólar para Real");

        System.out.print("\nEscolha uma opção (a-f): ");
        opcao = input.next().toLowerCase().charAt(0);

        switch (opcao) {
            case 'a': // Real -> Euro
                System.out.print("Informe o valor em Reais: ");
                valorOrigem = input.nextFloat();
                valorDestino = valorOrigem / cotacaoReal;
                System.out.printf("%.2f Reais = %.2f Euros%n", valorOrigem, valorDestino);
                break;

            case 'b': // Real -> Dólar
                System.out.print("Informe o valor em Reais: ");
                valorOrigem = input.nextFloat();
                valorDestino = (valorOrigem / cotacaoReal) * cotacaoDolar;
                System.out.printf("%.2f Reais = %.2f Dólares%n", valorOrigem, valorDestino);
                break;

            case 'c': // Euro -> Dólar
                System.out.print("Informe o valor em Euros: ");
                valorOrigem = input.nextFloat();
                valorDestino = valorOrigem * cotacaoDolar;
                System.out.printf("%.2f Euros = %.2f Dólares%n", valorOrigem, valorDestino);
                break;

            case 'd': // Euro -> Real
                System.out.print("Informe o valor em Euros: ");
                valorOrigem = input.nextFloat();
                valorDestino = valorOrigem * cotacaoReal;
                System.out.printf("%.2f Euros = %.2f Reais%n", valorOrigem, valorDestino);
                break;

            case 'e': // Dólar -> Euro
                System.out.print("Informe o valor em Dólares: ");
                valorOrigem = input.nextFloat();
                valorDestino = valorOrigem / cotacaoDolar;
                System.out.printf("%.2f Dólares = %.2f Euros%n", valorOrigem, valorDestino);
                break;

            case 'f': // Dólar -> Real
                System.out.print("Informe o valor em Dólares: ");
                valorOrigem = input.nextFloat();
                valorDestino = (valorOrigem / cotacaoDolar) * cotacaoReal;
                System.out.printf("%.2f Dólares = %.2f Reais%n", valorOrigem, valorDestino);
                break;

            default:
                System.out.println("Opção inválida.");
        }

        input.close();
    }
}
