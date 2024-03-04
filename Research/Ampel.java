public class Ampel {

    //Attribute
    boolean roteLampe;
    boolean grueneLampe;

    //Konstruktor
    public Ampel (boolean roteLampe, boolean grueneLampe){
        this.roteLampe = roteLampe;
        this.grueneLampe = grueneLampe;
    }

    //Methoden

    public boolean umschalten (boolean roteLampe, boolean grueneLampe) {
        boolean b;
        b = grueneLampe;
        grueneLampe = roteLampe;
        roteLampe = b;
        druckeZustand(roteLampe,grueneLampe);
        return b;
    }
        public void druckeZustand (boolean roteLampe, boolean grueneLampe) {
            System.out.println(roteLampe);
            System.out.println(grueneLampe);
        }

    public void fahrtrichtungAendern(boolean roteLampe, boolean grueneLampe){
        umschalten(roteLampe, grueneLampe);
    }

}
