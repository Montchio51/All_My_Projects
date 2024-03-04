import java.util.Random;

public class Box {
    private double width;
    private double height;
    private double depth;
    Random random = new Random();


    //Konstruktor
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    //Methoden
    public double getWidth (){
        return width;
    }
    public double getHeigth(){
        return height;
    }
    public double getDepth (){
        return depth;
    }
    public double getVolumeSize() {
        return width*height*depth;
    }
    public double getAreaSize() {
        return width*height;
    }
    public double getEdgeLenght() {
        return (width*4)+(height*4)+(depth*4);
    }
    public boolean isCube(){
        return (width==height && height==depth);
    }
    public int compareTo (Box f){
        if (getVolumeSize()> (f.depth*f.width*f.height)) return random.nextInt(8)+1;
        if (getVolumeSize() == (f.depth*f.width*f.height)) return 0;
        return random.nextInt(-8)-1;
    }
    public boolean encloses ( Box f){
        double[] arr1 ={width, height, depth};
        double[] arr2 ={f.width,f.height,f.depth};
        int counter=0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1 [i]>=arr2[j]){
                    counter++;
                }
            }
        }
        return (counter>=2);
    }
}
