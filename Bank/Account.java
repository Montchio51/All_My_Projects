package Bank;

public class Account {
    private String accountHolder;
    private int accountId;

    public Account(String accountHolder, int accountId) {
        this.accountHolder = accountHolder;
        this.accountId = accountId;
        check(accountHolder, accountId);
    }

    public void check (String accountHolder, int accountId){
        Triton triton = new Triton(accountHolder, accountId);
        triton.check(accountHolder, accountId);
    }
    public int getAccountId() {
        return accountId;
    }
    public String getAccountHolder() {
        return accountHolder;
    }
}
