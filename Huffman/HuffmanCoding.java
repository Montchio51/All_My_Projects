package Huffman;

public class HuffmanCoding {
    //Attribut
    private HuffmanTree [] trees;

    //Konstruktor
    public HuffmanCoding (HuffmanTriple [] input){
        if (input.length >1){
            intializeTrees (input);
            buildTree();
            trees [trees.length -1].genrateCodes();
        } else {
            throw new IllegalStateException();
        }
    }

    //Methoden
    public void intializeTrees (HuffmanTriple [] input){
        trees = new HuffmanTree[input.length];
        for (int i = 0; i < input.length; i++) {
            trees[i] = new HuffmanTree(input [i]);
        }
    }
    private void buildTree (){
        for (int i = 0; i+1 < trees.length; i++) {
            insertionSort (i);
            trees [i+1] = new HuffmanTree(trees [i], trees [i+1]);
        }
    }
    private void insertionSort (int i){
        for (int j = i+1; j < trees.length; j++) {
            schiftTrees(j);
        }
    }
    private void schiftTrees (int i){
        if (i< trees.length){
            HuffmanTree toInsert = trees [i];
            int j =i;
            while (j>0 && trees[j-1].compareTo(toInsert) >0){
                trees[j] = trees [j-1];
                j--;
            }
            trees [j] = toInsert;
        }
    }
    public void schowcodeTable (){
        trees[trees.length-1].schowCodes();
    }
}
