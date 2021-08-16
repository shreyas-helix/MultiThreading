import java.util.Scanner;
public class MainThread {
    public static void main(String[] args) {
        int x, y, sum ,diff;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter x:");
        x = scan.nextInt();
        System.out.println("Enter y:");
        y = scan.nextInt();
        scan.close();
        sum = x + y;
        System.out.println("The Sum of x & y :" + sum);
        diff = x - y;
        System.out.println("The Difference of x & y:" + diff);
    }
    
}
