import java.util.*;

/*
A imobiliária Imóbilis vende apenas terrenos retangulares. 
Faça um algoritmo leia as dimensões necessárias de um terreno com esse formato em metros, 
calcule e exiba a área desse terreno em metros quadrados. 
*/

public class Main {
    public static void main() {
        Scanner input = new Scanner(System.in);

        //area = base * altura
        //area = comprimento * largura
        float area, comprimento, largura;

        System.out.print("Informe o comprimento: ");
        comprimento = input.nextFloat();
        System.out.print("Informe a largura: ");
        largura = input.nextFloat();

        area = comprimento * largura;

        System.out.println("A área do terreno é " + area + " m².");

        input.close();
    }
}
