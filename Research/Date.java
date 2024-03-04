public class Date {
    private PointInTime bezeichnung;
    private PointInTime startzeitpunkt;
    private Period dauer;


    public Date (PointInTime Bezeichnung, PointInTime Startzeitpunkt, Period Dauer){
        bezeichnung=Bezeichnung;
        startzeitpunkt=Startzeitpunkt;
        dauer=Dauer;
    }
    public Date (PointInTime Bezeichnung){

        this(Bezeichnung,null,null);
    }
    public Date (PointInTime Bezeichnung, PointInTime Startzeitpunkt ){
        this(Bezeichnung,Startzeitpunkt,null);
    }


    public Date clone (){

        return new Date(bezeichnung,startzeitpunkt,dauer);
    }
    public PointInTime getBezeichnung(){
        return bezeichnung;
    }
    public PointInTime getStartzeitpunkt(){
        return startzeitpunkt;
    }
    public Period getDauer(){
        return dauer;
    }
    public void set (PointInTime Startzeitpunkt, Period Dauer){
        startzeitpunkt = Startzeitpunkt;
        dauer = Dauer;
    }
    public Date change (int Hour){
        if (startzeitpunkt == null || dauer==null){
            System.out.println("Es gibt keinen Startzeitpunkt");
            throw new IllegalArgumentException();
        }
        PointInTime Verschiebung = new PointInTime(0,0,Hour);
        Verschiebung = Verschiebung.change(Hour);
         PointInTime newdate = new PointInTime(startzeitpunkt.getJahresZahl() + Verschiebung.getJahresZahl(), startzeitpunkt.getTagesNummer()+ Verschiebung.getTagesNummer(), startzeitpunkt.getStundenangabe()+ Verschiebung.getStundenangabe());
        return  new Date (bezeichnung,newdate,dauer);
    }
}
