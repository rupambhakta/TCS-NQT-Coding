import java.util.*;

public class round_table_problem {
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of menber: ");
        int n = sc.nextInt();
        System.out.println("Number of ways will be " + 2 * fact(n - 1));
    }
}
