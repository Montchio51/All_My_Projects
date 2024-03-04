package Research;
import  java.util.Random;

public class GameOfLife {
    boolean[][] population = new boolean[10][10];
    public GameOfLife(){

    }
    public boolean nextState (int i, int j) {
        int counter = 0;
        if (population[i][j]){
            if (population[i][j-1]) ++counter;
            if (population[i][j+1]) ++counter;
            if (population[i-1][j]) ++counter;
            if (population[i-1][j-1]) ++counter;
            if (population[i-1][j+1]) ++counter;
            if (population[i+1][j+1]) ++counter;
            if (population[i+1][j]) ++counter;
            if (population[i][j-1]) ++counter;
            return (counter ==2 || counter ==3);

        } else {
            if (population[i][j-1]) ++counter;
            if (population[i][j+1]) ++counter;
            if (population[i-1][j]) ++counter;
            if (population[i-1][j-1]) ++counter;
            if (population[i-1][j+1]) ++counter;
            if (population[i+1][j+1]) ++counter;
            if (population[i+1][j]) ++counter;
            if (population[i][j-1]) ++counter;
            return  counter ==3;
        }
    }
    public void nextGeneration (){
        int i= 1,j =1;
        boolean[][] newpopulation = new boolean[population.length][population.length];
        while (i < population.length-1) {
            while (j < population[i].length-1) {
                if (nextState(i,j)) {
                    newpopulation [i][j] = true;
                }
                j++;
            }
            j=1;
            i++;
        }
        for (int k = 1; k < newpopulation.length; k++) {
            for (int l = 1; l < newpopulation[k].length; l++) {
                population [k][l] = newpopulation [k][l];
            }
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void futureGeneration (int n){
        while(n>=0) {
            for (int x = 1; x < population.length - 1; x++) {
                for (int y = 1; y < population[x].length -1; y++) {
                    if (population[x][y]) {
                        System.out.print("❤️");

                    }
                    else{
                        System.out.print("🖤");
                    }
                    if (y == population[x].length-2) System.out.println();
                }
            }
            --n;
            nextGeneration();
        }
    }
    public void schow(){
        for (int i = 0; i < population.length; i++) {
            for (int j = 0; j < population[i].length; j++) {
                Random ran = new Random();
                int v = ran.nextInt(2);
                if (v==0)population[i][j] = false;
                else population[i][j] = true;
            }
        }
       futureGeneration(10);
    }
}
// Thread.sleep(Zahl in millisekunde);
