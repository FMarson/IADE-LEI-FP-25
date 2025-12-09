

/*

1)	Implementar um programa que calcula o desconto previdenciário de um funcionário. 
O programa deve, dado um salário, retornar o valor do desconto proporcional ao mesmo. 
O cálculo de desconto segue a regra: o desconto deve 11% do valor do salário, entretanto, 
o valor máximo de desconto é 121 euros. Sendo assim, ou o método retorna 11% sobre o salário ou 121 euros.

*/

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        double salario, desconto;

        System.out.print("Informe o valor do salário: ");
        salario = input.nextDouble();

        desconto = salario * 0.11;
        if(desconto > 121){
            desconto = 121;
        }
        
        System.out.println("O desconto do salário será de " + desconto + " euros.");

        input.close();
    }
}
