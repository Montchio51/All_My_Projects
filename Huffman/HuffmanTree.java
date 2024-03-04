package Huffman;

public class HuffmanTree {
    //Attribute
    private HuffmanTriple content;
    private HuffmanTree leftChlid, rightChlid;

    //Konstruktoren
    public HuffmanTree (HuffmanTree left, HuffmanTree right){
        content = new HuffmanTriple(left.getContent().getValue()+right.getContent().getValue(), ' ');
        leftChlid = left;
        rightChlid = right;
    }
    public HuffmanTree (HuffmanTriple t){
        content = t;
        leftChlid = new HuffmanTree();
        rightChlid = new HuffmanTree();
    }
    public HuffmanTree(){
        content = null;
        leftChlid = null;
        rightChlid = null;
    }

    //Methoden
    public boolean isEmpty (){
        return  content == null;
    }
    public boolean isLeaf(){
        return !isEmpty() && leftChlid.isEmpty() && rightChlid.isEmpty();
    }
    public HuffmanTriple getContent (){
        return  content;
    }
    public int compareTo (HuffmanTree other){
        return content.compareTo(other.content);
    }
    public void genrateCodes (){
        if (!isEmpty() && !isLeaf()){
            leftChlid.content.setCode(content.getCode() + "0");
            rightChlid.content.setCode(content.getCode() + "1");
            leftChlid.genrateCodes();
            rightChlid.genrateCodes();
        }
    }
    public void schowCodes (){
        if (!isEmpty()) {
            if (isLeaf()) {
                System.out.println(content.toString());
            } else {
                leftChlid.schowCodes();
                rightChlid.schowCodes();
            }
        }
    }
}
