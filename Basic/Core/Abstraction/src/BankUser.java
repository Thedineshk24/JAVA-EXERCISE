public abstract class BankUser {
    private int age;
    private String name;
    private int balance;


//    constructor
    public BankUser(int age,String name,int balance){
        this.age = age;
        this.name = name;
        this.balance = balance;
    }

//    getters
    public int age(){
        return this.age;
    }

    public String name(){
        return  this.name;
    }

    public int balance(){
        return  this.balance;
    }

//    setters
    public void getAge(int age){
        this.age = age;
    }

    public void getName(String name){
        this.name = name;
    }

    public void getBalance(int balance){
        this.balance = balance;
    }

//    my method for printing greetings

    public void greet(){
        System.out.println("Hello to "+this.name+ " your balance is "+this.balance);
    }
}
