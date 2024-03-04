package Uebungsblatt5;

public class binaereSuche {
    private int[] array;
    private int candidate;

    public binaereSuche(int [] array, int candidate){
        this.array= array;
        this.candidate= candidate;
    }

    public boolean binarySearchRekursive (int [] sorted, int candidate){
        return binarySearchRekursive( sorted, candidate, 0, sorted.length-1);
    }
    public boolean binarySearchRekursive(int [] sorted, int candidate, int leftElement, int rightElement){
        if (leftElement<rightElement){
            if (sorted[(leftElement+rightElement)/2] ==candidate){
                return true;
            } else if (sorted[(leftElement+rightElement)/2] >candidate) {
                return binarySearchRekursive(sorted,candidate, leftElement, (leftElement+rightElement)/2-1);
            } else {
                return binarySearchRekursive(sorted, candidate, ((leftElement+rightElement)/2) + 1, rightElement);
            }
        }
        return false;
    }
    public boolean binarySearchIterative(int [] sorted, int candidate){
        int leftnumber=0;
        int rightNumber= sorted.length-1;

        while (leftnumber<=rightNumber){
            int middle = (leftnumber+rightNumber)/2;
            if (candidate == sorted[middle]){
                    return true;
            } else if (sorted[middle]>candidate){
                rightNumber= middle+1;
            }else {
                leftnumber = middle-1;
            }
        }
        return false;
    }
    public void schow(){
        //System.out.println(binarySearchRekursive (array,candidate));
        System.out.println(binarySearchIterative(array,candidate));
    }
}
/*int leftNumber=sorted.length/2-1;
        int rightNumber=sorted.length/2+1;
        while (leftNumber>=0 & rightNumber>=1){
            if (candidate == sorted[sorted.length/2]){
                return true;
            }
            if (sorted[leftNumber]>candidate){
                int [] tepmp_arr = new int[leftNumber];
                for (int i=0;i<tepmp_arr.length; i++) {
                    tepmp_arr[i] = sorted[i];
                }
                sorted = tepmp_arr;
                leftNumber=sorted.length/2-1;
                rightNumber=sorted.length-leftNumber+1;
            }else{
                int [] tepmp_arr = new int[sorted.length- rightNumber+1];
                for (int i=0;i< tepmp_arr.length; i++) {
                    tepmp_arr[i] = sorted[rightNumber+i];
                }
                sorted = tepmp_arr;
                leftNumber=sorted.length/2-1;
                rightNumber=sorted.length-leftNumber+1;
            }
        }*/