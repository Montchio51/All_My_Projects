public class Matrix {

    public static boolean isSquare( int [][] matrix){
        // WIr gehen davon aus, dass zweidimensionale Arrays immer rechtseckig sind. Deswegen matrix.[0]
        if (matrix.length == matrix[0].length) return true;
        return false;
    }
    public static void scalMult (int [][] matrix, int k){
        for (int i =0; i < matrix.length;i++){
            for (int j =0; j<matrix[0].length; j++){
                matrix[i][j] *=k;
            }
        }
    }
    public static int [] estractDiagonal (int [][] matrix){
        int m= 0;
        int [] arr = new int [matrix.length];
        for (int i =0; i < matrix.length;i++){
            for (int j =0; j<matrix[0].length; j++){
                if (i==j){
                    arr [m]= matrix[i][j];
                    m++;
                }
            }
        }
        return arr;
    }

}
