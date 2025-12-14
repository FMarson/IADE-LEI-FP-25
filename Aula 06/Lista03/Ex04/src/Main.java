
/*
4)	Crie um programa para informar quais e quantas notas são necessárias para entregar o mínimo de cédulas para 
um determinado valor informado pelo usuário considerando notas de 100, 50, 20, 10 e 5 euros. 
Seu programa deve mostrar apenas as notas utilizadas. 
Por exemplo, ao solicitar 35 euros, o programa deve informar apenas a seguinte informação 
(note que não foram exibidas informações sobre as demais cédulas):
1 nota(s) de 20 euros.
1 nota(s) de 10 euros.
1 nota(s) de 5 euros.
*/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valorSolicitado, valorDevido, qtdNotas100, qtdNotas50, qtdNotas20, qtdNotas10, qtdNotas5;

        System.out.print("Informe o valor solicitado: ");
        valorSolicitado = input.nextInt();

        if(valorSolicitado % 5 != 0){ // verifica se o valor solicitado pode ser entregue com notas de 5 euros.
            System.out.println("Não é possível atender essa solicitação. Solicite múltiplos de 5 euros.");
        }
        else{
            valorDevido = valorSolicitado;
            qtdNotas100 = valorDevido / 100;    // calcula o número de notas de 100 euros a serem entregues
            valorDevido = valorDevido % 100;    // calcula o quanto falta entregar
            qtdNotas50 = valorDevido / 50;      // calcula o número de notas de 50 euros a serem entregues
            valorDevido = valorDevido % 50;     // calcula o quanto falta entregar
            qtdNotas20 = valorDevido / 20;      // calcula o número de notas de 20 euros a serem entregues
            valorDevido = valorDevido % 20;     // calcula o quanto falta entregar
            qtdNotas10 = valorDevido / 10;      // calcula o número de notas de 10 euros a serem entregues
            valorDevido = valorDevido % 10;     // calcula o quanto falta entregar
            qtdNotas5 = valorDevido / 5;        // calcula o número de notas de 5 euros a serem entregues

            System.out.println("Foram entregues as seguintes notas:");
            if(qtdNotas100 >= 1)
                System.out.println(qtdNotas100 + " nota(s) de 100 euros.");
            if(qtdNotas50 >= 1)
                System.out.println(qtdNotas50 + " nota(s) de 50 euros.");
            if(qtdNotas20 >= 1)
                System.out.println(qtdNotas20 + " nota(s) de 20 euros.");
            if(qtdNotas10 >= 1)
                System.out.println(qtdNotas10 + " nota(s) de 10 euros.");
            if(qtdNotas5 >= 1)
                System.out.println(qtdNotas5 + " nota(s) de 5 euros.");
        }
    }
}
