import java.util.Scanner;

public class LargeOf3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1,n2,n3;

        System.out.println("enter no1");
        n1 = scan.nextInt();

        System.out.println("enter no2");
        n2 = scan.nextInt();

        System.out.println("enter no3");
        n3 = scan.nextInt();

        if(n1>n2 && n1 >n3 ){
            System.out.println(n1 + " is Large NUMBER");
        }else if(n2 > n1 && n2 > n3){
            System.out.println(n2 + " is Large NUMBER");
        }else if(n1== n2 && n1 == n2 && n1 == n3){
            System.out.println("all Numbers are equal");
        }else{
            System.out.println(n3 + " is Large NUMBER");
        }
    }
}
