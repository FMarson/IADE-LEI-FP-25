
/*
Durante uma liquidação uma loja resolveu dar quinze por cento de desconto nas compras feitas pelos clientes. 
Faça um programa que leia o valor total da compra e escreva o valor da compra com o desconto. 

Desconto
100% = 1
15% = 0.15
15% de desconto = 1 - 0.15 = 0.85 = desconto de 15%

Juros
100% = 1
15% = 0.15
1 + 0.15 = 1.15 = juros de 15%

 */
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        float valorCompra, valorCompraComDesconto;

        System.out.print("Informe o valor da compra: ");
        valorCompra = teclado.nextFloat();
        valorCompraComDesconto = valorCompra - valorCompra * 0.15f; // opção 1
        //valorCompraComDesconto = valorCompra * 0.85f; // opção 2

        System.out.println("O valor da compra com desconto é de " + valorCompraComDesconto + " euros.");

    }
}
