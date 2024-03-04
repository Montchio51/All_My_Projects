public class Tableau {
    public static void main (String[] args) {
        int[] a = {14, 45, 18, 3, 14, 19, 23};
        int n = a.length;
        int i = 0;
        int weiter = a[i];
        while (i<n){
            if (weiter > a[i]){
                weiter = a[i];
            }
            i++;
        }
        System.out.println(weiter);
    }
}
