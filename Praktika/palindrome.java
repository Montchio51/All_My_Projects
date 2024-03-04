package Praktika;

public class palindrome {
    public static boolean palindromCheck (int [] arr, int i){
        int left =i;
        int right = arr.length-1-i;
        if (left < right){
            if(arr[left] != arr[right]){
                return false;
            }
            i++;
            return palindromCheck(arr,i);
        }
        return true;
    }
    public static void main (String [] args){
        int[] arr={2,5,6,6,6,6,8,2,5,0};
        System.out.println(palindromCheck(arr,0));
    }

}