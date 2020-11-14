public class Main {
    public static <T extends Comparable<T>> T Max(T x, T y, T z){
        T max = x;

        if(y.compareTo(max) > 0){
            max = y;
        }

        if(z.compareTo(max) > 0){
            max = z;
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.printf("Max is : %d", Max(24,29,03));
    }
}
