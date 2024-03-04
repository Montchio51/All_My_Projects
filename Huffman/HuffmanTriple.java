package Huffman;

public class HuffmanTriple {
    //Attribute
    private String code;
    private char zeichen;
    private int value;

    //Konstructoren
    public HuffmanTriple (int v, char z){
        code = "";
        z = zeichen;
        v = value;
    }
    public HuffmanTriple (char z){
        this (1, z);
    }
    HuffmanTriple (){
        this (0,' ');
    }

    //Methoden

    public int getValue() {
        return value;
    }

    public String getCode() {
        return code;
    }

    public char getZeichen() {
        return zeichen;
    }
    public void setCode(String other){
        code = other;
    }
    public int compareTo (HuffmanTriple other){
        return  value-other.getValue();
    }
    public void incrementQuantity (){

    }
    public String toString(){
        return "zeichen (quantity: " + value + "): "+ zeichen + " -> code: " + code;
    }
}
