import java.util.*;

/*
Durante uma liquidação uma loja resolveu dar quinze por cento de desconto nas compras feitas pelos clientes. 
Faça um programa que leia o valor total da compra e escreva o valor da compra com o desconto. 
 */

/*
100% = 1
15% = 0.15

valorTotal - valorTotal * 0.15
1 - 1 * 0.15 = 0.85
valorTotal * 0.85; // desconto

valorTotal * 1.23; // juros ou soma de percentual
*/



public class Main {
    public static void main() {
        Scanner input = new Scanner(System.in);

        float valorCompra, valorCompraComDesconto, valorDesconto;

        System.out.print("Informe o valor da compra: ");
        valorCompra = input.nextFloat();

        //opção 0
        System.out.println("Valor da compra com desconto: " + valorCompra * 0.85f + " euros.");
        // poderia terminar aqui 

        //Opção 1
        valorDesconto = valorCompra * 0.15f;
        valorCompraComDesconto = valorCompra - valorDesconto;

        //opção 2
        valorCompraComDesconto = valorCompra - valorCompra * 0.15f;

        //opção 3
        valorCompraComDesconto = valorCompra * 0.85f;

        System.out.println("Valor da compra com desconto: " + valorCompraComDesconto + " euros.");

    }
}
