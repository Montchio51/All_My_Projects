package Praktika;

public class Quersumme {
    public static int digitSum (int n){
        int temp = n%10;
        if (n>10){
            n/=10;
            temp += digitSum(n);
        }
        return temp;
    }
    public static void main (String [] args){
        System.out.println(digitSum(450));
    }
}
