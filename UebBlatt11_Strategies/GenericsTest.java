package UebBlatt11_Strategies;

public class GenericsTest
{
    public static void main(String[] args)
    {
        test();
    }
    
    public static void test()
    {
        DoublyLinkedList<Integer> ints = new DoublyLinkedList<Integer>();
        ints.add(5);
        ints.add(0);
        ints.add(7);
        ints.add(0);
        ints.add(5);
        ints.add(3);
        ints.add(0);
        ints.add(2);
        ints.showAll();
        System.out.println();
        Iterator<Integer> i = ints.iterator();
        while ( i.hasNext() )
        {
            System.out.print( i.next() + " " );
        }
        System.out.println();
        DoublyLinkedList<Double> doubles = new DoublyLinkedList<Double>();
        doubles.add( 14.1 ); doubles.add( 7.4 ); doubles.add( 2.3 ); doubles.add( 5.0 );
        Iterator<Double> it = doubles.iterator();
        double sum = 0.0;
        while ( it.hasNext() )
        {
            sum += it.next();
        }
        System.out.println( "sum: " + sum );
        //classToCountX<Integer> count = new classToCountX<>(5);
        System.out.println("/////////////");
        OneFollowsZeroStrategy follow = new OneFollowsZeroStrategy();
        ints.insertBehindSelected(follow);
        ints.showAll();
    }
}
