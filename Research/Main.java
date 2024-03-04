package  Research;
public class Main {
    public static void main (String[] args){
        int a =0;
        Hund Laprador = new Hund(4,"laprador", "Schwarz", true);
        Hund Dackel = new Hund(1,"dackel", "braun", false);
        Hund Mops = new Hund(3,"mops", "Weiß", false);

        Hund [] hunde = {Laprador, Dackel, Mops};
        for (int i =0; i<3; i++){
            if (hunde[i].kannPfoteGeben){
                        a++;
            }
        }
        System.out.println(a + " Hund(e) kann (können) Pfoten geben.");
    }
}
    /*String decodedCode= "";
    int i=0;
        while (i < encoded.length()){
        if (!current.isLeaf()) {
        if (encoded.charAt(i) == '0') {
        current.leftChild = leftChild;
        ++i;
        }
        if (encoded.charAt(i) == '1') {
        current.rightChild = rightChild;
        ++i;
        }
        }
        else
        {
        decodedCode= decodedCode + current.content.getToken();
        current=this;
        }
        }
        decodedCode= decodedCode + current.content.getToken();
        return decodedCode;*/