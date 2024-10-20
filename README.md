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

 ## Problem Statement 4.
 Given an integer array Arr of size N the task is to find the count of elements whose value is greater than all of its prior elements.

Note : 1st element of the array should be considered in the count of the result.

For example,

Arr[]={7,4,8,2,9}

As 7 is the first element, it will consider in the result.

8 and 9 are also the elements that are greater than all of its previous elements.

Since total of  3 elements is present in the array that meets the condition.

Hence the output = 3.
``` 
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
 ```

  ## Problem Statement 5.
  A supermarket maintains a pricing format for all its products. A value N is printed on each product. When the scanner reads the value N on the item, the product of all the digits in the value N is the price of the item. The task here is to design the software such that given the code of any item N the product (multiplication) of all the digits of value should be computed(price).

Example 1:

Input :

5244 -> Value of N

Output :
160 -> Price 

Explanation:

From the input above 

Product of the digits 5,2,4,4

5*2*4*4= 160

Hence, output is 160.
``` 
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
```
  ## Problem Statement 5.
  A furnishing company is manufacturing a new collection of curtains. The curtains are of two colors aqua(a) and black (b). The curtains color is represented as a string(str) consisting of a’s and b’s of length N. Then, they are packed (substring) into L number of curtains in each box. The box with the maximum number of ‘aqua’ (a) color curtains is labeled. The task here is to find the number of ‘aqua’ color curtains in the labeled box.

Note :

If ‘L’ is not a multiple of N, the remaining number of curtains should be considered as a substring too. In simple words, after dividing the curtains in sets of ‘L’, any curtains left will be another set(refer example 1)

Example 1:

Input :
bbbaaababa -> Value of str

3  -> Value of L

Output: 3   -> Maximum number of a’s

Explanation:

From the input given above.

Dividing the string into sets of 3 characters each 

Set 1: {b,b,b}

Set 2: {a,a,a}

Set 3: {b,a,b}

Set 4: {a} -> leftover characters also as taken as another set

Among all the sets, Set 2 has more number of a’s. The number of a’s in set 2 is 3.

Hence, the output is 3. Solve this in java and explain.

  ```
    public class max_a_problem {
    public static int maxAquaCurtains(String str, int l) {
        int n = str.length();
        int maxCount = 0;
        for (int i = 0; i < n; i += l) {
            int countA = 0;
            for (int j = i; j < i + l && j < n; j++) {
                if (str.charAt(j) == 'a') {
                    countA++;
                }
            }
            maxCount = Math.max(maxCount, countA);
        }
        return maxCount;
    }

    public static void main(String[] args) {
        String str = "abbbaabbb";
        int l = 5;
        System.out.println(maxAquaCurtains(str, l));
    }
}

  ```

  ## Problem Statement 6.
  An international round table conference will be held in india. Presidents from all over the world representing their respective countries will be attending the conference. The task is to find the possible number of ways(P) to make the N members sit around the circular table such that.

The president and prime minister of India will always sit next to each other.

Example 1:

Input :

4   -> Value of N(No. of members)

Output : 

12  -> Possible ways of seating the members

Explanation:

2  members should always be next to each other. 

So, 2 members can be in 2!ways

Rest of the members can be arranged in (4-1)! ways.(1 is subtracted because the previously selected two members will be considered as single members now).

So total possible ways 4 members can be seated around the circular table 2*6= 12.

Hence, output is 12.
  ```
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

  ```