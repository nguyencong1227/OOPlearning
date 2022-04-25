// A correct implementation of a producer and consumer.
import java.util.Scanner;


class Sender implements Runnable {
 Account acc;
 Thread t;
 Scanner sc;
 Sender(Account acc) {
 this.acc = acc;
 t = new Thread(this, "Sender");
 sc = new Scanner(System.in);
 }
 public void run() {
 
 while(true) {
 
 int amount =sc.nextInt();
 acc.deposit(amount);

 }
 }
}
class Receiver implements Runnable {
 Account acc;
 Thread t;
 //Scanner sc;
 Receiver(Account acc) {
 this.acc = acc;
 t = new Thread(this, "Receiver");
// sc= new Scanner(System.in);
 }
 public void run() {
 
 while(true) {
  //int amount =sc.nextInt();
 int i=acc.withdraw();
 }
 }
}
public class BankingTest {
 public static void main(String[] args) {
 Account acc = new Account(8000);
 System.out.println("Initial balance:");
 acc.display();
 Sender s = new Sender(acc);
 Receiver r = new Receiver(acc);
 // Start the threads.
 s.t.start();
 r.t.start();
 System.out.println("Press Control-C to stop.");
 }
}
