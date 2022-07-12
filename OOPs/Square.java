package OOPs;

public class Square extends Box {
    int side;
    public Square(int side){
        super(6);
        System.out.println("into the s  quare");
        this.side = side;
    }
    public Square(int l,int b,int w,int side){
        super(9);
        this.side = side;
        System.out.println("after the super");
        System.out.println("some changes did in master branch");
        
    }
    public Square(){
        super(43);
        System.out.println("calling from circle");
    }
}
