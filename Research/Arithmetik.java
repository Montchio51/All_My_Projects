import java.util.Scanner;

public class Arithmetik {

    public static int addition(int x, int y){
        if (y>0){
            y--;
            x++;
            return addition(x,y);
        }
        if (y<0){
            y++;
            x--;
            return addition(x,y);
        }

        return x;
    }

    public static int substraction(int x, int y){
    if (y>0){
        y--;
        x--;
        return substraction(x,y);
    }
    if (y<0){
        y++;
        x++;
        return substraction(x,y);
    }
        return x;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        System.out.println("Wählen Sie 1(addition) 2(Substraction): ");
        int op = scan.nextInt();
        if(op==1){
           System.out.println(addition(x,y));
        }
        if (op==2){
           System.out.println(substraction(x,y));
        }
    }
}
