import java.util.Scanner;

public class PrintPatternStar {
    public static void main(String[] args) {
//        Method 1

//        int num = 5;
////        for new line
//        for(int i = 1; i <= num; ++i){
//          for printing star
//            for(int j = 1; j <= i; ++j){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        Taking input from the user to print half pyramid pattern

        Scanner scan = new Scanner(System.in);
        System.out.println("How many lines of pyramid you want?");
        int star = scan.nextInt();

        for(int i =1; i<= star; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
//            For new line
            System.out.println();
        }


    }
}
