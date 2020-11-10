import java.util.Scanner;

public class Pattern2_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//      taking pyramid input
        System.out.println("How many numbers of pyramid you want to  DRAW?");
        int pyramid = scan.nextInt();


//        printing numbers

        for(int i = pyramid; i>0;i--){
            for(int j=1; j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }


//        printing stars

//        for printing new lines
//        for(int i=0; i <= pyramid; i++){
////            printing lines
//            for(int j=pyramid; j > i; j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


    }
}
