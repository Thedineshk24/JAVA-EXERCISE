public class AssignmentOp {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int num3 = num1; // assigning num1 values to num3

        System.out.println(num3);

        int num4 = 29;
        num4 += num1; // += means take whatever value num4 has and add num1 values to that.

        System.out.println(num4);

//        operator precedence
        System.out.println(((1+1)/2)*6); // 6
    }
}
