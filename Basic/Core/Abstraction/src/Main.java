public class Main {
    public static void main(String[] args) {
//        BankUser obj = new BankUsser(); // abstract class cannot be instantiated
        Sbi obj = new Sbi(23,"Ayu",29000);


        obj.getAge(23);
        obj.getName("ayu");
        obj.getBalance(29000);

    }
}
