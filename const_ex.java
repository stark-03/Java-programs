class Rect{
    int length, breadth;
    Rect(int a, int b){
        length = a;
        breadth = b;
        int area = length * breadth;
        System.out.println("Area of rectangle: "+area);
    }
}

public class const_ex {
    public static void main(String[] args){
        Rect rct = new Rect(10, 20);
    }
}
