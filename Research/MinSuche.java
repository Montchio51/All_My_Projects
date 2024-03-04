import java.util.Scanner;

public class MinSuche {
    static int posi (int[] arr, int h){
        int idx =h;
        int idy=h;
        int k =h;
            while (idx < arr.length) {
                if (arr[idx] < arr[idy]) {
                    k = idx;
                    idy = idx;
                }

                idx++;
            }
        return k;
        }
    public static void main (String[] args){
        System.out.println("Tippen Sie bitte die Anzahl der Nummer ein: ");
        Scanner scan = new Scanner(System.in);
        int anzahl = scan.nextInt();
        int[] table = new int[anzahl];
        int i = 0;
        int q = 0;
        int s = 0;
        while (i < table.length) {
            if (i < anzahl) {
                System.out.println("Geben Sie eine Zahl ein: ");
                table[i] = scan.nextInt();
                i++;
            }
        }
        while (s<table.length) {
                int o = posi(table, s);
        q = table [o];
        table[o] = table[s];
        table[s] = q ;
            System.out.print(table[s] + " ");
            s++;
        }
    }
}
