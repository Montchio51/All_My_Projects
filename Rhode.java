package Bank;
import java.util.*;

public class Rhode implements Compare {
    //Attribute
    private String oldName;
    private int oldId;

    //Constructor
    Rhode (String accountHolder, int accountId){

    }

    //Methoden
    public boolean compareInt(int accountId){
        return oldId == accountId;
    }
    public boolean compareString(String accountHolder){
        return oldName.equals(accountHolder);
    }

    public void checkHolder(){
        //SQL
    }
    public void checkId(){

        //SQL
    }
}
