import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class President {

    public static void main (String [] args){
        File datei = new File("pesidents.txt");
        System.out.println(datei.isFile());
        Scanner scan = null;
        try {
            scan = new Scanner(datei);
        } catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        while (scan.hasNext()) {
            System.out.println(scan.nextLine());
        }
    }
}
