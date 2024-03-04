public class Period {

    //Attributen
    private int minutes;

    //Konstruktoren
    public Period (int Minutes){
        if (Minutes<0) minutes=0; //throw new IllegalArgumentException();
        minutes = Minutes;
    }
    public Period (int Minutes, int hours){
        if (Minutes<0 || hours <0) {
            minutes=0;
            //throw new IllegalArgumentException();
        }
        minutes = Minutes + hours*60;
    }

    //Methoden
    public int getMinutes (){

        return minutes;
    }
    public int getHours() {

        return (minutes/60);
    }
    public int getMinorMinutes (){

        return minutes - getHours()*60;
    }
    public String toString (){

        return getHours()+":"+ getMinorMinutes();
    }
    public Period clone(){

        return new Period(minutes);
    }
    public int change (int Minutes){
        if (Minutes<0) return minutes;
        return Minutes + minutes;
    }
}
