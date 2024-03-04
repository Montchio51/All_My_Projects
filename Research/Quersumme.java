public class Quersumme {

    public static int digitSum(int x){
        int Sum=0;
        if (x<0) x*=-1;
        while (x>=10){
            Sum += (x%10);
            x=(x/10);
        }
        return Sum +x;
    }
    public static void main (String [] args){

        System.out.println(digitSum(-17));
    }

}
