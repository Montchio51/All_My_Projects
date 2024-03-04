package Uebungsblatt5;

public class additionSubstrationAusdruecken {
    private  int [] values;
    private int position;
    private int result;
    private String exp;

    public additionSubstrationAusdruecken(int [] values, int position, int result, String exp){
        this.values= values;
        this.position= position;
        this.result= result;
        this.exp= exp;
    }
    public boolean addCalcExists (int[] values, int position, int result){
        System.out.println( " " +"r :"+result + " "+ "p :" +position);
        if (position == values.length){
            return result ==0;
        }else {
            if (addCalcExists(values, position+1, result +values[position])) {
                return true;
            }
                return addCalcExists(values, position+1, result -values[position]);
            }
    }
    public String addCalcExp(int[] values, int position, int result, String exp){
       if (position == values.length & result == 0){
           return exp;
       }else {
           return "Calculation Imposible";
            }
    }
    public void schow(){
        System.out.println(backTracking(values, position, result));
    }
    public int backTracking (int [] values, int position, int result){
        if (position == values.length){
            return result;
        } else {
            if (backTracking(values, position+1, result + values[position]) ==0){
                return 0;
            }
            return backTracking(values, position+1, result - values[position]);
        }
    }
}
