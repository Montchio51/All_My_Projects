package UebBlatt11_Strategies;

public class CountInIntervalStrategy<Integer> extends DoublyLinkedList.InspectionStrategy<Integer>{
    private int bottom;
    private int top;
    private int sum;

    public CountInIntervalStrategy (int bottom, int top){
        this.bottom = bottom;
        this.top = top;
        sum =0;
    }

    @Override
    public void inspect(Integer ref) {
        for (int i = bottom; i<top; i++){
            if (ref.equals(i)){
                sum++;
            }
        }
    }
    public int getSum ()
    {
        return sum;
    }
}
