import java.util.Scanner;

public class Logarithmus {

    public static int Log2 (double n){
        n = (Math.log(n))/(Math.log(2));
        int k = (int) n;
        return k;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double n = scan.nextInt();

        System.out.println(Log2(n));
    }
}
