package OOPs;

public class Box {
    int l;
    int b;
    int w;
    int ca;
    public Box(int a){
        super();
        System.out.println("int the BOx from square");
        

         ca = 32;
        // System.out.println("int to the Box");
       this.l = a; 
        b = 1;
        w = 1;
    }
    public Box(int l,int b, int w){
        System.out.println("int to the second constructor of box");
        this.l = l;
        this.b = b;
        this.w = w;
    }
    public void print(){
        System.out.println(ca);
    }
}
class Rectangle extends Box{
    String s ;
    Rectangle(){
        super(4);
       s="working";
    }
}
