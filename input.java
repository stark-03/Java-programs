import java.util.Scanner;
public class input {
    public static void main(String[] args){
        String name;
        int a, b, res;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        a = sc.nextInt();
        System.out.println("Enter second number: ");
        b = sc.nextInt();
        res = a + b;
        System.out.println("Enter your name: ");
        Scanner sn = new Scanner(System.in);
        name = sn.nextLine();
        System.out.println("Addition of two numbers is: "+res);
        System.out.println("Hello Mr. "+name);
        sc.close();
        sn.close();
    }
}
