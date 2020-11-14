public class TryCatch {
    public static void main(String[] args) {
        int arr[] = {03,29,1998};
        try{
            System.out.println(arr[3]);
        }catch (Exception e){
//            output >> error is >>Index 3 out of bounds for length 3
            System.out.println("error is >>"+ e.getMessage());
        }

//        and next code get executed
        System.out.println("Hello tryCatch \uD83D\uDC4B");
    }
}
