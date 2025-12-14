/*
6) Efetuar a leitura de quatro números inteiros diferentes e identificar o maior e o menor valor.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1, n2, n3, n4;
        int menor, maior;

        System.out.print("Informe o primeiro número inteiro: ");
        n1 = input.nextInt();

        System.out.print("Informe o segundo número inteiro (diferente do primeiro): ");
        n2 = input.nextInt();

        System.out.print("Informe o terceiro número inteiro (diferente dos anteriores): ");
        n3 = input.nextInt();

        System.out.print("Informe o quarto número inteiro (diferente dos anteriores): ");
        n4 = input.nextInt();

        // Verifica se os números são diferentes
        if (n1 == n2 || n1 == n3 || n1 == n4 ||
            n2 == n3 || n2 == n4 ||
            n3 == n4) {
            System.out.println("Erro: Os números devem ser todos diferentes.");
            input.close();
            return;
        }

        // Inicializa o menor e o maior com o primeiro número
        menor = maior = n1;

        if (n2 < menor) {
            menor = n2;
        }
        if (n2 > maior) {
            maior = n2;
        }

        if (n3 < menor) {
            menor = n3;
        }
        if (n3 > maior) {
            maior = n3;
        }

        if (n4 < menor) {
            menor = n4;
        }
        if (n4 > maior) {
            maior = n4;
        }

        System.out.println("Menor valor: " + menor);
        System.out.println("Maior valor: " + maior);

        input.close();
    }
}
