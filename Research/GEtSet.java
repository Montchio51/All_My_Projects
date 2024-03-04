public class GEtSet {
    private String marke;
    private String farbe;
    private int anzahl;
    private boolean funktionniert;

    public GEtSet (String marke, String farbe, int anzahl, boolean funktionniert){
        this.marke=marke;
        this.farbe=farbe;
        this.anzahl=anzahl;
        this.funktionniert=funktionniert;
    }

    public String getMarke() {
        return marke;
    }

    public void setFunktionniert(boolean funktionniert) {
        this.funktionniert = funktionniert;
    }
    public boolean getFunktionniert(){
        return funktionniert;
    }
    public String getFarbe (){
        return farbe;
    }
    public void setFarbe (String farbe){
        this.farbe = farbe;
    }
}
