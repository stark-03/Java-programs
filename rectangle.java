class rectarea {
    int length, breadth;
    void getdata(int x, int y){
        length = x;
        breadth = y;
    }
    
    int rectarea1(){
        int area = length * breadth;
        return(area);
    }
}

class rectangle
{
    public static void main(String[] args){
        int area1, area2;
        rectarea rect1 = new rectarea();
        rectarea rect2 = new rectarea();
        rect1.length = 15;
        rect1.breadth = 10;
        area1 = rect1.length * rect1.breadth;
        rect2.getdata(20, 30);
        area2 = rect2.rectarea1();
        System.out.println("Area1= "+area1);
        System.out.println("Area2= "+area2);
    }
}