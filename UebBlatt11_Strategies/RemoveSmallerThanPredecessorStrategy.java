package UebBlatt11_Strategies;

public class RemoveSmallerThanPredecessorStrategy<Integer> extends DoublyLinkedList.DeletionStrategy<Integer>{
    Integer temp;
    int i;
    public RemoveSmallerThanPredecessorStrategy(){
        i=0;
        temp = null;
    }

    @Override
    public boolean select (Integer ref){
        if (i!=0){
            if((int)ref<(int)temp){
                temp = ref;
                return true;
            }
        }
        i++;
        temp = ref;
        return false;
    }
}
