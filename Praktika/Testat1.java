package Praktika;

public class Testat1 {
    public static double computeEuler(int n){
        double e=0.0;
        int produit =1;
        for (int i=1; i<=n; i++){
            e += 1.0/produit;
            produit*=i;
        }
        return e;
    }
    public static int countNegatives (int[] arr){
        int counter=0;
        for (int i : arr) {
            if (i < 0) counter++;
        }
        return counter;
    }
    public static int sumUpNegatives ( int[] arr){
        int sum=0;
        for( int i =0; i<arr.length; i++){
            if (arr[i]<0) sum+=arr[i];
        }
        return sum;
    }
    public int maximun (int[] arr) {
        int maxValue = 0;
        for (int i =0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) maxValue = arr[i + 1];
        }
        return maxValue;
    }
    public  int countMaximun(int[] arr){
        int counter = maximun(arr);
        for (int i : arr){
            if (arr[i] == counter) counter++;
        }
        return  counter;
    }
    public boolean isSorted (int[] arr){
        int i =0;
        while (arr [i]<arr.length-1){
            if (arr[i]>arr[i+1]) return false;
            i++;
        }
        return true;
    }
    public boolean checkArray (int[] arr){
        int i=0, j= arr.length;
        while (i<=arr.length/2 & j >arr.length/2){
            if (arr[i]!= arr[j]) return false;
            ++i;
            --j;
        }
        return true;
    }
    public int[] increaseArray (int [] arr, int z){
        for (int i= 0; i<arr.length; ++i){
            arr[i]+=z;
        }
        return arr;
    }
    public static int[] copyAndInvert (int arr[]){
        for (int i=0; i< (arr.length/2); i++){
            int tempValue = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = tempValue;
        }
        return arr;
    }
    public static int [] addArrays (int[] arr1, int[] arr2){
        if (arr1.length == arr2.length){
            int [] arr12 = new int[arr1.length];
            for (int i=0; i<arr12.length; i++){
                arr12[i] = arr1[i] + arr2[2];
            }
            return arr12;
        }
        else {
            return new int[0];
        }
    }
    public static int countSequences(int[] arr){
        int count=0;
        if (arr[0] !=0){
            count++;
        }
        for (int i = 0; i < arr.length-1 ; i++) {
                if (arr[i] == 0) {
                    if (arr[i + 1] != 0) {
                        count++;
                    }
                }
        }
         return count;
    }
    public static void main (String [] args){
        int [] arr = { 80,-7,1,56,-11,-72,0,37};
        for (int i=0 ; i< arr.length; i++){
            System.out.print (arr[i] + " ");
        }
        System.out.println();
        int [] table = copyAndInvert(arr) ;
        for (int j = 0; j < arr.length; j++) {
            System.out.print (table[j] + " ");
        }
        System.out.println();
        System.out.println(computeEuler(8));
    }
}
