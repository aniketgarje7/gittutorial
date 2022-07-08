public class Singlton {
    private Singlton(){

    }
          static Singlton instance;
       public static Singlton getInstance(){
           if(instance==null){
               instance = new Singlton();
           }
           return instance;
       }
    }

