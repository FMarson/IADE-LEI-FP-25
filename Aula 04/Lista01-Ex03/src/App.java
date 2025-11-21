import java.util.*;

/*
A padaria Hotpão vende uma certa quantidade de pães e uma quantidade de broas a cada dia. 
Cada pãozinho custa €$ 0,14 e a broa custa 1 euro e vinte cêntimos. Ao final do dia, 
o dono quer saber quanto arrecadou com a venda dos pães e das broas. 
Faça um algoritmo que leia o número de pães e broas vendidos em um dia e calcule o total arrecadado em euros. 

*/
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int qtdPaes, qtdBroas;

        float valorPao = 0.14f, valorBroa = 1.2f;
        float valorArrecadadoPaes, valorArrecadadoBroas, valorTotal;

        System.out.print("Informe a quantidade de pães vendidos: ");
        qtdPaes = input.nextInt();
        System.out.print("Informe a quantidade de broas vendidas: ");
        qtdBroas= input.nextInt();

        valorArrecadadoPaes = qtdPaes * valorPao;
        valorArrecadadoBroas = qtdBroas * valorBroa;
        valorTotal = valorArrecadadoPaes + valorArrecadadoBroas;

        System.out.println("O valor total arrecadado com as vendas de pães e de broas foi de " + valorTotal + " euros.");
    }
}
