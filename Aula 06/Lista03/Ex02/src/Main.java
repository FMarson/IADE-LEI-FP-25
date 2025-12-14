import java.util.*;

/*
2)	Um comerciante comprou um produto e quer vendê-lo com lucros diferentes dependendo do valor da compra.
Ele quer um lucro de 45% se o valor da compra for menor do que 20 euros, 35% se o preço for de até 50 euros e
lucro de 25% se valor for maior. Entrar com o valor do produto e imprimir na tela o valor de venda.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner; //declarar
        scanner = new Scanner(System.in); // instanciar

        float valorCompra, valorVenda;

        System.out.print("Digite o valor da compra: ");
        valorCompra = scanner.nextFloat();

        if(valorCompra < 20)
            valorVenda = valorCompra * 1.45f;
        else if(valorCompra <= 50)
            valorVenda = valorCompra * 1.35f;
        else
            valorVenda = valorCompra * 1.25f;

        /*
        if(valorCompra < 20)
            valorVenda = valorCompra * 1.45f;
        if(valorCompra >= 20 && valorCompra <= 50)
            valorVenda = valorCompra * 1.35f;
        if(valorCompra > 50)
            valorVenda = valorCompra * 1.25f;
        */

        System.out.println("O valor de venda do produto será de " + valorVenda + " euros.");
    }
}
