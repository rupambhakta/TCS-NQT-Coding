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