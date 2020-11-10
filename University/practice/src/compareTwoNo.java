import java.util.Scanner;

public class compareTwoNo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int no1,no2;

        System.out.println("enter  no1");
        no1 = scan.nextInt();
        System.out.println("enter no2");
        no2 = scan.nextInt();

        if(no1 < no2){
            System.out.println( no1 + "<" + no2);
        }else if(no1 > no2){
            System.out.println(no1 + ">" + no2);
        }else if(no1 == no2){
            System.out.println(no1 + "==" + no2);
        }else {
            System.out.println("work done");
        }
    }
}
