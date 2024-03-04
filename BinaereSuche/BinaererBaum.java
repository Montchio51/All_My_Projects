package BinaereSuche;

public class BinaererBaum {
    private Triple [] toArray;
    private Triple knote;
    private BinaererBaum leftBaum, rightBaum;

    //Konstruktoren
    public BinaererBaum (Triple triple){
        knote = triple;
        leftBaum = null;
        rightBaum = null;
    }
    public BinaererBaum (Triple triple, BinaererBaum leftBaum, BinaererBaum rightBaum){
        knote = triple;
        this.leftBaum = leftBaum;
        this.rightBaum = rightBaum;
    }

    //Methode
    public Triple getKnote (){
        return knote;
    }
    public boolean isEmpty (Triple triple){
        return triple ==null ;
    }
    public boolean isEmpty (){
        return knote ==null & leftBaum == null & rightBaum == null;
    }
    public boolean leftIsEmpty (){
        return leftBaum == null;
    }
    public boolean rightIsEmpty (){
        return rightBaum == null;
    }
    public boolean isLeaf (){
        return knote!=null & leftBaum == null & rightBaum == null;
    }
    public boolean isLeaf1(){
        return knote!=null & leftBaum!= null & rightBaum == null;
    }
    public boolean isLeaf2(){
        return knote!=null & leftBaum== null & rightBaum != null;
    }
    public void einfuegen ( BinaererBaum toAdd){
        if (!toAdd.isEmpty(toAdd.getKnote())){
            if (knote.compareTriple(toAdd.knote) > 0) {
                if (!isEmpty() & !leftIsEmpty()) {
                    leftBaum.einfuegen(toAdd);
                } else if (leftIsEmpty()) {
                    leftBaum = toAdd;
                }
            } else if (knote.compareTriple(toAdd.knote) < 0) {
                if (!isEmpty() & !rightIsEmpty()) {
                    rightBaum.einfuegen(toAdd);
                } else {
                    if (rightIsEmpty()){
                        rightBaum = toAdd;
                    }
                }
            } else if (knote.compareTriple(toAdd.knote) == 0) {
                    knote.setCount();
            } else {
                    new BinaererBaum(knote, leftBaum, rightBaum);
            }
        }else {
            throw new IllegalArgumentException("The value haves to be not null");
        }
    }
    public Triple search (Triple toSearch){
        if (!isEmpty(knote)) {
            if (knote.compareTriple(toSearch) ==0) {
                System.out.println("Zeichen: " + toSearch.getZeichen() + " value: " + knote.getCount());
                return  new Triple(toSearch.getZeichen(), knote.getCount(), "");
            } else {
                if (knote.compareTriple(toSearch) >0){
                        leftBaum.search(toSearch);
                    return  toSearch;
                } else {
                        rightBaum.search(toSearch);
                    return toSearch;
                }
            }
        } else {
            return toSearch;
        }
    }
    public int size(){
        if(isLeaf()){
            return 1;
        }else if (isLeaf1()){
            return leftBaum.size()+1;
        }else if (isLeaf2()){
            return rightBaum.size()+1;
        }else {
            return leftBaum.size()+rightBaum.size()+1;
        }
    }
}
