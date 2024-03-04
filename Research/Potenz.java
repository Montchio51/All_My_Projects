import java.util.Scanner;

public class Potenz {

    /*public static double power (double a, double i, double y, double x){
        if (i<y){
            i++;
            a*=x;
            return power(a,i,y,x);
        }
        if (i>y){
            i--;
            a=(1/x);
            return power(a,i,y,x);
        }

        return a;
    }*/

    public static int power(int x, int y){
        int a = x;
        int i =1;
        while (i<y){
            a*=x;
            i++;
        }
        return a;
    }

    public static int expo (int x, int y){
        int i=1;
        int a=x;
        int c=x;
        while (i<y){
            for(int j =1; j <c; j++){
                a+=x;
            }
            i++;
            x=a;
        }

        return a;
    }

    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();

        /*a = power(a, i, y, x);*/

        System.out.println(expo(x,y));
    }
}
