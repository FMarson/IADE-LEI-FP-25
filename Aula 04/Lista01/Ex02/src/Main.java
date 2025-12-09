import java.util.*;
/*
Faça um algoritmo para calcular quantas ferraduras são necessárias para equipar
todos os cavalos comprados para um haras. 
*/
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //4 ferraduras por cavalo
        int qtdCavalos, qtdFerradurasNecessarias;

        System.out.print("Informe a quantidade de cavalos do haras: ");
        qtdCavalos = input.nextInt();
        qtdFerradurasNecessarias = qtdCavalos * 4;

        System.out.println("A quantidade de ferraduras necessárias é " + qtdFerradurasNecessarias);

        input.close();
    }
}
