import java.util.*;

/*
Faça um algoritmo para calcular quantas ferraduras são necessárias para 
equipar todos os cavalos comprados para um haras. 
*/

public class Main {
    public static void main()  {
        Scanner input = new Scanner(System.in);

        //4 ferraduras por cavalo
        int numFerraduras, numCavalos;

        System.out.print("Informe a quantidade de cavalos do haras: ");
        numCavalos = input.nextInt();
        numFerraduras = numCavalos * 4;

        System.out.println("A quantidade de ferraduras necessárias para os cavalos do haras é de " 
                            + numFerraduras + " ferraduras.");
    }
}
