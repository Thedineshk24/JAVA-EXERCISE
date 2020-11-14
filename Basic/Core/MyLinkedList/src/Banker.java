public class Banker {
    private String cName;
    private double cBalance;

    public Banker(String cName, double cBalance){
        this.cName = cName;
        this.cBalance = cBalance;
    }

//    getters
    public String getName(){
        return cName;
    }

    public double getcBalance(){
        return cBalance;
    }

//   setters
    public void setCname(String cName){
         this.cName = cName;
    }

    public void setcBalance(double cBalance){
        this.cBalance = cBalance;
    }

}
