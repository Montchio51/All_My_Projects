package UebungsBlatt12;

import java.util.LinkedList;
import java.util.List;

public class SimpleHashTable<T> {
    List<T>[] table;
    int capacitity;
    int size;
    @SuppressWarnings({"unchecked"})
    public SimpleHashTable (int c){
        if (c>0) {
            capacitity = c;
        } else {
            throw new IllegalArgumentException();
        }
        size =0;
        table = new LinkedList [capacitity];
    }
}
