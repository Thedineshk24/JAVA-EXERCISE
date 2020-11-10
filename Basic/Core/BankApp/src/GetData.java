public class GetData {
    public static void main(String[] args) {
        BankApp obj = new BankApp("Ayesha");
        obj.age(23);
        obj.getAmount(1100000);

        obj.printInfo();

//        calling class constructor again
        BankApp obj2 = new BankApp("Dinesh Katariya");
        obj2.age(23);
        obj2.getAmount(2900000);

        obj2.printInfo();

        // inheritance
        SbiUser user = new SbiUser("Dinesh");
        user.age(24);
        user.taxInfo(20000);
        user.printInfo();
    }
}
