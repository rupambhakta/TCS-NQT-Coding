import java.util.*;

public class trafic_roul_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 5, 2, 3, 7,4 };
        int d = 13;
        int x = 300;
        int count = 0;
        if (d % 2 == 0) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    count++;
                }
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 != 0) {
                    count++;
                }
            }
        }
        System.out.println("Fine will be: "+ count*x);
    }
}
