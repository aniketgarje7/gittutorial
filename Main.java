
public class Main {
  static    int a =0;
    public static void main(String[] args){
     print();
     System.out.println(a);
     
     
}
public static void print(){
  if(a==6){
    return;
  }
  a++;
  System.out.println(a);
  print();
}

 
}
 class Check{
  int a = 10;
  int b;
  String s;
  public void print(){
    System.out.println(a);
  }
  
}