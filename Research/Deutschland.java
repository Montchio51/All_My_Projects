package Research;

public class Deutschland {
    // Attribute
    String Marke;
    String Farbe;
    String Modell;
    int Baujahr;
    boolean kannfliegen;

    //Konstruktor
    public Deutschland (String Marke, String Farbe, String Modell, int Baujahr, boolean kannfliegen){
        this.Marke = Marke;
        this.Farbe = Farbe;
        this.Modell = Modell;
        this.Baujahr = Baujahr;
        this.kannfliegen = kannfliegen;
    }

    //Methoden
    public void fahren (){
        System.out.println("Brumm Brumm");
    }
}
