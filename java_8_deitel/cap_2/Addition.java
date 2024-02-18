import java.util.Scanner;

public class Addition {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        

        int number1; // primeiro número a somar ÿ
        int number2; // segundo número a somar ÿ
        int sum; // soma de number1 e number2 ÿ

        System.out.print("Enter first integer: "); // prompt
        number1 = input.nextInt(); // lê primeiro o número fornecido pelo usuário ÿ

        System.out.print("Enter second integer: "); // prompt
        number2 = input.nextInt(); // lê o segundo número fornecido pelo usuário ÿ

        sum = number1 + number2; // soma os números, depois armazena o total em sumÿ

        System.out.printf("Sum is %d%n", sum); // exibe a soma ÿ
        System.out.println(input);
    }
}
