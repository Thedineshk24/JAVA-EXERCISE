public class ArrayType {
    public static void main(String[] args) {
//        int array default value is 0
        int[] numbers = new int[29];
        int[] myFav = {24,03,29,06,02};

        numbers[0] = 29;
        numbers[2] = 24;

        System.out.println(numbers[0] + " loves " + numbers[2]);

//        fill out array with values using for loop

        for(int i =0; i < numbers.length; i++){
            numbers[i] = i * 2;
        }

        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i] / 2); // if u divide by two then you get orignal values
            // because in first loop we mulitplied by 2 so when we divide by two we get orignal no.
        }
    }
}
