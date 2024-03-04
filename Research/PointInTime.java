public class PointInTime {
    private int jahresZahl;
    private int tagesNummer;
    private int stundenangabe;

    public PointInTime(int JahresZahl,int TagesNummer,int Stundenangabe){
        if (JahresZahl <=999 || JahresZahl>=10000 || TagesNummer<1 || TagesNummer>365 || Stundenangabe<0|| Stundenangabe>23) throw new IllegalArgumentException();
        jahresZahl=JahresZahl;
        tagesNummer=TagesNummer;
        stundenangabe=Stundenangabe;
    }

    public int getJahresZahl() {
        return jahresZahl;
    }
    public int getTagesNummer() {

        return tagesNummer;
    }
    public int getStundenangabe(){
        return stundenangabe;
    }
    public String toString (){
        return jahresZahl + "/"+ tagesNummer +"/"+ stundenangabe;
    }
    public PointInTime clone (){

        return new PointInTime(jahresZahl,tagesNummer,stundenangabe);
    }
    public PointInTime change (int Stundenangabe){
        if (Stundenangabe<0) return new PointInTime(jahresZahl,tagesNummer,stundenangabe);
        else {
            stundenangabe+=Stundenangabe;
            if (stundenangabe >23){
                tagesNummer = stundenangabe/23;
                stundenangabe %=23;
                if (tagesNummer>365){
                    jahresZahl = tagesNummer/365;
                    tagesNummer%=365;
                    return new PointInTime(jahresZahl,tagesNummer,stundenangabe);
                }
                else return new PointInTime(jahresZahl,tagesNummer,stundenangabe);
            }
            else return new PointInTime(jahresZahl,tagesNummer,stundenangabe);
        }
    }
}
