// encapsulation means hiding data from user also known as getters and setter

public class Main {
    public static void main(String[] args) {
        BankDetails obj = new BankDetails();

//        set
        obj.setName("Dinesh");
        obj.setAge(23);
        obj.setAccDet(2000000000);

//        get
        System.out.println(obj.getName() + "\n" + obj.getAge() + "\n" + obj.getAccDet());
    }
}

class BankDetails {
    private int age;
    private String name;
    private int AccDet;

//    public int getAge() {
//        return age;
//    }

//    getters
      public int getAge(){
          return age;
      }

      public String getName(){
          return name;
      }

      public int getAccDet(){
          return AccDet;
      }

//    setters
    public void setName(String name){
          this.name = name;
    }

    public void setAge(int age){
          this.age = age;
    }

    public void setAccDet(int accDet){
          this.AccDet = accDet;
    }
}
