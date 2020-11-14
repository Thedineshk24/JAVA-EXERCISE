import java.net.URL;

public class Try_Catch_Mal_Url {
    public static void main(String[] args) {
//        MalformedURLException
        try{
            URL url = new URL("https://dineshkatariya.tech");
            System.out.println("URL Protocol is >> " + url.getProtocol());
        }catch(Exception e){
            System.out.println("ERROR is >> " + e.getMessage());
        }
    }
}
