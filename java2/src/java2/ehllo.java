package java2;





public class ehllo {
int accountNumber;
String Name;
int balance;
public ehllo(int aNumber, String name, int initialBalance) {
// TODO Auto-generated constructor stub
accountNumber=aNumber;
this.Name= name;
this.balance= initialBalance;
}
public void deposit(int amount){
balance+=amount;
}
public void withdraw(int amount) {

balance-=amount;
}
int getBalance(){
return balance;
}

}