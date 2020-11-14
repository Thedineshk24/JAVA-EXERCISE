import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter day between (1-31) : ");
        int dd = scan.nextInt();

        System.out.println("Enter month between (1-12) : ");
        int mm = scan.nextInt() -1; // -1 because in java doc calender month always start from 0-11.

        System.out.println("Enter any year: ");
        int yy = scan.nextInt();

        Date date = (new GregorianCalendar(yy,mm,dd)).getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        String day = sdf.format(date);

        System.out.println("The day in the year " + yy + " was : "+day);

    }
}
