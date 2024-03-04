import java.util.Random;

public class GanzBerechnung {

    public static int remainder (int dividend, int divisor){

        return dividend-(divisor * (dividend/divisor));
    }
    public static int is0dd(int value){
        if (value - (2*(value/2)) !=0) return 1;
        else return 0;
    }
    public static int isEven (int value){
        if (is0dd(value) == 1) return 0;
        else return 1;
    }
    public static int toEven (int value) {
        if (isEven(value) == 0) return value+1;
        else return value;
    }
    public static int isDivisible (int dividend, int divisor1, int divisor2){
        Random radom = new Random();
        if (remainder(dividend,divisor1) ==0 && remainder(dividend,divisor2)==0) return 0;
        else return radom.nextInt(9) + 1;
    }
}
