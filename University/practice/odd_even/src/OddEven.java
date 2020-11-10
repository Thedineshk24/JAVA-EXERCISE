import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int no;

        System.out.println("Enter no");
        no = scan.nextInt();

//        for(int i = 0; i<= no; i++ ){
//
//            if(i%2 ==0){
//                System.out.println(i);
//            }else if (i%2 !=0){
//                System.out.println(i);
//            }
//        }


//            while(no%2==0){
//                System.out.println(no);
//            }
//            while(no%2 !=0){
//                System.out.println(no);
//                no++;
//            }


        if(no %2 == 0){
            System.out.println(no + " is EVEN");
        }else{
            System.out.println(no + " is ODD");
        }


//        isEven

        int isEven;

        System.out.println("Enter number to print EVEN number...");
        isEven  = scan.nextInt();

        for(int i =0; i <= isEven; i++){
            if(i %2 ==0){
                System.out.println("Even no: "+i);
            }
        }

    }
}
