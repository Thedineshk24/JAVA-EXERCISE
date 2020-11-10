public class BankApp {
    // blue print off program
    int Age;
    String name;
    double Amount;
    int tax;

    // constructor
    public BankApp(String name){
        this.name = name; // this always refer to class so here this.name = class BankApp name variable;
        System.out.println("constructor called");
    }

    public void taxInfo(int tax){
        this.tax = tax;
    }

    public void age(int Age){
        this.Age = Age;
    }

    public void getAmount(double Amount){
        this.Amount = Amount;
    }

    public void printInfo(){
        // this.name is equal to name, and other's var work same way they access global var.
        System.out.println("Name :- "+ this.name);
        System.out.println("Age :- " + this.Age);
        System.out.println("Balance in your account is: "+this.Amount);
    }
}

// multileval inheritance
//class newBankAppVersion extends BankApp{
//    public newBankAppVersion(String name){
//        super(name);
//    }
//}

