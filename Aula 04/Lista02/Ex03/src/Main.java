/*
3) A fábrica de sumos Sumo Meu vende o seu produto em três formatos: garrafas de 33 cl, de 75 cl e de 1,3 litros. 
Faça um algoritmo que leia o número de garrafas de cada tipo compradas por um cliente e calcule a quantidade total de litros que o cliente comprou.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int garrafas33cl, garrafas75cl, garrafas1300ml;
        float totalLitros;

        System.out.print("Número de garrafas de 33 cl: ");
        garrafas33cl = input.nextInt();

        System.out.print("Número de garrafas de 75 cl: ");
        garrafas75cl = input.nextInt();

        System.out.print("Número de garrafas de 1,3 litros: ");
        garrafas1300ml = input.nextInt();

        totalLitros = garrafas33cl * 0.33f + garrafas75cl * 0.75f + garrafas1300ml * 1.3f;

        System.out.printf("Quantidade total de litros comprados: %.2f litros%n", totalLitros);

        input.close();
    }
}
