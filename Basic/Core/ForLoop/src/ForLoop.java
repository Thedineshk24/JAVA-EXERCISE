import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter no:");
        int no = scan.nextInt();

        for(int printI = 0; printI <= no; printI++){
            System.out.println(printI);
        }
    }
}
