import java.util.*;

/*
Um motorista deseja colocar no seu tanque X euros de combustível. 
Escreva um algoritmo para ler o preço do litro do combustível e o valor que o motorista tem disponível para abastecer. 
Calcule a quantidade de litros que foram abastecidos com o valor disponível e exiba na tela. 
*/

public class Main {
    public static void main() {        
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US); // para ler com . Exemplo: 3.14 ao invés de 3,14
        
        float precoLitroCombustivel, valorDisponivel, litrosAbastecidos;

        System.out.print("Informe o preço do litro do combustível: ");
        precoLitroCombustivel = input.nextFloat();
        
        System.out.print("Informe o valor disponível em euros para fazer o abastecimento: ");
        valorDisponivel = input.nextFloat();

        litrosAbastecidos = valorDisponivel / precoLitroCombustivel;
        
        System.out.println("Com " + valorDisponivel + " euros foi possível abastecer " + litrosAbastecidos + " litros de combustível.");

        input.close();
    }
}
