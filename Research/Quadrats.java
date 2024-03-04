import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Quadrats {

    public static void space (int i){
        int j=1;
        System.out.println();
        System.out.print("*");
        while (j<i-1 ){
            System.out.print(" ");
            j++;
        }
        System.out.print("*");

    }

    public static void main (String [] args){
        System.out.println("Geben Sie eine Zahl ein: ");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        String [] table = new String[i];
        int j=0;
        while(j<i){
            table[j]="*";
            System.out.print(table[j]);
            j++;
        }
        int counter =0;
        while (counter<i-2) {
            space(i);
            counter++;
        }
        j=0;
        System.out.println();
        while(j<i){
            table[j]="*";
            System.out.print(table[j]);
            j++;
        }


    }
}
