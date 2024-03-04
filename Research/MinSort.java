public class MinSort {
    static int argMin(int[] arr, int s){
        int minVal = arr[s];
        int minIdx = s;
        int i = s ;
        while (i < arr.length){
            if(arr[i] < minVal){
                minVal = arr[i];
                minIdx = i;
            }
            i++;
        }
        return minIdx;
    }
    static void printArr (int [] arr){
        for (int i =0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String [] args){
        int [] a = {11,7,8,2,15,13,9,19,18,12,5};

        int i=0;
        while (i < a.length){
            int j = argMin(a,i);

            int t = a[i];
            a[i]=a[j];
            a[j]=t;

            i++;
        }

        printArr(a);
    }
}
