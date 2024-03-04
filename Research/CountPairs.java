import java.util.Scanner;

public class CountPairs {
    public static void countpairs (int arr []){
        int counter =0;
        int i =0;
        int j =0;
        int [] table = new int[arr.length];
        while (i<(arr.length-1)) {
            if (arr[i] == arr[i + 1]) {
                counter++;
                table [i] = arr[i];
                table [i+1] = arr[i];
                i = i + 1;
            }
            i++;
        }
        System.out.print ("Besitzt " + counter + " Paare: ");
        while (j<table.length){
            if (table [j] == arr [j] && table [j+1] == arr[j+1]) {
                System.out.print(table[j]);
                System.out.print(table[j + 1] + ", ");
                j+=2;
            } else j++;
        }
    }
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] table = new int[n];
        int j =0;
        for (int i =0; i<table.length; i++){
            System.out.println("geben Sie die " + (i+1) + " ein");
            table [i]= scan.nextInt();
        }
        countpairs(table);
    }
}
