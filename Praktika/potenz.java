package Praktika;

public class potenz {
    public static int power (int a, int n){
        if (n==0) return 1;
        int potenz =a;
        if (n>0){
            --n;
            potenz *= power (a,n);
        }
        return potenz;
    }
    public static void main (String [] args){
        System.out.println(power(3,3));
    }
}
