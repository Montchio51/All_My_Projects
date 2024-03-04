import java.util.Scanner;

public class Number {
    public static void main (String[] args){
        System.out.println("Tippen Sie bitte die Drei Nummer ein! ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        boolean weiter = true;
        int e = 1;

        while (weiter){

            if (a<b && a<c){
                System.out.println("a ist die kleinste Nummer !");
                if (b<c) {
                    System.out.println(" Die Nummer sind also: " + a + b + c);
                } else {
                    System.out.println("Die Nummer sind also: " + a + c + b);
                }


            }

            e++;
            if (e==3){
                weiter = false;
            }

        }

    }
}
