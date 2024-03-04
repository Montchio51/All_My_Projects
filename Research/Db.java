import java.util.Scanner;

public class Db {
    public static void main (String[] Args){
        System.out.println("Wilkommen bei der Deutschen bahn 🚐.");
        System.out.println("Wählen Sie Ihre Umstiegstation🚏: (1) Koblenzerstraße, (2) Untern Klingelsacht.");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        String text = " $";

        while (a!=1 && a !=2){
            System.out.println("Versuchen Sie bitte noch einmal");
            a = scan.nextInt();
        }
        if (a==1 || a==2) {

            if (a == 1) {
                System.out.println("Sie haben sich für Koblenzerstraße entschieden");
                System.out.println("Die fahrt wird also 1$ kosten.");
                System.out.println("Wie viel haben Sie dabei ?");
                double b = scan.nextDouble();

                System.out.println("Ihr Rückgeld ist: " + (b - 1) + text);
                System.out.println("Danke für die Fahrt");

            }
            if (a == 2) {
                System.out.println("Sie haben sich für untern Klingelsacht entschieden");
                System.out.println("Die fahrt wird also 1.99$ kosten.");
                System.out.println("Wie viel haben Sie dabei ?");
                double b = scan.nextDouble();

                System.out.println("Ihr Rückgeld ist: " + (b - 1.99) + text);
                System.out.println("Danke für die Fahrt");

            }
        }
    }
}
