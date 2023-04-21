class Super{
    int x;
    Super(int x){
        this.x = x;
    }
    void display(){
        System.out.println("Super class: "+x);
    }
}

class Sub extends Super{
    int y;
    Sub(int x, int y){
        super(x);
        this.y = y;
    }
    void display(){
        System.out.println("Super class: "+x);
        System.out.println("Sub class "+y);
    }
}

public class override {
    public static void main(String[] args){
        Sub s1 = new Sub(100, 200);
        s1.display();
    }
}
