package UebBlatt11_Strategies;

public class CountXStrategy <Integer> extends  DoublyLinkedList.InspectionStrategy<Integer>{
    private Integer toInspect;
    private int sum;

    public CountXStrategy (Integer toInspect){
        this.toInspect = toInspect;
        sum =0;
    }
    public void inspect (Integer ref){
        if (ref.equals(toInspect)){
            sum++;
        }
    }
    public int getSum(){
        return sum;
    }
}
