public class MainBox {
    public static void main (String [] args){
        Box k = new Box(10,31,2);
        Box f = new Box(30,20,10);

        System.out.println(f.encloses(f));
    }
}
