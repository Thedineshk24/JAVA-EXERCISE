import java.util.Scanner;

public class GradingSystem {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


//        System.out.println("Enter your grade");
//        char grade = scan.next().charAt(0);
//
//        switch (grade) {
//            case 'A':
//                System.out.println("Congratulation you got A");
//                break;
//
//            case 'B':
//                System.out.println("Congratulation you got B");
//                break;
//
//            case 'C':
//                System.out.println("you got C");
//                break;
//
//            case 'D':
//                System.out.println("you got D");
//                break;
//
//            default:
//                System.out.println("Regret to inform you but You did not passed this year, Try again next year.");
//                break;
//        }

//        star rating
        System.out.println("give star rating between 1 to 5");
        int star   = scan.nextInt();

        switch (star){
            case 1:
                System.out.println("*");
                break;

            case 2:
                System.out.println("**");
                break;

            case 3:
                System.out.println("***");
                break;

            case 4:
                System.out.println("****");
                break;

            case 5:
                System.out.println("*****");
                break;

            default:
                System.out.println("rate between 1 to 5 *****");
                break;
        }
    }
}
