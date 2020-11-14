public class Main {

//    Sort
    public static void bubbleSort(int array[]){
        int n = array.length;
        int k;

        for(int j = 0; j < n -1; j++){
            for(int i=0; i<n-1; i++){
                k = i+1;

                // if array[i]>array[k] then swap for acending bubble sort
                if(array[i] > array[k]){
                    swapMe(i,k,array);
                }
            }
            // print
            printNum(array);
        }
    }

//    swap method
    private static void swapMe(int i, int j, int[] arr){
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

//    print Nums
    private static void printNum(int[] input){
        for(int i =0; i < input.length; i++){
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }
    public static void main(String[] args) {
        int num[] = {24,29,03,06,1998};

        // call bubbleSort
        bubbleSort(num);
    }
}
