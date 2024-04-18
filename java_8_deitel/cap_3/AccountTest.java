import java.util.Scanner;

public class AccountTest {
 
    public static void main(String[] args) {
        Account account1 = new Account("Chris");
        Account account2 = new Account("Eduarda");
        Scanner input = new Scanner(System.in);
        Account account = new Account("asd");
        System.out.printf("Initial name is: %s%n%n", account.getName());
        System.out.print("Insert name : ");
        String name = input.nextLine();
        System.out.println("Nome setado foi " + account.getName());
        account.setName(name);
        System.out.println("Nome setado foi " + account1.getName());
        System.out.println("Nome setado foi " + account2.getName());
        System.out.println("Nome setado foi " + account.getName());
        input.close();
    }
}