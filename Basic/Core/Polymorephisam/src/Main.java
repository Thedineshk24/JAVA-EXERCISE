class BankUser {
    private String name;
    public BankUser(String name){
        this.name = name;
    }

    public String greet(){
        return "Default greeting...";
    }
}

class Sbi extends BankUser{
    public Sbi(){
        super("Sbi Bank");
    }

    @Override
    public String greet(){
        return "Welcome to sbi.";
    }
}

class Boi extends BankUser{
    public Boi() {
        super("Bank of india");
    }

    @Override
    public String greet(){
        return "Welcome to Bank of india.";
    }
}

class MyBank extends BankUser{
    public MyBank() {
        super("MyBank");
    }


    @Override
    public String greet(){
        return "welcome to MyBank.";
    }
}


public class Main {
    public static void main(String[] args) {
        // using for loop we going to fetch data from random classes like sbi,boi,mybank
        for(int i=1; i < 5; i++){
            BankUser bankuser = GenrateObjects();
            System.out.println("bank is: " + bankuser.greet());
        }
    }

    public static BankUser GenrateObjects(){
        int random = (int) (Math.random() * 3) +1;

        // TODO : note whenever you return in switch case at that time break keyword is not needed to use.
        switch (random){
            case 1:
                return new Sbi();

            case 2:
                return new Boi();

            case 3:
                return new MyBank();

            default:
                return null;
        }
    }
}
