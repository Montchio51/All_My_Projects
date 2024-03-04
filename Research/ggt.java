import java.util.Scanner;

public class ggt {
   public static int ggt (int a, int b){

        if ((a>b) && (b>1)){
          return  ggt(a-b,b);
        }
        if ((b > a) && (a > 1)) {
               return ggt(a, b - a);
        }
        if (a == b) {
                    return a;
        }
        return 1;
    }

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        long sTime = System.currentTimeMillis();
        System.out.println(ggt(a,b));
        long eTime = System.currentTimeMillis();
        System.out.println(eTime-sTime);
    }
}