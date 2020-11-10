import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        float celcius = 0;

        Scanner scan = new Scanner(System.in);


//        taking celcius from user
        System.out.println("Enter celcius of your area: ");
        celcius = scan.nextFloat();

        if(celcius <= 12){
            System.out.println("Fill like you're in shimla or nainital");
        }else if(celcius >10 || celcius <25){
            System.out.println("chill out there");
        }else if(celcius >25 || celcius <35){
            System.out.println("moderate weather");
        }else if(celcius >35 || celcius <=45){
            System.out.println("very HOT out there");
        }else{
            System.out.println("Where are u? in very cold area or in very HOT area?...");
        }
    }
}
