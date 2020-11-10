import java.util.Scanner;
public class marioScore {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int marioScore, lifeUps;
        System.out.println("Enter marioScore: ");
        marioScore = scan.nextInt();
        System.out.println("Enter lifeups: ");
        lifeUps = scan.nextInt();

        // logic part
        int finalScore = marioScore * lifeUps;

        // output
        System.out.println("mariScore is: "+finalScore);
    }
}
