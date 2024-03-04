import java.util.Scanner;

public class Guests {
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Wie viel ist die Anzahl der gäste ? ");
        int a = scan.nextInt();
        int b;
        boolean weiter = true;
        while(weiter){
            System.out.println("Tippen Sie bitte (1) um Gäste anzumelden, (2) um Gäste abzumelden,(3) um das programm zu beenden.");
            int condition = scan.nextInt();
            if (condition == 1){
                System.out.println("Wie viele Gäste wollen Sie anmelden? ");
                b=scan.nextInt();
                a+=b;
            }
            if (condition == 2){
                System.out.println("Wie viele Gäste wollen Sie abmelden? ");
                b=scan.nextInt();
                a-=b;
            }
            if (condition == 3){
                System.out.println("Das programm wurde beendet");
                System.out.println("Die Anzahl der Gäste ist jetzt: " + a);
                weiter = false;
            }
        }

    }
}
