package Uebungsblatt4;

public class RingBuffer {
    //attribut
    private  Student [] arr;

    //Konstruktor
    public RingBuffer (int n){
        arr = new Student [n];
    }

    //Methoden
    public Student pop (){
        Student oldest = arr [0];
        arr [0] = null;
        for (int i =1; i<arr.length; i++){
            arr [i-1] = arr [i];
        }
        arr [arr.length - 1] = null;
        return  oldest;
    }
    public Student peek (){
        return  arr [0];
    }
    public void push (Student s){
        int j =0;
        for (int i = j; i< arr.length; i--){
            if (arr [i] == null){
                arr[i] = s;
                break;
            }
            j++;
        }
        if (j == arr.length & arr [j -1] != null){
            throw new RuntimeException();
        }
    }
    public int size (){
        return arr.length;
    }
    public int countElements (){
        int Ringpuffers =0;
        for (int i =0; i< arr.length; i++){
            if (arr [i] != null) Ringpuffers++;
        }
        return Ringpuffers;
    }
}
