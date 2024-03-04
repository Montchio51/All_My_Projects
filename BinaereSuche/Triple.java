package BinaereSuche;

public class Triple {
    private String code;
    private char zeichen;
    private int count;

    //Konstruktor
    public Triple (char zeichen){
        code = "";
        count =1;
        this.zeichen = zeichen;
    }
    public Triple (char zeichen, int count, String code){
        this.code = code;
        this.count = count;
        this.zeichen = zeichen;
    }
    public Triple (){
        this (' ',0,"");
    }

    //Methoden
    public String getCode(){
        return code;
    }
    public void setCode (String toAdd){
        code +=toAdd;
    }
    public char getZeichen() {
        return zeichen;
    }
    public int getCount() {
        return count;
    }

    public void setCount() {
        count++;
    }
    public int compareTriple (Triple other){
        return getZeichen() - other.getZeichen();
    }
}
