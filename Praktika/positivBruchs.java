package Praktika;

public class positivBruchs {

    public Fraction firstPositive (Fraction [] arr, int i){
        if (i>=0){
            if (arr[i].getNumerator() >0 & arr[i].getDenominator()>0){
                return new Fraction(arr[i].getNumerator(),arr[i].getDenominator());
            }
            --i;
            firstPositive(arr, i);
        }
        return null;
    }
}
