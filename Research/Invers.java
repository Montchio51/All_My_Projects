import java.util.Scanner;

public class Invers {

    public static void main (String [] args) {
        System.out.println("Tippen Sie bitte die Anzahl der Nummer ein: ");
        Scanner scan = new Scanner(System.in);
        int anzahl = scan.nextInt();
        int[] table = new int[anzahl];
        int i = 0;
        int tauchen;
        while (i < anzahl) {
                System.out.println("Geben Sie eine Zahl ein: ");
                table[i] = scan.nextInt();
                i++;
        }
            int a = i/2;
            int b =0;
            int c = i-1;
            while ((b<=a) && (c>=a)){
                tauchen = table[c];
                table[c] = table [b];
                table[b] = tauchen ;
                b++;
                c--;
            }
            for (int r =0; r < anzahl; r++){
                System.out.print(table [r] + " ");
        }
     }

}
