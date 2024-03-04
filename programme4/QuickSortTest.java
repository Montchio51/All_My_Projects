package programme4;

public class QuickSortTest
{
    public static void main( String[] args )
    {
        LectureWithSortAlgorithms dap1 = new LectureWithSortAlgorithms( "DAP 1", 10 );
        dap1.add( new Student( "A", "Inf", 4 ) );
        dap1.add( new Student( "C", "M", 20 ) );
        dap1.add( new Student( "B", "Inf", 8 ) );
        dap1.add( new Student( "E", "M", 40 ) );
        dap1.add( new Student( "B", "Inf", 37 ) );
        dap1.add( new Student( "D", "Ph", 22 ) );
        dap1.add( new Student( "F", "Inf", 6 ) );
        dap1.add( new Student( "B", "Inf", 17 ) );
        dap1.add( new Student( "B", "Inf", 18 ) );
//         dap1.add( new Student( "A", "Inf", 11 ) );
//         dap1.add( new Student( "C", "M", 3 ) );
//         dap1.add( new Student( "B", "Inf", 14 ) );
//         dap1.add( new Student( "B", "M", 8 ) );
//         dap1.add( new Student( "B", "Inf", 22 ) );
//         dap1.add( new Student( "D", "Ph", 19 ) );
//         dap1.add( new Student( "F", "Inf", 4 ) );
//         dap1.add( new Student( "E", "Inf", 7 ) );
        dap1.show();
        System.out.println();
        System.out.println("sorted by number:");
        dap1.quickSortByNumber();
        System.out.println();
       dap1.show();
        System.out.println();
        System.out.println("sorted by name:");
        dap1.quickSortByName();
        dap1.show();
        System.out.println();
    }
}