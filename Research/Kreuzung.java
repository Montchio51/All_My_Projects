public class Kreuzung {

    public static void druckeZustand(){
        Ampel Ampel1 = new Ampel(true, false);
        Ampel Ampel2 = new Ampel(false, true);

        Ampel1.umschalten(Ampel1.roteLampe, Ampel1.grueneLampe);
        Ampel2.fahrtrichtungAendern(Ampel2.roteLampe, Ampel2.grueneLampe);
    }

    public static void main (String [] args){
    for (int i =0; i<= 10; i++){
            druckeZustand();
        }
    }

}
