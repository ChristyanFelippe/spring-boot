import java.util.Scanner;

public class AccountTest {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account account = new Account();
        System.out.printf("Initial name is: %s%n%n", account.getName());
        System.out.print("Insert name : ");
        String name = input.nextLine();
        account.setName(name);
        System.out.println("Nome setado foi " + account.getName());
    }
    
}