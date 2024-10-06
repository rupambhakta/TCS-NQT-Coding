import java.util.*;

public class priorElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("You entered: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }

        // Arr[]={7,4,8,2,9}

        int max = Integer.MIN_VALUE;

        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] > max)

            {
                max = arr[i];
                count++;
            }
        }
        System.out.println();
        System.out.println(count);
    }
}
