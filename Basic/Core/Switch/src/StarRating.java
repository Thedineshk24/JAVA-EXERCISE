import java.util.Scanner;

public class StarRating {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter rating between 1 to 5");
        int starRating = scan.nextInt();


            switch (starRating){
                case 1:
                    System.out.println("User given *");
                    break;

                case 2:
                    System.out.println("User given **");
                    break;

                case 3:
                    System.out.println("User given ***");
                    break;

                case 4:
                    System.out.println("User given ****");
                    break;

                case 5:
                    System.out.println("User given *****");
                    break;

                default:
                    System.out.println("Please enter rating between 1 to 5");
            }
    }
}
