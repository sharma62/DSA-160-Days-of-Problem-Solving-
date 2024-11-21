/*Given an array arr[], the task is to reverse the array. Reversing an array means rearranging the elements such that the first element becomes the last, the second element becomes second last and so on.

Examples:

Input: arr[] = {1, 4, 3, 2, 6, 5}
Output: {5, 6, 2, 3, 4, 1}
Explanation: The first element 1 moves to last position, the second element 4 moves to second-last and so on.

Input: arr[] = {4, 5, 1, 2}
Output: {2, 1, 5, 4}
Explanation: The first element 4 moves to last position, the second element 5 moves to second last and so on.


[Expected Approach ] By Swapping Elements - O(n) Time and O(1) Space
The idea is to iterate over the first half of the array and swap each element with its corresponding element from the end. So, while iterating over the first half, any element at index i is swapped with the element at index (n - i - 1).

*/


public static void reverseArray(int[] arr) {
        int left = 0;          // Left pointer (start of the array)
        int right = arr.length - 1;  // Right pointer (end of the array)
        
        while (left < right) {
            // Swap elements at left and right pointers
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            // Move the pointers closer towards the center
            left++;
            right--;
        }



/*
Explain:
Yeh approach bhi O(n) time complexity aur O(1) space complexity wali hoti hai. Isme hum do pointers ka use karte hain — ek pointer ko array ke start pe rakhenge aur dusre ko end pe. Phir hum dono pointers ko ek saath move karenge, aur unke elements ko swap karenge, jab tak dono pointers ek dusre ke cross na kar jaayein.

Two Pointer Approach Explanation:
Pointers:
Left pointer ko start pe, i.e., i = 0 pe rakhenge.
Right pointer ko array ke last element pe, i.e., j = n - 1 pe rakhenge.
Loop:
Jab tak i < j, dono pointers ko move karte hue unke corresponding elements ko swap karenge:
arr[i] ko arr[j] ke saath swap karenge.
Terminate:
Jab dono pointers ek dusre ko cross karenge, tab hum stop karenge, kyunki array reverse ho chuka hoga.
Time Complexity:
O(n), kyunki hum array ke har element ko ek baar swap karte hain.
  */
