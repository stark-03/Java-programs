import java.util.Scanner;
public class Addition {
    public static void main(String[] args){
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numer: ");
        a = sc.nextInt();
        System.out.println("Enter second number: ");
        b = sc.nextInt();
        System.out.println("Addition of two numbers: "+(a+b));
        sc.close();
    }
}
