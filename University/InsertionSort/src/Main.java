public class Main {
//    insertion sort method
    public static int[] inserttion_Sort(int arr[]){
        int temp;

//        outer loop > insertion sort always start with 1
        for(int i =1; i < arr.length; i++){
            for(int j = i; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    //swap
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] insertionSort = {03,1998,24,29,06};
        int sorted_insertion_sort[] = inserttion_Sort(insertionSort);

//        print
        for(int i = 0; i < sorted_insertion_sort.length; i++){
            System.out.print(sorted_insertion_sort[i] + ", ");
        }
    }
}
