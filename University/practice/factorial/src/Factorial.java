import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        TRY 1 != true

//        System.out.println("enter number to convert it to factorial");
//        int factNum = scan.nextInt();
//        int  fact = 1;
//
//        for(int i=1; i<=factNum; i++){
//            fact = factNum * i;
//        }
//        System.out.println(fact);

//        TRY 2 != true

//        int fact = 1;
//        int number;
//
//
//        System.out.println("number");
//        number = scan.nextInt();
//
//        while(fact < number){
//            number = number * fact;
//            fact++;
//        }
//        System.out.println(
//                fact
//        );


//        TRY 3 == SUCCESS way1
        System.out.println("enter number");
        int number = scan.nextInt();
        int factorial = 1;

        if (number <= 0) {
            System.out.println("enter number greater than 0");
        } else {
            for (int limit = 1; limit <= number; limit++) {
                factorial = factorial * limit;
            }
            System.out.println(factorial);
        }


//    TRY 4 using -- is SUCCESS
        System.out.println("enter number");
        int factN = scan.nextInt();
        int fact = 1;

        if(number >=1){
            for(int limit = factN; limit > 0 ; limit--){
//                logic is " for(int limit = factN; limit > 0; limit--) "
                //
                fact = fact * limit;
            }
            System.out.println(fact);
        }else{
            System.out.println("enter number greater than 0");
        }
    }

}
