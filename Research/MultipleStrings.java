public class MultipleStrings {
    private String [] texts;

    public MultipleStrings(int n){
        texts = new String[Math.abs(n)];
    }

    public boolean addAtPosition(String s, int p){
        if (p>=0 & p< texts.length){
            texts[p] = s;
            return true;
        }else return false;
    }
    public int size(){
        int counter=0;
        for (int i=0; i< texts.length; i++){
            if (texts[i] != null) ++counter;
        }
        return counter;
    }
    // For each (int i : texts )?
    public int atEnd (String end){
        int counter=0;
        for (int i = 0; i< texts.length; i++){
            if (texts[i].compareToIgnoreCase(end)==0){
                ++counter;
            }
        }
        return counter;
    }
    public boolean inAll(char ch){
        for (int i=0; i<texts.length; i++){
            for (int j=0; j<texts[i].length(); j++){
                if (ch == texts[i].charAt(j)) return true;
            }
        }
        return  false;
    }
    public void replace (char ch, char rep){
        for (int i=0; i<texts.length; i++){
            for (int j=0; j<texts[i].length(); j++){
                if (texts[i].charAt(j)== ch) ch=rep;
                
            }
        }
    }
}
