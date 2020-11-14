public class Main {
    public static void main(String[] args) {
        int[] Asort = {5,10,15,0,2,29,24};
        int n = Asort.length;
        int i,j,temp;
        boolean swapped;

        for(i = 0; i < n - 1 ; i++) {
            // swapped is false here for optimized sort
            swapped = false;
            for (j = 0; j < n - 1; j++) {
                if (Asort[j] > Asort[j + 1]) {
                    // swapping
                    temp = Asort[j];
                    Asort[j] = Asort[j + 1];
                    Asort[j + 1] = temp;
                    swapped = true;
                }
            }
            // if no elements were swapped by inner loop  then break
            if(!swapped)
                break;

        }

// for printing sort array
        for(i = 0; i< Asort.length; i++){
            System.out.println(Asort[i]);
        }



    }
}
