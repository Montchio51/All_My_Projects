import java.util.Scanner;

public class größte {

    public static int max ( int [] table, int n, int i){
        int j =i+1;
        boolean weiter = true;
        while (weiter) {
            if (j < n && table[j]<table[i]) {
                j++;
            } else {
                weiter = false;
            }
            if (j==n-1){
                return table[i];
            }
        }
        i=j;
        j++;
          return max(table, n, i);
    }

    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] table = new int [n];
        int i =0;

        while (i<n){
            table[i]= scan.nextInt();
            i++;
        }
        i=0;
        System.out.println(max(table, n, i));
    }
}
