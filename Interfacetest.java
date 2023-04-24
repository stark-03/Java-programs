interface Area{
    float pi = 3.14F;
    float compute(float x, float y);
}

class Rect implements Area{
    public float compute(float x, float y){
        return x * y;
    }
}

class Circle implements Area{
    public float compute(float x, float y){
        return pi * x * x;
    }
}
public class Interfacetest {
    public static void main(String[] args){
        Rect rct = new Rect();
        Circle cir = new Circle();
        Area area;
        area = rct;
        System.out.println("Area of Rectangle is: "+area.compute(10, 20));
        area = cir;
        System.out.println("Area of the Circle is: "+area.compute(10, 0));
    }
}
