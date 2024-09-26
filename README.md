# Here are some coding problem and it's solution of TCS NQT

## Problem Statement 1.

A chocolate factory is packing chocolates into the packets. The chocolate packets here represent an array  of N number of integer values. The task is to find the empty packets(0) of chocolate and push it to the end of the conveyor belt(array).

Example 1 :

N=8 and arr = [4,5,0,1,9,0,5,0].

There are 3 empty packets in the given set. These 3 empty packets represented as O should be pushed towards the end of the array

Ans should be -> [4,5,1,9,5,0,0,0].

```
public class conveyorBeltProblem{
    public static void main(String args[]){
        int arr[] = {4,5,0,1,9,0,5,0};
        int n = arr.length;
        int res[] = new int[n];
        int first = 0;
        int last = n-1;
        for(int i=0; i<n; i++){
            if(arr[i]==0){
                res[last] = arr[i];
                last--;
            }else{
                res[first] = arr[i];
                first++;
            }
        }
        for(int i : res){
            System.out.print(i+" ");
        }
    }
}
```

## Problem Statement 2.
Joseph is learning digital logic subject which will be for his next semester. He usually tries to solve unit assignment problems before the lecture. Today he got one tricky question. The problem statement is “A positive integer has been given as an input. Convert decimal value to binary representation. Toggle all bits of it after the most significant bit including the most significant bit. Print the positive integer value after toggling all bits”.

Constrains-
1<=N<=100

Example 1:
Input :
10  -> Integer

Output : 5  -> result - Integer

Explanation:

Binary representation of 10 is 1010. After toggling the bits(1010), will get 0101 which represents “5”. Hence output will print “5”.

```
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
```