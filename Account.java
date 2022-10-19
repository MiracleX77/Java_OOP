public class Account {
    private String id;
    private String name;
    private int balance=0;

    public Account(String i,String n){
        id=i;
        name=n;
    }
    public Account(String i,String n,int b){
        id=i;
        name=n;
        balance=b;
    }
    public String getID(){
        return id;
    }
    public String getName(){
        return name;
    } 
    public int getBalance(){
        return balance;
    }
    public int credit(int amount){
        balance+=amount;
        return balance; 
    }
    public int debit(int amount){
        if (amount<=balance){
            balance=balance-amount;
            return balance;
        }
        else{
            System.out.println("Amount exceeded balance");
            return balance;
        }
    }
    public int transferTo(Account another,int amount){
        if (amount<=balance){
            balance=balance-amount;
            another.balance=another.balance+amount;
            return balance;
        }
        else{
            System.out.println("Amount exceeded balance");
            return balance;

        }
    }
    public String toString(){
        return "Account[id= "+id+",name="+name+",balance="+balance+"]";
    }
}
