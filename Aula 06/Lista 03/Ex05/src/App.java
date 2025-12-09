/*
5)	A confederação portuguesa de natação irá promover eliminatórias para o próximo mundial. 
Fazer um algoritmo que receba a idade de um nadador e imprima a sua categoria segundo a tabela a seguir: 

Categoria	    Idade
Infantil A	    5-7 anos
Infantil B	    8-10 anos
Juvenil A	    11-13 anos
Juvenil B	    14-17 anos
Sênior	        Maiores de 18 anos
*/

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int idade;

        System.out.print("Informe a idade do atleta: ");
        idade = input.nextInt();

        if(idade < 5)
            System.out.println("A idade mínima necessária para participar é de 5 anos.");
        else if(idade <= 7)
            System.out.println("Categoria Infantil A");
        else if(idade <= 10)
            System.out.println("Categoria Infantil B");
        else if(idade <= 13)
            System.out.println("Categoria Juvenil A");
        else if(idade <= 17)
            System.out.println("Categoria Juvenil B");
        else
            System.out.println("Categoria Sênior");
    }
}
