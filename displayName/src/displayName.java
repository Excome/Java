import java.util.Scanner;

public class displayName {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter ur name: ");
        String userName = in.nextLine();
        System.out.printf("Hello, %s!\n", userName);
        System.out.print("Input x: ");
        float x = in.nextInt();
        System.out.print("Input y: ");
        float y = in.nextInt();
        System.out.printf("X + Y = %.0f\n", (x+y));
        if (x >= y) {
            System.out.printf("X * Y = %.0f\n", (x*y));
        } 
        else {
            float dl = (x / y);
            System.out.printf("X / Y = %.2f\n", dl);
        }     
    }
    
}
