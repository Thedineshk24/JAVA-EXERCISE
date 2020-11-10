public class PrimitativeDataType {
    public static void main(String[] args) {
//        byte
//        short
//        int
//        long
//        float
//        double
//        boolean
//        char - "a"
//        String

//          byte rollNo = 22;
//        System.out.println(
//                rollNo
//        );

//        int
        int mInt = 29;
//        float
        float mFloat = 24.0f; // must add "f" at the end of value
//        double
        double mDouble  = 24.00;

//        OUTPUT
        System.out.println("int: "+mInt);
        System.out.println("float: "+mFloat);
        System.out.println("double: "+mDouble);

//        boolean and  char(unicode)
        char charName= 'a';
        boolean isLoggedIn = true;

        System.out.println(isLoggedIn);
        String myVal = Integer.toHexString(charName);
        System.out.println(myVal);

//        unicode
        char mUnicode = '\u0041';
        System.out.println(mUnicode);


//        String
        String myName = "hi i am  Dinesh Katariya. ";
        System.out.println(myName);
//        ConCatiNate
        System.out.println(myName + " " + "........");
//        ToUpper Case
        System.out.println(myName.toUpperCase());
//        ToLowercase
        System.out.println(myName.toLowerCase());
//        Trim
        System.out.println(myName.trim());
    }
}
