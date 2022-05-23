public class BankAccountDemo {
    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount("John",5000);

        BankAccount shivAccount = new BankAccount("Shiva",600000);

        shivAccount.deposit(3000);

        myAccount.withdraw(400000);

        System.out.println("owner "+shivAccount.getOwner() + " balance in account "+ shivAccount.getBalance());

        System.out.println("owner  "+myAccount.getOwner()+  " balance in bank account "+myAccount.getBalance());
    }

}
