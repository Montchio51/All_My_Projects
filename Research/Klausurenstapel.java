public class Klausurenstapel {

    public static boolean writtenBoth (int[] exam1,int[] exam2){
        for (int i =0; i<exam1.length; i++){
            for (int j =0; j<exam2.length; j++){
                if (exam1[i]==exam2[j]) return true;
            }
        }
        return false;
    }
    public static boolean notWrittrnBoth (int[] exam1,int[] exam2){
        if (writtenBoth(exam1,exam2))return false;
        else return true;
    }
    public static int countWrittenBoth (int[] exam1,int[] exam2){
        int counter =0;
        for (int i =0; i<exam1.length; i++){
            for (int j =0; j<exam2.length; j++){
                if (exam1[i]==exam2[j]) counter++;
            }
        }
        return counter;
    }
    public static boolean biggerthan (int[] exam1,int[] exam2){
        for (int i =0; i<exam1.length; i++){
            for (int j =0; j<exam2.length; j++){
                if (exam1[i]< exam2[j]) return false;
            }
        }
        return true;
    }
}
