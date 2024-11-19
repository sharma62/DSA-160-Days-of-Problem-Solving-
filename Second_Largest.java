// Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.

// Note: The second largest element should not be equal to the largest element.

// Examples:

// Input: arr[] = [12, 35, 1, 10, 34, 1]
// Output: 34
// Explanation: The largest element of the array is 35 and the second largest element is 34.
// Input: arr[] = [10, 5, 10]
// Output: 5
// Explanation: The largest element of the array is 10 and the second largest element is 5.
// Input: arr[] = [10, 10, 10]
// Output: -1
// Explanation: The largest element of the array is 10 and the second largest element does not exist.
// Constraints:
// 2 ≤ arr.size() ≤ 105
// 1 ≤ arr[i] ≤ 105



// Approch 1= sort the array in non-desecending order we that longest element will be at index n-1. so that start n-2 and traverse remain array in reverse order and encounter an element which is not equal 
              // largest element , return it as 2nd largest element in the array . if all element are equal to longest ele then return -1
// TC = O(nlogn)

class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        int n = arr.length;
        Arrays.sort(arr);
        for(int i = n-2;i>=0;i--){
            if(arr[i]!= arr[n-1]){
                return arr[i];
            }
        }
    return -1;
    }
}
 // Batter approh : The apprach is to traverse the array twice. in 1st traverse , find largest ele . In the 2nd traversal find the largest ele ignoring the one we found the 1st ele.
// TC : O(n)

class Solution {
    public int getSecondLargest(int[] arr) {
            int n = arr.length;
            int largest = -1 ,secLargest = -1;
        
        for(int i= 0;i<n;i++){
             if(arr[i]>largest){
                 largest = arr[i];
             }
        }
        // 35
        for(int i= 0;i< n;i++){
             if(arr[i]>secLargest && arr[i]!=largest){
                 secLargest = arr[i];
             }
        }
        
    }
}
