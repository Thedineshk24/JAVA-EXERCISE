public class Main {
//    selection sort
    public static int[] selectionSort(int[] arr){
//        outerLoop
        for(int i = 0; i < arr.length -1; i++){
            int index = i;
//         innerLoop
            for(int j = i + 1; j <arr.length; j++){
//                condition
                if(arr[i] < arr[index]){
                    index = j;
                }
            }
//            swapping
            int small = arr[index];
            arr[index] = arr[i];
            arr[i] = small;
        }
        return arr;
    }
    public static void main(String[] args) {
        int myArray[] = {03,06,24,29,1998};
        int printArr[] = selectionSort(myArray);

        for(int i = 0; i<printArr.length; i++){
            System.out.print(printArr[i] + ", ");
        }
    }
}
