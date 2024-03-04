import java.util.Scanner;

public class rekSummeBis {

    static int rek (int a){
        if(a>1){
            return rek(a-1)+a;
        }
        else {
            return 1;
        }
    }

    public static void main (String[] args){
        System.out.println("Tippen Sie bitte eine Nummer ein: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        long sTime = System.currentTimeMillis();
         System.out.println("Die Summe von 0 bis " + n + " ist gleich: " + rek(n));
        long eTime = System.currentTimeMillis();
        System.out.println(eTime-sTime);


    }
}
