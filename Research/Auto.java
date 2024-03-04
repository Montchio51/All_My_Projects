package Research;

public class Auto {
    public static void main (String [] args){
        Deutschland Mercedes = new Deutschland("mercedes", "Schwarz", "Sandero", 2020, true );
        Deutschland Audi = new Deutschland("audi", "Weiß", "A", 2021, false );
        Deutschland VW = new Deutschland("VW", "rot", "atlas", 2021, true );

        Deutschland[] array = {Mercedes, Audi, VW};

        Mercedes.fahren();
    }
}
