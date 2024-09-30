import java.util.Scanner;

public class sundayCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of days: ");
        int n = sc.nextInt();
        System.out.println("Enter the starting day (0 for Sunday, 1 for Monday, ..., 6 for Saturday)");
        int startDay = sc.nextInt();
        int sundayCount = 0;
        for (int i = 0; i < n; i++) {
            if ((startDay + i) % 7 == 0) {
                sundayCount++;
            }
        }
        System.out.println("Number of sunday is: " + sundayCount);
    }
}
