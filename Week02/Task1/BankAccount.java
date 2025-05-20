import java.util.Scanner;
public class BankAccount {

     private String  accountNumber,accountHolderName;
     private double balance;
     BankAccount(String accountNumber,String accountHolderName,double balance){
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        this.balance=balance;
     }
        public void deposit(int deposit){
            balance=balance+deposit;
        }
        public void withdraw(int withdraw){
            if(balance>=withdraw)
            balance=balance-withdraw;
            else
            System.out.println("insufficent balance");
        }
        
        public  void display(){
            System.out.println("current balance is "+balance+"\n"+"Account Number "+ accountNumber+"\n"+"Account Holder Name is "+ accountHolderName);
        }
         public String getaccountnumber(){
            return accountNumber;
        }
        public String getaccountHoldername(){
            return accountHolderName;
        }
        public double getbalance(){
            return balance;
        }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     BankAccount obj=new BankAccount("rant12","Rantdev",345648);
     obj.display();
     obj.deposit(5);
     obj.display();
    }
}
