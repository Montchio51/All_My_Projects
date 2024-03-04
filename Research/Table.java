import java.util.Random;
import java.util.Scanner;

public class Table {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        int[] table = new int [5];
        Random random = new Random();
        for (int i = 0 ; i<table.length ; i++){
            System.out.println("Enter a new number: ");
            int b = scan.nextInt();
            table [i]=b;
        }
        int b = random.nextInt(6);
        System.out.println(table[b]);
    }
}
