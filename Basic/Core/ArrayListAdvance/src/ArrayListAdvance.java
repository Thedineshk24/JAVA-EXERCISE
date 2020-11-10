import java.util.ArrayList;

public class ArrayListAdvance {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();


        // set data
        for(int i = 0; i < 29; i++ ){
            num.add(Integer.valueOf(i)); // auto boxing
        }

        // get data
        for(int i = 0; i< 29; i++){
            System.out.println("value is: "+ num.get(i).intValue()); // unBoxing
        }
    }
}
