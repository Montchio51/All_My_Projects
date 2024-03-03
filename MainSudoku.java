package Spiele;

public class MainSudoku {
    public static void main (String [] args){
        int [][]  arr = new int[9][9];
        Sudoku spiel1 = new Sudoku(arr);
        spiel1.fill();
        spiel1.schow();
    }
}
