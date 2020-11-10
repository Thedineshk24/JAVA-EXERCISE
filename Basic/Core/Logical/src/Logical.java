public class Logical {
    public static void main(String[] args) {
        boolean isLoggedInFromFb = true;
        boolean isLoggedInFromEmail = false;
        boolean isLoggedInfromTwitter = false;

//       AND(&&) return true if all conditions are true
        System.out.println(isLoggedInFromEmail && isLoggedInFromFb && isLoggedInfromTwitter);

//        OR(||) return true if one condition is true
        System.out.println(isLoggedInFromFb || isLoggedInfromTwitter || isLoggedInFromEmail);

//        return opposite of it
        System.out.println(!isLoggedInFromEmail);
    }
}
