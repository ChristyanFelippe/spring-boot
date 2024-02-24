import java.util.Scanner;

public class Comparison {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int num1;
        int num2;

        System.out.print("Insert num1 : ");
        num1 = input.nextInt();

        System.out.print("Inser num2 : ");
        num2 = input.nextInt();

        if (num1 == num2) {
            System.out.println("Number 1 is equals 2.");
        }

        if (num1 > num2) {
            System.out.println("The number " + num1 + " is bigger than " + num2);
        }

        if (num1 < num2) {
            System.out.println("The number " + num2 + " is bigger than " + num1);
        }
    } // fim do método main
} // fim da classe Comparison
