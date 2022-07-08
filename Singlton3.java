public class Singlton3 {
    int a = 10;
    String s = "working";
    private Singlton3(){

    }
     static Singlton3 obj;
    public static Singlton3 getinsta(){
        if(obj==null){
            obj = new Singlton3();
        }
        return obj;
    }
}
