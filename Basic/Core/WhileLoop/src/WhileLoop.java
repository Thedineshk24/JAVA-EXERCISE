

public class WhileLoop {
    public static void main(String[] args) {
        int no = 1;

        while (no <= 10 ){
            System.out.println(no);
            no++;
        }
        System.out.println("out of while loop");

//       Do while loop

        int no2 = 1;
        do{
            System.out.println(no2);
            no2++;
        }while (no2 <= 10);

        System.out.println("out of DoWhile loop");
    }
}
