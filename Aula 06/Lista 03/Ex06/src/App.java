/*
Elabore um algoritmo que calcule o que deve ser pago por um produto, considerando o preço normal de etiqueta 
e a escolha da condição de pagamento. 
Utilize os códigos da tabela a seguir para ler qual a condição de pagamento escolhida e efetuar o cálculo adequado.
1 - À vista em dinheiro, recebe 10% de desconto
2 - À vista no cartão de débito, preço normal da etiqueta
3 - Em duas vezes, preço normal de etiqueta mais juros de 10%
4 - Em três vezes, preço normal de etiqueta mais juros de 15%
*/

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        float valorCompra, valorFinal;
        int formaPagamento;

        System.out.print("Informe o valor da compra: ");
        valorCompra = teclado.nextFloat();
        System.out.println("Escolha a forma de pagamento: ");
        System.out.println("1 - À vista em dinheiro, recebe 10% de desconto");
        System.out.println("2 - À vista no cartão de débito, preço normal da etiqueta");
        System.out.println("3 - Em duas vezes, preço normal de etiqueta mais juros de 10%");
        System.out.println("4 - Em três vezes, preço normal de etiqueta mais juros de 15%");
        System.out.print("Informe a forma de pagamento: ");
        formaPagamento = teclado.nextInt();

        valorFinal = 0; // caso seja digitada uma opção inválida.
        switch (formaPagamento) {
            case 1:
                valorFinal = valorCompra * 0.9f;
                break;
            case 2:
                valorFinal = valorCompra;
                break;
            case 3:
                valorFinal = valorCompra * 1.1f;
                break;
            case 4:
                valorFinal = valorCompra * 1.15f;
                break;
            default:
                System.out.println("Forma da pagamento inválida.");
                break;
        }

        if(valorFinal != 0)
            System.out.printf("Valor final da compra: %.2f euros.", valorFinal);

        teclado.close();
    }
}
