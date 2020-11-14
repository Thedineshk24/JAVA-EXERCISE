import java.util.ArrayList;

public class Main {
    public static void main(String[] A) {
//        ArrayList nums = new ArrayList();// >> this generic ArrayList will not complain if you put any kind of data in this list.
//
//        ArrayList<Integer> nums = new ArrayList<>();
//
//        nums.add(24);
//        nums.add(29);
//        nums.add(06);
//        nums.add(03);
//
//        // this for loop works same as for each loop in js.
//        for(Object i: nums){
//            System.out.println(i);
//        }

//        generic class object
        Helper<String> stringHelper = new Helper<>();

        stringHelper.setMyVar("Dinesh Katariya");
        System.out.println(stringHelper.getMyVar());

//        accessing Integer in generic class
        Helper<Integer> integerHelper = new Helper<>();
        integerHelper.setMyVar(new Integer(29));
        System.out.println(integerHelper.getMyVar());

    }
}
