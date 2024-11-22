Day 4 - Rotate an Array by d - Counterclockwise or Left
Given an array of integers arr[] of size n, the task is to rotate the array elements to the left by d positions.

Examples:

Input: arr[] = {1, 2, 3, 4, 5, 6}, d = 2
Output: {3, 4, 5, 6, 1, 2}
/*Explanation: After first left rotation, arr[] becomes {2, 3, 4, 5, 6, 1} and after the second rotation, arr[] becomes {3, 4, 5, 6, 1, 2}

Input: arr[] = {1, 2, 3}, d = 4
Output: {2, 3, 1}
Explanation: The array is rotated as follows:

After first left rotation, arr[] = {2, 3, 1}
After second left rotation, arr[] = {3, 1, 2}
After third left rotation, arr[] = {1, 2, 3}
After fourth left rotation, arr[] = {2, 3, 1}

*[Naive Approach] Rotate one by one - O(n * d) Time and O(1) Space
In each iteration, shift the elements by one position to the left in a circular fashion (the first element becomes the last). Perform this operation d times to rotate the elements to the left by d positions.


*[Optimized approach] :Reversal Algorithm:
1. Pehle d elements ko reverse karo.
2. Baaki ke n-d elements ko reverse karo.
3. Poore array ko reverse karo.

*/
import java.util.Arrays;

public class LeftRotateArray {

    // Function to reverse a portion of the array
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Function to left rotate the array
    static void leftRotate(int[] arr, int d, int n) {
        // Handle cases where d >= n
        d = d % n;

        // Step 1: Reverse the first d elements
        reverse(arr, 0, d - 1);

        // Step 2: Reverse the remaining n-d elements
        reverse(arr, d, n - 1);

        // Step 3: Reverse the entire array
        reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 2; // Number of positions to rotate
        int n = arr.length;

        leftRotate(arr, d, n);
        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }
}

/*
Java code mein d = d % n ka matlab hai ki d (rotation count) ko array ke size n ke remainder se adjust karte hain. Ye step isliye zaruri hai, kyunki agar rotation count d array ke size se bada ho, to effective rotation ke liye uska modulo lena chahiye.

Kyon zaruri hai?

1. Agar array ke size n jitni ya usse zyada bar rotation ki jaye, to array waise hi dikhega jaise shuru me tha.

Example: arr = {1, 2, 3, 4, 5}, agar d = 5 ho, to array bilkul same rahega kyunki pura ek cycle complete ho gaya.

Similarly, agar d = 6 ho, to 1 position ki effective rotation hogi (d % n = 6 % 5 = 1).



2. Modulo (%) operation kaam kaise karta hai?

d % n hamesha d ko n ke range me le aata hai. Yaani, agar d > n, to sirf d % n rotations karna zaruri hota hai.


*/

