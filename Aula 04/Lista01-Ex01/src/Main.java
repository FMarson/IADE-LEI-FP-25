import java.util.*;

public class Main {
    public static void main() {
        Scanner input = new Scanner(System.in);

        //area = base * altura
        float area, comprimento, largura;

        System.out.print("Informe o comprimento: ");
        comprimento = input.nextFloat();
        System.out.print("Informe a largura: ");
        largura = input.nextFloat();

        area = comprimento * largura;

        System.out.println("A área do terreno é de " + area + " m².");
        
        input.close();
    }
}
