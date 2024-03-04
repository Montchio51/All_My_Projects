import java.util.Scanner;

public class Bino {

    public static int binomial (int n, int k){
        if (n==k || k ==0){
            return 1;
        }
            return binomial(n-1, k-1) + binomial(n-1, k);
    }

    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();

        System.out.println(binomial(n,k));
    }
}
