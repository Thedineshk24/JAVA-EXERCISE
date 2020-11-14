public class Helper<T> {
    private T myVar;

//    getters in generic
    public T getMyVar(){
        return myVar;
    }

//    setters in generic
    public void setMyVar(T myVar){
        this.myVar = myVar;
    }
}
