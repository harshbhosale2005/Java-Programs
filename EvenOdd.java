import java.util.*;

public class EvenOdd{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter an number:");
        int n=sc.nextInt();
        System.out.println(n%2==0 ? "Even" : "Odd");
        sc.close();
    }
}