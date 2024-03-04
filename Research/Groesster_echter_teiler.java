import java.util.Scanner;

public class Groesster_echter_teiler {

    public static int greatestProperDivisor(int n){
        int i=2;
        while (i<9){
            if (n%i == 0){
                return (n/i);
            }
            i++;
        }
        return 1;
    }

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(greatestProperDivisor(n));
    }
}
