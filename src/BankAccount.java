public class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount){
        balance+=amount;
        System.out.println("The account replenished by "+amount);
    }

    void withdraw(double amount){
        if(balance>amount){
            balance-=amount;
            System.out.println(amount+" was debited from the account");
        }
        else{
            System.out.println("There are not enough funds in the account to complete the transaction.");
        }
    }

    void printBalance(){
        System.out.println("Account balance: "+balance);
    }
}
