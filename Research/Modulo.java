import java.util.Scanner;

public class Modulo {
    public static void main (String[] args) {
        System.out.println("Tippen Sie bitte die Anzahl der Nummer ein: ");
        Scanner scan = new Scanner(System.in);
        int anzahl = scan.nextInt();
        int[] table = new int[anzahl];
        int i = 0;
        int j = 0;
        boolean weiter = true;
        while (weiter) {
            if (i < anzahl) {
                System.out.println("Geben Sie eine Zahl ein: ");
                table[i] = scan.nextInt();
                i++;
            } else weiter = false;
        }
        weiter = true;
        while (weiter && j < anzahl) {
            if ((table[j] % 5) == 0) {
                System.out.println("true");
                weiter = false;
            }
            j++;
        }
        j-=1;
        if (j == anzahl-1 && (table[j]%5) != 0){
            System.out.println("false");
        }
    }
}
