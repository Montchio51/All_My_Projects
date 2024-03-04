package Uebungsblatt5;

public class Mainaddi {
    public static void main (String [] args){
        int [] values= {1,2,3,2};
        int position=0;
        int result=0;
        String exp="";
        additionSubstrationAusdruecken test1 = new additionSubstrationAusdruecken(values,position,result,exp);
        test1.schow();
    }
}
