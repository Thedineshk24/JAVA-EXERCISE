import java.util.Scanner;

public class Fahrenheit_to_Celsius {
//    formula of Fahrenheit to Celsius
//    F-30/2
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fahrenheit to Celsius:");
        double Fahrenheit = scan.nextDouble();

        double celsius =( 5*(Fahrenheit - 30) )/ 9;
        System.out.println(Math.round(celsius)  + " celsius out there");
    }
}
