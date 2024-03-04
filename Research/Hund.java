package Research;

public class Hund {
    //Attribute
    int alter;
    String art;
    String fellfarbe;
    boolean kannPfoteGeben;

    //Konstruktor
    public Hund (int alter, String art, String fellfarbe, boolean kannPfoteGeben){
        this.alter = alter;
        this.art = art;
        this.fellfarbe = fellfarbe;
        this.kannPfoteGeben = kannPfoteGeben;
    }

    //Methoden
    public void bellen() {
        System.out.println("Wuff Wuff");
    }
    public void plusRechnen (int Zahl1, int Zahl2){
        System.out.println(Zahl1+Zahl2);
    }
}
