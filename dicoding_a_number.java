import java.util.Scanner;

public class dicoding_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n = sc.nextInt();

        System.out.println("Enter the second number: ");
        int r = sc.nextInt();

        int sum = sumOfDigit(n);
        int ans = sumOfDigit(sum * r);
        System.out.println(ans);
    }

    private static int sumOfDigit(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }
}
