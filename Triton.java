package Bank;
import UebBlatt11_Strategies.*;

public class Triton {
    //Attribute
    String accountHolder;
    int accountId;
    DoublyLinkedList<Account> doublyLinkedList;

    //Constructor
    public Triton (String accountHolder, int accountId){
        this.accountHolder = accountHolder;
        this.accountId = accountId;
        doublyLinkedList= new DoublyLinkedList<>();
        doublyLinkedList.add(new Account(accountHolder, accountId));
    }

    //Methoden
    public void check( String accountHolder, int accountId){
        if (!verify()){
            Rhode rhode = new Rhode(accountHolder, accountId);
            rhode.checkId();
            rhode.checkHolder();
        } else {
            Amphitrite amphitrite = new Amphitrite();
        }
    }
    public boolean verify(){
        int amphiAnger =0;
        Iterator<Account> backwardIterator = doublyLinkedList.iterate();
        while (amphiAnger <3 && backwardIterator.hasNext()){
            amphiAnger++;
            if (backwardIterator.next().getAccountId() == accountId || backwardIterator.next().getAccountHolder().equals(accountHolder)){
                backwardIterator.next();
            }
        }
        return amphiAnger ==3;
    }
    public String getAccountHolder (){
        return accountHolder;
    }
    public int getAccountId(){
        return accountId;
    }
}
