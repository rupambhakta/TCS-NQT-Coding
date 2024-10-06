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

## Problem Statement 3.
Jack is always excited about sunday. It is favourite day, when he gets to play all day. And goes to cycling with his friends. 

So every time when the months starts he counts the number of sundays he will get to enjoy. Considering the month can start with any day, be it Sunday, Monday…. Or so on.

Count the number of Sunday jack will get within n number of days.

 Example 1:

Input 

mon-> input String denoting the start of the month.

13  -> input integer denoting the number of days from the start of the month.

Output :

2    -> number of days within 13 days.

Explanation:

The month start with mon(Monday). So the upcoming sunday will arrive in next 6 days. And then next Sunday in next 7 days and so on.

Now total number of days are 13. It means 6 days to first sunday and then remaining 7 days will end up in another sunday. Total 2 sundays may fall within 13 days. 

``` 
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
 ```