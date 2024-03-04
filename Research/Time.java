public class Time {
    public static int toSeconds(int hours, int minutes){
        return (hours*3600)+(minutes*60);
    }
    public static void schowTime (int seconds){
        System.out.print(seconds/60 + ":" + seconds%60);
    }
    public static void main (String [] args){
        System.out.print(toSeconds(1,11));
        schowTime(62);
    }
}
