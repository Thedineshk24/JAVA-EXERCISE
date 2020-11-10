public class SbiUser extends BankApp{
    public SbiUser(String name){
        super(name);
        System.out.println("sbi constructor");
    }

//    override
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("tax: "+this.tax);
    }
}
