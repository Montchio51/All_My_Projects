package Bank;
import java.util.Scanner;

public class test {
    public static void main (String[] arg){
        String accountHolder;
        int accountId;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your account Id: ");
        accountId = scan.nextInt();
        System.out.println("Enter your name: ");
        accountHolder = scan.next();
        Account account = new Account(accountHolder, accountId);
    }

}
