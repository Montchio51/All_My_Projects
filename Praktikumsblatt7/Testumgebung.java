package Praktikumsblatt7;

public class Testumgebung
{
    public static void main( String[] args )
    {
        IntIntPairs testPairs = new IntIntPairs( 20 );
        testPairs.put(7,3); testPairs.put(4,3); testPairs.put(1,-9); testPairs.put(6,6); testPairs.put(2,8); 
        testPairs.put(41,12); testPairs.put(9,-11); testPairs.put(8,12); testPairs.put(5,-60); testPairs.put(14,18); 
        testPairs.put(0,12); testPairs.put(-9,-16); testPairs.put(0,0); testPairs.put(17,32); testPairs.put(1,1);

        System.out.println("Beispiel: " + testPairs.accumulate( (k,v) -> { if (k==0) { return v; } else { return 0; } } ) );

        System.out.print("Beispiel: " + sumUp( testPairs ) ); System.out.println();

        testPairs.accumulate((k,v) -> {if(k%2==0) {return 1;} else {return 0;}});
        testPairs.remove((k,v) -> k==6);
        System.out.println();
        System.out.println();
        System.out.println("\t**Remove if k==6");
        testPairs.show();
        testPairs.manipulate((k,v) ->k+10,(k,v)->v);
        System.out.println();
        System.out.println();
        System.out.println("\t**upgrade the Key´s value to 10");
        testPairs.show();
        IntIntPairs other = testPairs.extract((k,v) -> v%3==0);
        System.out.println();
        System.out.println("\t**Werte in Value durch 3 teilbar");
        other.show();
        System.out.println("\t**bigger than10");
        System.out.println(testPairs.accumulate((k,v) -> {if (v>10) return 1; else return 0;}));
        testPairs.manipulate((k,v) -> {if (v>3) return k+5; else return k;},(k,v) -> v);
        testPairs.show();
        System.out.println(uniqueKey(other,10));
        doubleGreaterN(other,5);
    }
    
    public static int sumUp(IntIntPairs pairs)
    {
        return pairs.accumulate( (k,v) -> { if (k==0) { return v; } else { return 0; } } );
    }
    
     public static void addNToValue( IntIntPairs pairs, int n ) {
        pairs.manipulate((k,v) ->k ,(k,v) -> v+n);
     }

     public static boolean uniqueKey( IntIntPairs pairs, int n ) {
        return pairs.accumulate((k,v) -> {if (k==n) {return 1;} else {return 0;}}) == 1;
     }

     public static void doubleGreaterN( IntIntPairs pairs, int n ) {
        // konnte mit Manip gamacht werden;
         // besser um den Aufwand der Summation zu sparen
         pairs.accumulate((k,v) -> {if (k>n) { pairs.put(k,2*v);
             return 1;} else return 0;});
         pairs.show();
     }

     public static IntIntPairs concat(IntIntPairs first, IntIntPairs second) {
        return first;
     }
}
