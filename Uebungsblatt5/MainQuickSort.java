package Uebungsblatt5;

public class MainQuickSort {
    public static void main (String[] args) {
        int[] zahlenFolge1 = { 19, 17, 15, 11, 10, 7, 6, 5, 3};
        int[] zahlenFolge2 = {3 ,5 ,6 ,7 ,10 ,11 ,15, 17, 19};
        binaereSuche suche1 = new binaereSuche(zahlenFolge2,5);
        binaereSuche suche2 = new binaereSuche(zahlenFolge2,15);
        //suche1.schow();
        suche2.schow();
        quicksort Quick = new quicksort(zahlenFolge1);
        Quick.schow();
    }
}
