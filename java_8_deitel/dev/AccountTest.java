import java.util.Scanner;

public class AccountTest {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account account = new Account();
        System.out.printf("Initial name is: %s%n%n", account.getName());
        System.out.println("Insert name : ");
        int name = input.nextInt();
        account.setName(name);
        System.out.println("Nome setado foi " + account.getName());
    }
    
}