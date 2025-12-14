/*
4) O Pedrinho tem um porquinho mealheiro com muitas moedas e deseja saber quantos euros conseguiu poupar. 
Faça um algoritmo para ler a quantidade de cada tipo de moeda, e imprimir o valor total economizado, em euros. 
Considere que existam moedas de 1, 2, 5, 10, 20, 50 cêntimos e ainda moedas de um e de dois euros. 
Não havendo moeda de um tipo, a quantidade respetiva é zero.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int qtdMoedas1cent, qtdMoedas2cent, qtdMoedas5cent, qtdMoedas10cent, qtdMoedas20cent, qtdMoedas50cent, qtdMoedas1euro, qtdMoedas2euro;
        float totalEuros;

        System.out.print("Quantidade de moedas de 1 cêntimo: ");
        qtdMoedas1cent = input.nextInt();

        System.out.print("Quantidade de moedas de 2 cêntimos: ");
        qtdMoedas2cent = input.nextInt();

        System.out.print("Quantidade de moedas de 5 cêntimos: ");
        qtdMoedas5cent = input.nextInt();

        System.out.print("Quantidade de moedas de 10 cêntimos: ");
        qtdMoedas10cent = input.nextInt();

        System.out.print("Quantidade de moedas de 20 cêntimos: ");
        qtdMoedas20cent = input.nextInt();

        System.out.print("Quantidade de moedas de 50 cêntimos: ");
        qtdMoedas50cent = input.nextInt();

        System.out.print("Quantidade de moedas de 1 euro: ");
        qtdMoedas1euro = input.nextInt();

        System.out.print("Quantidade de moedas de 2 euros: ");
        qtdMoedas2euro = input.nextInt();

        totalEuros = qtdMoedas1cent * 0.01f + qtdMoedas2cent * 0.02f + qtdMoedas5cent * 0.05f +
                     qtdMoedas10cent * 0.10f + qtdMoedas20cent * 0.20f + qtdMoedas50cent * 0.50f +
                     qtdMoedas1euro + qtdMoedas2euro * 2;

        System.out.printf("Valor total economizado: %.2f euros%n", totalEuros);

        input.close();
    }
}