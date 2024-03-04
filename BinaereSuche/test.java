package BinaereSuche;

public class test {
    // Die Idee habe ich aus der Vorlesung, aber alles, was hier habe ich selber programmiert.
    // Die Klasse BinaererBaum hilft dabei eine Liste der zu Kodierenden Character von einem Text zu erstellen.
    // Die Klasse BinaererBaum erstellt einen binären Baum mithilfe einer dynamischen Datenstruktur.
    // Die Klasse Huffman erstellt die Kodierung. Dies nach dem Algorithmus von Huffman.
    // Man kann also nach einem bestimmten Character Suchen, und auch nach seiner Häufigkeit
    public static void main (String [] args){
        String str = "halloween";
        //abcdefghijklm
        Triple triple = new Triple(str.charAt(0), 0, "");
        BinaererBaum baum = new BinaererBaum(triple);
        for (int i=0; i<str.length(); i++){
            baum.einfuegen(new BinaererBaum(new Triple(str.charAt(i))));
        }
        Triple [] trip = new Triple[baum.size()];
        int i =0;
        while (i< trip.length){
            Triple toAdd = baum.search(new Triple(str.charAt(i)));
            for (int j = 0; j< trip.length; j++){
                if (trip [j]!=null && toAdd.compareTriple(trip[j])!=0){
                    trip [i] = toAdd;
                    i++;
                    break;
                }else if (trip [j] == null){
                    trip [i] = toAdd;
                    i++;
                    break;
                }
            }
        }
        for (int k =0; k< trip.length; k++){
            System.out.println(trip[k].getCount());
        }
        Huffman huff = new Huffman(trip);
        huff.schow();
    }
}
