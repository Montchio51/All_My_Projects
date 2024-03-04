package BinaereSuche;

public class Huffman {
    //Attribute
    private  int sum;
    private Huffman[] huff;
    private Triple triple;
    private Huffman leftHuff, rightHuff;

    //Konstruktoren
    public Huffman (Triple [] trip){
        huff = builbHuffArr(trip);
    }
    public Huffman(Triple tocodded, Huffman leftHuff, Huffman righthuff){
        triple = tocodded;
        this.leftHuff = leftHuff;
        this.rightHuff = righthuff;
    }
    public Huffman (int sum, Huffman left, Huffman right){
        this.sum = sum;
        this.leftHuff = left;
        this.rightHuff = right;
    }

    //Methoden
    public boolean isEmpty (){
        return triple == null;
    }
    public Triple getTriple (){
        return triple;
    }
    public boolean isLeaf (){
        return triple != null & leftHuff == null & rightHuff == null;
    }
    public Huffman [] builbHuffArr (Triple [] arr){
        Huffman [] table = new Huffman[arr.length];
        for (int i =0; i< arr.length; i++){
            table [i] = new Huffman(arr[i],null,null);
        }
        Huffman go = buidBaum(table);
        this.rightHuff = go.rightHuff;
        this.leftHuff = go.leftHuff;
        this.sum = go.getSum();
        return table;
    }
    public int getSum(){
        return sum;
    }
    public Huffman buidBaum (Huffman [] tab){
        for (int j=1; j< tab.length; j++){
            tab [j] = new Huffman(new Triple(' ', tab[j-1].getTriple().getCount()+tab[j].getTriple().getCount(),""), tab[j-1],tab[j]);
            tab = huffInsertionSort(tab,j);
        }
        tab[tab.length-1].encoded("");
        return tab[tab.length-1];
    }
    public Huffman[] huffInsertionSort(Huffman[] arr, int positon){
        for (int i = positon+1; i<arr.length; i++){
            if (arr[positon].getTriple().getCount()>arr[i].getTriple().getCount()){
                Huffman temp = arr[i];
                arr[i] = arr[positon];
                arr [positon] = temp;
            }else {
                break;
            }
        }
        return arr;
    }
    public void encoded (String code){
        if (!isEmpty()) {
            if (isLeaf()) {
                triple.setCode(code);
            } else {
                if (!leftHuff.isLeaf()) {
                    leftHuff.encoded(code + "0");
                } else if (!rightHuff.isLeaf()) {
                    rightHuff.encoded(code + "1");
                }
            }
        }
    }
    public void schow (){
        if (!isEmpty()) {
            if (isLeaf()) {
                System.out.println(triple.getCode());
            } else {
                if (!leftHuff.isLeaf()) {
                    leftHuff.schow();
                } else if (!rightHuff.isLeaf()) {
                    rightHuff.schow();
                }
            }
        }
    }
}
