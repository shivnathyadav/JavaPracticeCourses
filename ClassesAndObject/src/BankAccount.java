public class BankAccount {
    private String owner;
    private int balance;

    public BankAccount(String owner){
        this(owner,0);
    }

    public BankAccount(String owner, int balance) {
        this.owner=owner;
        this.balance=balance;
    }
    public void deposit(int amount){
        if(amount>0){
            balance+=amount;
        }
        else
        {
            System.out.println("amount deosit should be greater tham 0");
        }
    }
    public void withdraw(int amount){
        if(amount > 0 && amount<=balance){
            balance-=amount;
        }
        else{
            System.out.println("amount withdraw is greate tham bank amount");
        }
    }

    public int getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }
}
