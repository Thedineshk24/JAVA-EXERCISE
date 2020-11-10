public class AccesSpecifiers {
//    public -- visible to everyone
//    private -- visible or  available to that particular class only
//    protected -- used in that particular package AKA module only

    public static void main(String[] args) {

        System.out.println("minimum number is: "+minimum(24,29));
        System.out.println("maximum number is: "+max(24,29));
    }

    // return minimum number

    public static int minimum(int n1, int n2){
        int min;

        if(n1 > n2){
            min = n2;
        }else{
            min = n1;
        }
        return min;
    }

    // return of max num
    public static int max (int one, int two){
        int maxx;
        if(one > two){
            maxx = one;
        }else{
            maxx = two;
        }
        return  maxx;
    }
}
