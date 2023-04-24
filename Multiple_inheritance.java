class Student{
    int rollno;
    void getNum(int x){
        rollno = x;
    }

    void putNum(){
        System.out.println("Rollno: "+rollno);
    }
}

class Test extends Student{
    int m1, m2;
    void getMarks(int x, int y){
        m1 = x;
        m2 = y;
    }

    void putMarks(){
        System.out.println("Marks Obtained");
        System.out.println("Marks 1: "+m1);
        System.out.println("Marks 2: "+m2);
    }
}

interface Sports{
    float sportswt = 6.0F;
    void putwt();
}

class Results extends Test implements Sports{
    float total;
    public void putwt(){
        System.out.println("Sports wt: "+sportswt);
    }
    void display(){
        total = m1 + m2 + sportswt;
        putNum();
        putMarks();
        putwt();
        System.out.println("Total Score: "+total);
    }
}
public class Multiple_inheritance {
    public static void main(String[] args){
        Results student1 = new Results();
        student1.getNum(121);
        student1.getMarks(27, 33);
        student1.display();
    }
    }

