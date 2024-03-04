import java.util.Random;

public class Zufall {
    public static void main (String[] args){
       Random random= new Random();
       String letter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       String wort = "" ;
       boolean weiter = true;
        int Stelle;
        int i = 1;
       while (weiter) {
           Stelle = random.nextInt(26);
           if (Stelle == 0 || Stelle == 4 || Stelle == 8 || Stelle == 14 || Stelle == 20 || Stelle == 24) {
              weiter = true ;
           } else {
               wort += letter.charAt(Stelle);
               weiter = false;
           }
       }

           weiter = true ;
       while ( weiter) {
           Stelle = random.nextInt(26);
           if (Stelle==0 || Stelle==4 || Stelle == 8 || Stelle == 14 || Stelle == 20 || Stelle == 24){
               wort += letter.charAt(Stelle);
               weiter = false;
           } else { weiter = true; }

       }
       weiter = true;
       while  (weiter && i <= 2 ){
           Stelle = random.nextInt(26);
           if (Stelle == 0 || Stelle == 4 || Stelle == 8 || Stelle == 14 || Stelle == 20 || Stelle == 24) {
               weiter = true ;
           } else {
               wort += letter.charAt(Stelle);
              if (i==2) {weiter = false;};
               i++;
           }
       }
       weiter = true;
        while (weiter) {
            Stelle = random.nextInt(26);
            if (Stelle == 0 || Stelle == 4 || Stelle == 8 || Stelle == 14 || Stelle == 20 || Stelle == 24) {
                wort += letter.charAt(Stelle);
                weiter = false ;
            } else {
                weiter = true;
            }
        }
        System.out.println("Das Wort ist :" + wort);
    }
}
