import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
//        quick revision of array

//        String[] name = new String[10];
//        name[0] = "Dinesh";
//        System.out.println(name[0]);

//        ArrayList
        ArrayList<String> Names = new ArrayList<>();

        Names.add("Dinesh");
        Names.add("Ayesha");
        Names.add("shree");

        System.out.println(" 2nd position " +Names.get(2));
//      replace or update arraylist element

        Names.add(2,"Divya");

        System.out.println(" 0Th position "+Names.get(0));
        System.out.println(" 2nd postion updated value " +Names.get(2));
    }
}
