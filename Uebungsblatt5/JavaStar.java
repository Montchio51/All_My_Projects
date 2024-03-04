package Uebungsblatt5;

public class JavaStar {
    private int weightBackbord;
    private int weightSteuerbord;
    private int weightMitte;
    private int [] container;

    public JavaStar(int [] container, int weightBackbord, int weightSteuerbord, int weightMitte){
        this.weightMitte = weightMitte;
        this.container= container;
        this.weightBackbord = weightBackbord;
        this.weightSteuerbord = weightSteuerbord;
    }
    public boolean existsTotalBalance(int [] container, int weightBackbord, int weightSteuerbord,int position ){
        if (position == container.length){
            return weightBackbord - weightSteuerbord==0;
        }else {
            if (existsTotalBalance(container,weightBackbord+container[position], weightSteuerbord - container [position],position+1)){
                return true;
            }
            return existsTotalBalance(container,weightBackbord - container [position], weightSteuerbord +container[position],position+1);
        }
    }
    public boolean existsBalanceWith3Limited (int [] container, int weightBackbord, int weightSteuerbord, int weightMitte,int position){
        if (position == container.length){
            return weightBackbord- weightSteuerbord-2*weightMitte ==0;
        } else {
            if (existsBalanceWith3Limited(container, weightBackbord + container [position], weightSteuerbord - container [position], weightMitte - container [position], position+1)){
                return true;
            } else if (existsBalanceWith3Limited(container, weightBackbord - container [position], weightSteuerbord + container [position], weightMitte - container [position], position+1)){
             return true;
            }
            return existsBalanceWith3Limited(container, weightBackbord - container [position], weightSteuerbord - container [position], weightMitte + container [position], position+1);
        }
    }
    public void schow (){
        System.out.println(existsBalanceWith3Limited(container,weightBackbord, weightSteuerbord, weightMitte, 0));
    }
}
