import java.util.*;
/*
A padaria Hotpão vende uma certa quantidade de pães e uma quantidade de broas a cada dia. 
Cada pãozinho custa €$ 0,14 e a broa custa 1 euro e vinte cêntimos. 
Ao final do dia, o dono quer saber quanto arrecadou com a venda dos pães e das broas. 
Faça um algoritmo que leia o número de pães e broas vendidos em um dia e calcule o total arrecadado em euros. 
*/

public class Main {
    public static void main(){
        Scanner teclado = new Scanner(System.in);

        int qtdPaes, qtdBroas;
        float precoPao = 0.14f, precoBroa = 1.2f, valorTotal;

        System.out.print("Informe a quantidade de pães vendidos: ");
        qtdPaes = teclado.nextInt();
        System.out.print("Informe a quantidade de broas vendidas: ");
        qtdBroas = teclado.nextInt();

        valorTotal = precoPao * qtdPaes + precoBroa * qtdBroas;

        System.out.println("O valor total arrecadado com a venda dos produtos foi de " + valorTotal + " euros.");

        teclado.close();
    }
}
