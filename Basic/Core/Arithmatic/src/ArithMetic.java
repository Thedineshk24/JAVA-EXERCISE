import java.util.Scanner;

public class ArithMetic {
    public static void main(String[] args) {
        int num1,num2,num3;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter num 1");
        num1 = scan.nextInt();

        System.out.println("Enter num 2");
        num2 = scan.nextInt();



        int sum = num1 + num2;
        int mul = num1 * num2;
        int div = num1 / num2;
        int sub = num1 - num2;

        System.out.println("sum "+sum);
        System.out.println("mul "+mul);
        System.out.println("div "+div);
        System.out.println("sub "+ sub);

//        postfix and prefix
        int n1 = 10, n2 = 10;

        System.out.println("postfix " + n1++); // post fix first print existing no and then increment or decrement no
        System.out.println("prefix "+ ++n2); // prefix first increment or decrement no then print it
    }
}
