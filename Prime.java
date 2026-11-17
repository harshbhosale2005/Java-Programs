import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter an Number: ");
            int n=sc.nextInt();

            boolean prime=true;
            if(n<=1){
                prime=false;
            }
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    prime=false;
                    break;
                }
            }
            System.out.println(prime ? "prime" : "Not Prime");
        }
    }
}
