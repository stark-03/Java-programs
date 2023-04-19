class Room{
    int length, breadth;
    Room(int a, int b){
        length = a;
        breadth = b;
    }
    int area(){
        return length * breadth;
    }
}

class Bedroom extends Room{
    int height;
    Bedroom(int x, int y, int z){
        super(x, y);
        height = z;
    }
    int volume(){
        return length * breadth *height;
    }
}

public class inherit_example {
    public static void main(String[] args){
        Bedroom room1 = new Bedroom(10, 20, 30);
        int area1 = room1.area();
        int vol = room1.volume();
        System.out.println("Area: "+area1);
        System.out.println("Volume: "+vol);
    }
}
