package Research;

import java.util.Scanner;

public class Zerlegerung {

    public static void primeFactorization (int x){
        int i =2;
        while (i<x) {
            i = PrimZahlen.primzahlen(x, i);
            if(x%i==0 && i!=1){
                System.out.print(i+"*");
                x = (x/i);
            } else i++;
        }
        if (i==x) System.out.print(i);

    }

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        primeFactorization(x);
    }
}
