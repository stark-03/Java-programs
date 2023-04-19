class area{
    int length, breadth, height;
    void getarea(int a, int b){
        length = a;
        breadth = b;
        System.out.println("Area of rectangle: "+(length * breadth));
    }

    void getarea(int a, int b, int c){
        length = a;
        breadth = b;
        height = c;
        System.out.println("Volume of rectangle: "+(length * breadth * height));
    }
}

public class overloading {
    public static void main(String[] args){
        area a1 = new area();
        a1.getarea(20, 30);
        a1.getarea(10, 20, 30);
    }
    
}
