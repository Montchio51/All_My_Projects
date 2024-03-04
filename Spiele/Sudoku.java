package Spiele;
import java.util.Random;

public class Sudoku {
    private int [][] table;
    Random ran = new Random();

    public Sudoku (int [][] table){
        this.table = table;
    }
    public int [][] fill () {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = ran.nextInt(9) + 1;
            }
        }
        if (testLine() & testSquare() & testColumn()) {
            return table;
        } else {
            return fill();
        }
    }
    public boolean testLine(){
        int [] arr = {1,2,3,4,5,6,7,8,9};
        for (int i = 0; i< table.length; i++){
            for (int j = 0; j< table[i].length; j++){
                int count =0;
                for (int k = 0; k< arr.length; k++){
                    if (arr [k] == table[i][j]){
                        count++;
                    }
                }
                if (count !=1){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean testSquare (){
        int [] arr = {1,2,3,4,5,6,7,8,9};
        for (int i = 0; i< table.length; i++){
            for (int j = 0; j< table[i].length; j++){
                int count =0;
                for (int l = i; l<i+2; l++) {
                    for (int m =j; m<j+2; m++) {
                        for (int k = 0; k < arr.length; k++) {
                            if (arr[k] == table[l][m]) {
                                count++;
                            }
                        }
                        if (count != 1) {
                            return false;
                        }
                    }
                }
                j=+2;
            }
            i+=2;
        }
        return true;
    }
    public boolean testColumn(){
        int [] arr = {1,2,3,4,5,6,7,8,9};
        for (int i = 0; i< table[i].length; i++){
            for (int j = 0; j< table.length; j++){
                int count =0;
                for (int k = 0; k< arr.length; k++){
                    if (arr [k] == table[i][j]){
                        count++;
                    }
                }
                if (count !=1){
                    return false;
                }
            }
        }
        return true;
    }
    public void schow (){
        for (int i = 0; i< table.length; i++){
            for (int j = 0; j< table[i].length; j++){
                System.out.println(table[i][j]);
            }
        }
    }
}
