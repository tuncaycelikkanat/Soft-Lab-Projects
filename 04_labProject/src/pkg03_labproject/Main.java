
package pkg03_labproject;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        /*
        1. create acc
        2. deposit - no 0
        3. withdraw - no 0 or less than balance
        4. check balance
        5. Exit
        Chose an option: 
        */
        
        BankAccount account = new BankAccount();
        
        Scanner keyb = new Scanner(System.in);
        int option;
        boolean hasAccount = false;
        
        do {
            System.out.println(
                    "1. Create Account\n" +
                    "2. Deposit\n" +
                    "3. Withdraw\n" +
                    "4. Check balance\n" +
                    "5. Exit" );
            System.out.print("Chose an option: ");
            option = keyb.nextInt();
            System.out.println();
            
            if (option == 1) {
                System.out.print("Please enter an account number: ");
                String accountNumber = keyb.next();
                
                System.out.print("Please enter a holder name: ");
                String holderName = keyb.next();
                
                account = new BankAccount(accountNumber,holderName);  
                hasAccount = true;
                
            }
            
            else if (hasAccount && option == 2) {
                System.out.print("Enter deposit number: ");
                account.deposit(keyb.nextInt());
            }
            
            else if (hasAccount && option == 3) {
                System.out.print("Enter withdraw number: ");
                account.withdraw(keyb.nextInt());
            }
            
            else if (hasAccount && option == 4) {
                System.out.printf("Current balance: $%s%n%n",account.getBalance());
            }
            
            else if(option == 5)
            { }
            
            else{
                if (!hasAccount) 
                    System.out.println("Before use this method create an account(1)."); 
                else
                    System.out.println("Enter a valid ");
            }
            
            
        } while (option != 5);
  
    }
    
}
