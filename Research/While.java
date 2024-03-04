import java.util.Scanner;

public class While {
    public static void main ( String[] args ){
        Scanner scan = new Scanner(System.in);
        int a;
        int number;
        int counter=1;
        String text = " mal gespielt.";

        if (counter== 1){
            System.out.println("🎶Apache bleibt gleich🎶");
            System.out.println("🎶Bruder ich muss los🎶");
            counter++;
        }
        while (counter<=5 && counter>=2){
            System.out.println("Soll die Musik noch gespielt werden Ja(1) Nein(2) ?");
           number = scan.nextInt();
           if (number==1) {
               System.out.println("🎶Apache bleibt gleich🎶");
               System.out.println("🎶Bruder ich muss los🎶");
           } else { System.out.println(" Die Musik wurde " + (counter-1) + text);}

           counter++;
        }
    }
}
