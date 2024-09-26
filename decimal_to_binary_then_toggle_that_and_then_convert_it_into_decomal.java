import java.util.*;

public class decimal_to_binary_then_toggle_that_and_then_convert_it_into_decomal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal value: ");
        int n = sc.nextInt();
        int b = decomalToBinary(n);
        System.out.println(b);
        int al = alterBinary(b);
        System.out.println(al);
        int ans = binaryToDecimal(al);
        System.out.println(ans);

    }

    public static int decomalToBinary(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        StringBuilder st = new StringBuilder();
        while (n != 0) {
            // System.out.print(n%2+" ");
            arr.add(n % 2);
            n = n / 2;
        }
        // System.out.println();
        for (int i = arr.size() - 1; i >= 0; i--) {
            st.append(arr.get(i));
        }
        return Integer.parseInt(st.toString());
    }

    // Alter value and most significant bit
    public static int alterBinary(int b) {
        int length = String.valueOf(b).length();
        int arr[] = new int[length];
        for (int i = length - 1; i > 0; i--) {
            if (b % 10 == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            b = b / 10;
        }
        StringBuilder st = new StringBuilder();
        int x = 0;
        while (arr[x] == 0) {
            x++;
        }
        for (int i = x; i < length; i++) {
            st.append(arr[i]);
        }
        return Integer.parseInt(st.toString());
    }

    public static int binaryToDecimal(int n) {
        int length = String.valueOf(n).length();
        int sum = 0;
        for (int i = 0; i < length; i++) {
            int lb = n % 10;
            sum += lb * Math.pow(2, i);
            n = n / 10;
        }
        return sum;
    }
}