package Praktika;

public class ermittelnIndex {
    public int getIndex (Fraction [] arr, int i, Fraction x){
        int index=i;
        if (i>=0 & i< arr.length){
            if (arr[i].getNumerator()== x.getNumerator() & arr[i].getDenominator() == x.getDenominator()){

                index = i;
            }
            i--;
            index =  getIndex(arr,i,x);
        }
        return -1;
    }
}
