public class MainGetSet {

    public static void main (String[] args){
        GEtSet ebene1 = new GEtSet("Asus", "shwarz", 4, true);
        GEtSet ebene2 = new GEtSet("Lenovo", "grau", 1, false);
        System.out.println(ebene1.getMarke());
        ebene2.setFunktionniert(true);
        System.out.println(ebene2.getFunktionniert());
        ebene2.setFarbe("Weiß");
        System.out.println(ebene2.getFarbe());

    }
}
