class Room{
    int length, breadth;
    void getarea(int a, int b){
        length = a;
        breadth = b;
    }
}

public class multiple_class {
    public static void main(String[] args){
        int area;
        Room room1 = new Room();
        room1.length = 10;
        room1.breadth = 20;
        area = room1.length * room1.breadth;
        System.out.println("Area: "+area);
    }
}
