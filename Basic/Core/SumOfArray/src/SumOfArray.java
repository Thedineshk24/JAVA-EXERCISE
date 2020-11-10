public class SumOfArray {
    public static void main(String[] args) {
        // declaration
        double[] Array_vals= {24.0,03,29.0,06};

        // printing values
        for(int i=0; i < Array_vals.length; i++){
            System.out.println("Element At: "+Array_vals[i]);
        }

        // largest number of array
        // comparing 0th position value with every val to find large number
        double large = Array_vals[0];
        for(int i =1; i < Array_vals.length; i++){
            // if condition true then store large value in large variable
            if(Array_vals[i] > large){
                large = Array_vals[i];
            }
        }
        System.out.println("Largest element in Array is: "+large);

        // sum of all element  of array
        double sum = 0;
        for(int i=0; i<Array_vals.length; i++){
            sum += Array_vals[i]; // short hand style of calculating sum of array element
//            sum = sum + Array_vals[i]; // simple style to calculate sum of array elements
        }
        System.out.println("Sum of Array Elements is: "+sum);
    }
}
