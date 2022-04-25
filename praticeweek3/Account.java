
import java.util.Scanner;

public class Account  {
  int balance;
  int amount;
  int preTransaction;
  String customerName;
  String customerId;
  boolean valueSet = false;

  Account()
  {
     balance = 6000;
  }
  Account(int b){
      balance = b;
      display();
  }

  //public void run() {
    //  for (int i =1; i <=4; i++) {
      //    deposit(2000);
        //  if (getBalance() < 0 ) {
          //    System.out.println("account is overdrawn!");
         // }
     // }

 // }
  public synchronized void deposit (int amount) {
    while(valueSet)
 try {
 wait();
 } catch(InterruptedException e) {
 System.out.println("InterruptedException caught");
 }
      if (getBalance() >= amount ) {
          System.out.println(Thread.currentThread().getName() + " is going to deposit $ " + amount);
          try {
              Thread.sleep(1000);
          } catch (InterruptedException ex) {
          }
         // withdraw(amount);
            this.amount=amount;
            setBalance(getBalance() + amount);
            display();
          System.out.println(Thread.currentThread().getName() + " completes the deposit of $ " + amount);
      } else {
          System.out.println(" not enought in account for " + Thread.currentThread().getName()
                  + "to withdraw" + getBalance());
      }
     valueSet = true;
 notify();
 //return n;
  }


  public synchronized int getBalance() {
      return balance;
  }
  public synchronized void setBalance(int b){
         balance=b;
  }

  public synchronized int withdraw() {
     while(!valueSet)
 try {
 wait();
 } catch(InterruptedException e) {
 System.out.println("InterruptedException caught");
 }
      if (amount!=0) {
      System.out.println("Going to withdraw $:"+amount);
      setBalance(getBalance() - 2*amount);
      preTransaction = -amount;
      getPreTransaction();
      display();
      }
       valueSet = false;
 notify();
   return amount;
  }

  synchronized void   getPreTransaction()
  {
      if (preTransaction > 0)
      {
          System.out.println("Deposited: " +preTransaction);
      }
      else if (preTransaction < 0) {
          System.out.println("Withdrawn: " + Math.abs(preTransaction));
      }
      else {
          System.out.println("No transaction occured");
      }
  }
  synchronized void display(){
      System.out.println("So du tai khoan la:" +balance);
  }

}




