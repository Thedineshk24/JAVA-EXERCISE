import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // blueprint of program
        int year;
        boolean leap = false;

        System.out.println("Enter year to find out if a year is a leap year or not");
        year = scan.nextInt();

//        LOGIC 1


////         if true means chances are this year is leap
//        if(year %4 == 0){
//            if(year % 100 == 0){
////                year is divisible by 400, hence the year is a leap year
//                if(year % 400 ==0){
//                    System.out.println(year + " is a leap year");
//                }else {
//                    System.out.println(year + " is not a leap year");
//                }
//
//            }else{
//                System.out.println(year + " is a leap year");
//            }
//        }else{
//            System.out.println(year + " Not a leap year");
//        }


//        LOGIC 2
        if( (year % 4 ==0) && (year %100 !=0) || (year %400 ==0)){
            System.out.println(year + " is a leap year....");
        }else{
            System.out.println(year + " is not a leap year!");
        }

    }
}
