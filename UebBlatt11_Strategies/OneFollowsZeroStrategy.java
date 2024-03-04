package UebBlatt11_Strategies;

public class OneFollowsZeroStrategy extends DoublyLinkedList.InsertionStrategy<Integer>{

    @Override
    public boolean select(Integer ref) {
        return (int)ref == 0;
    }

    @Override
    public Integer insert(Integer ref) {
        return 1;
    }
}
