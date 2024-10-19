import java.util.*;

public class supermarket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a price tag: ");
        int n = sc.nextInt();
        int ans = 1;
        while (n > 0) {
            ans *= n % 10;
            n = n / 10;
        }
        System.out.println();
        System.out.print("Actual price is: ");
        System.out.println(ans);
    }
}