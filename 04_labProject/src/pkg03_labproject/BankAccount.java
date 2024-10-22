
package pkg03_labproject;


public class BankAccount {
    
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount() {
        
    }
    
    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        balance = 0;
        System.out.printf("Account number: %s%n"
                    + "Account name: %s%n%n",this.getAccountNumber(),this.getAccountHolderName());  
    }
    
    void deposit(double amount){
        if (amount > 0) {
            balance += amount;

            System.out.printf("Deposit: $%.2f%n",amount);
            
            System.out.printf("Account number: %s%n"
                    + "Account name: %s%n"
                    + "Current balance: $%s%n%n",this.getAccountNumber(),this.getAccountHolderName(),this.getBalance());            
        }
        else{
            System.out.println("Deposit amonut cannot be 0 or less than 0.\n");
        }
    }
    
    void withdraw(double amount){
        if (amount < balance && amount > 0) {
            balance -= amount;
            System.out.printf("Withdraw: $%.2f%n",amount);
            System.out.printf("Account number: %s%n"
                    + "Account name: %s%n"
                    + "Current balance: $%s%n%n",this.getAccountNumber(),this.getAccountHolderName(),this.getBalance());
        }
        else if(amount == 0)
            System.out.println("You cannot withdraw 0 money.\n");
        else
            System.out.println("Not enought money.\n");
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
