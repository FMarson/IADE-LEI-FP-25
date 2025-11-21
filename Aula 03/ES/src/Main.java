import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        int idade;
        float altura;
        int soma, num1, num2;

        /*
        System.out.print("Digite seu nome: ");
        nome = input.nextLine();
        System.out.print("Digite sua idade: ");
        idade = input.nextInt();
        System.out.print("Digite sua altura: ");
        altura = input.nextFloat();

        System.out.println("O seu nome é " + nome + ", a sua idade é " + idade + " anos e sua altura é " + altura + " m.");
        */
        num1 = 10;
        num2 = 5;
        soma = num1 + num2;

        System.out.println("O resultado de num1 + num2 é igual a " + soma);
        soma++;
        System.out.println("O valor de soma agora é " + soma);
    }
}
