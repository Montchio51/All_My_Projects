import java.util.Scanner;

public class Summe {

    public static int Sum (int n, int sum, int i){
        int fn;
       if (n==1) {
           return 1;
       }
       if (i<=n){
           sum += i * i;
           i++;
           return Sum(n, sum, i);
       }
       else return sum;
    }

    public static void main (String [] args){
        Scanner  scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum =0;
        int i=1;
        System.out.println(Sum(n,sum,i));
    }
}
