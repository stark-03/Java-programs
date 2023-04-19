package Hackerrank;
import java.util.Scanner;
public class inputstr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        Scanner str = new Scanner(System.in);
        String s = str.nextLine();
        scan.close();
        str.close();
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
    
}
