import java.util.Scanner;

class clac{
    int num1, num2;
    void Add(int a, int b){
        num1 = a;
        num2 = b;
        System.out.println("Addition of 2 nos: "+(num1 + num2));
    }

    void Sub(int a, int b){
        num1 = a;
        num2 = b;
        System.out.println("Subtraction: "+(a - b));
    }

    void Mul(int a, int b){
        num1 = a;
        num2 = b;
        System.out.println("Multiplication: "+(a * b));
    }

    void Div(int a, int b){
        num1 = a;
        num2 = b;
        System.out.println("Division: "+(a / b));
    }
}

public class calculator {
    public static void main(String[] args){
    int ch;
    Scanner sc = new Scanner(System.in);
    clac res = new clac();
    System.out.println("1.Add\n2.Sub\n3.Mul\n4.Div");
    System.out.println("Enter your choice: ");
    ch = sc.nextInt();
    switch(ch){
        case 1 : System.out.println("Enter first number:");
                 res.num1 = sc.nextInt();
                 System.out.println("Enter second number: ");
                 res.num2 = sc.nextInt();
                 res.Add(res.num1, res.num2);
                 break;
        case 2 : System.out.println("Enter first number: ");
                 res.num1 = sc.nextInt();
                 System.out.println("Enter second number: ");
                 res.num2 = sc.nextInt();
                 res.Sub(res.num1, res.num2);
                 break;
        case 3 : System.out.println("Enter first number: ");
                 res.num1 = sc.nextInt();
                 System.out.println("Enter second number: ");
                 res.num2 = sc.nextInt();
                 res.Mul(res.num1, res.num2);
                 break;
        default : System.out.println("Enter a number: ");
                  res.num1 = sc.nextInt();
                  System.out.println("Enter second number: ");
                  res.num2 = sc.nextInt();
                  res.Div(res.num1, res.num2);
                  break;
    }
    sc.close();
}
}