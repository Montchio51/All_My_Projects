public class AnlyseFeld {

    public static boolean twotimes ( int [] arr){
        int counter =0;
        for (int i =0; i< arr.length; i++){
            for (int j =0; j< arr.length; j++){
                if (arr[i] == arr[j]){
                    counter ++;
                }
            }
            if (counter !=2){
                return false;
            }
            counter =0;
        }
        return true;
    }
    public static void main (String [] args){
        int [] table = new int []{1,2,3,5,5,3,2,1};
        System.out.println(twotimes(table));
    }
}
