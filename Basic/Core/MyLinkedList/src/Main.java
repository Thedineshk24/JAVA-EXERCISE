import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        /*


           LinkedList example below arrayList


        */
//        Banker dinesh = new Banker("dinesh",29000);
//        Banker ayu = new Banker("ayushi", 24000);
//
//        Banker ayu; // we can assign object like this
//        ayu = dinesh; // but the prob is when we update data of one object java automatically update another one
//
//        ayu.setcBalance(2999999);
//        System.out.println(ayu.getcBalance());
//
//        System.out.println("dinesh balance is: "+dinesh.getcBalance());

        ArrayList<Integer> num = new ArrayList<>();

        num.add(25);
        num.add(24);
        num.add(03);
        num.add(06);

        for(int i = 0; i < num.size(); i++){
            System.out.println(i + " : " + num.get(i));
        }

//        updating arrayList
        num.add(0, 29);
        System.out.println("-----------------------------");

        for(int i = 0; i < num.size(); i++){
            System.out.println(i + " : " + num.get(i));
        }


//        LinkedList example:

        LinkedList<String> programming = new LinkedList<>();

        programming.add("C");
        programming.add("C++");
        programming.add("Java");
        programming.add("javascript");
        programming.add("python");

        plist(programming);
        programming.add(4, "Ruby");
        plist(programming);

    }

    public static void plist(LinkedList<String> ll){
//        iterator
        Iterator<String> i = ll.iterator();

        while(i.hasNext()){
            System.out.println( "programming language is: "+ i.next());
        }

    }
}
