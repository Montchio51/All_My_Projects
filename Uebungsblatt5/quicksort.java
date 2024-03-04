package Uebungsblatt5;

public class quicksort {
    private int [] array;

    public quicksort (int [] array){
        this.array= array;
    }

    public void sort (int startIndex, int endIndex ){
        if (startIndex<endIndex) {
            int merker= startIndex;
            for (int i = startIndex; i < endIndex; i++) {
                if (array[i] < array[endIndex]){
                    change(merker,i);
                    ++merker;
                }
            }
            change(merker, endIndex);
            sort(startIndex,merker-1);
            sort(merker+1,endIndex);
        }
    }
    public void change(int zahl1, int zahl2){
        int tempZahl1;
        tempZahl1 = array[zahl1];
        array[zahl1] = array[zahl2];
        array[zahl2] =tempZahl1;
    }
    public void schow (){
        int startIndex=0;
        int endIndex=array.length-1;
        sort(startIndex,endIndex);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
    public int [] getArray(){
        int startIndex =0;
        int endIndex= array.length-1;
        sort(startIndex,endIndex);
        return array;
    }
}
