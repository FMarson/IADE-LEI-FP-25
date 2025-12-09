/*
3)	Tendo como dados de entrada a altura e o gênero de uma pessoa, construa um algoritmo que calcule seu peso ideal, \
utilizando as seguintes fórmulas:
- para homens: (72.7 * h) - 58
- para mulheres: (62.1 * h) - 44.7
*/

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        float altura, pesoIdeal;
        char genero;

        System.out.print("Informe o seu gênero: ");
        genero = teclado.next().charAt(0);

        System.out.println("Informe a sua altura: ");
        altura = teclado.nextFloat();

        switch (genero) {
            case 'f':
            case 'F':
                pesoIdeal = (62.1f * altura) - 44.7f;
                System.out.println("Seu peso ideal é de " + pesoIdeal + " kg");
                break;
            case 'm':
            case 'M':
                pesoIdeal = (72.7f * altura) - 58;
                System.out.println("Seu peso ideal é de " + pesoIdeal + " kg");
                break;
            default:
                System.out.println("O gênero deve ser informado como f ou m.");
                break;
        }
        /*
        if(genero == 'f' || genero == 'F'){
            pesoIdeal = (62.1f * altura) - 44.7f;
            System.out.println("Seu peso ideal é de " + pesoIdeal + " kg");
        }
        else if(genero == 'm' || genero == 'M'){
            pesoIdeal = (72.7f * altura) - 58;
            System.out.println("Seu peso ideal é de " + pesoIdeal + " kg");
        }
        else {
            System.out.println("O gênero deve ser informado como f ou m.");
        }
        */
       teclado.close();
    }
}
