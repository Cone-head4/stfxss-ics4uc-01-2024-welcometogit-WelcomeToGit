import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {
        // Create a scanner to read
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();
        System.out.println("Hello "+name);
        System.out.println("Another Name: ");
        String name2 = sc.next();
        System.out.println("Hello thy: "+name2);
        sc.close();   

        // Simple shortform example
        int num = 900;
        System.out.println(num);
        System.out.println(num++);
        System.out.println(++num);
        System.out.println(num);
    }
}
