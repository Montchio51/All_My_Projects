package Research;

import java.util.Scanner;

public class PrimZahlen {

    public static int primzahlen (int n, int index){
        boolean [] table = new boolean[n];
        int[] arr = new int[n];
        int[] table1 = new int[n];
        int i =0, j=0;

        while (j<n){
            table [j]= true;
            arr [i]= i;
            i++;
            j++;
        }
        i=2;
        j=3;
        while (i<(n/2)){
            while (j<n){
                if ((arr[j] %i) ==0 && i!=j){
                    table [j] = false;
                }
                j++;
            }
            j=3;
            i++;
        }
        j=index;
       if (j<n && table[j]){
            return index;
        }
        /*while (j<n){
            if (table[j]){
                System.out.print(arr[j] + " ");
            }
            j++;
        }*/

    return index;
    }

   /* public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        primzahlen(n);
    }*/
}
