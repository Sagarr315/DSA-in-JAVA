public class mergesort {

    public static void conquer(int arr[], int si, int mid, int ei) {
        int[] merged = new int[ei - si + 1];

        int indx1 = si;
        int indx2 = mid + 1;
        int x = 0;

        while (indx1 <= mid && indx2 <= ei) {
            if (arr[indx1] <= arr[indx2]) {
                merged[x++] = arr[indx1++];
            } else {
                merged[x++] = arr[indx2++];
            }
        }

        while (indx1 <= mid) {
            merged[x++] = arr[indx1++];
        }

        while (indx2 <= ei) {
            merged[x++] = arr[indx2++];
        }

        // Copy merged array back to original array
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void divide(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si, mid, ei);
    }

    public static void main(String[] args) {
        int[] arr = {6, 2, 5, 4, 7, 3, 8};
        int n = arr.length;

        divide(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

/*output : 2,3,4,5,6,7,8

How It Works – Merge Sort

Input:
The program takes an array of integers.
Example: [6, 2, 5, 4, 7, 3, 8]

Goal:
Sort the array in ascending order using Merge Sort.

• The algorithm uses the Divide and Conquer strategy.
• First, it divides the array into halves recursively until each subarray has only one element.
• Then, it merges those subarrays back together in sorted order.
• During merging, it compares elements from the two halves and builds a sorted array.

Step-by-Step Process:
1. If the start index >= end index, return (base case).
2. Find the middle index: mid = (start + end) / 2
3. Recursively divide the array:
    - Left part: start to mid
    - Right part: mid + 1 to end
4. Conquer step: Merge both sorted halves:
    - Compare elements from both parts.
    - Copy the smaller element to the merged array.
    - Copy remaining elements from both parts (if any).
    - Copy merged array back into original array.

Dry Run Example:
Initial: [6, 2, 5, 4, 7, 3, 8]

1. Divide [6, 2, 5, 4, 7, 3, 8] → [6, 2, 5, 4] and [7, 3, 8]
2. Divide [6, 2, 5, 4] → [6, 2] and [5, 4]
3. Divide [6, 2] → [6] and [2] → Merge → [2, 6]
4. Divide [5, 4] → [5] and [4] → Merge → [4, 5]
5. Merge [2, 6] and [4, 5] → [2, 4, 5, 6]
6. Divide [7, 3, 8] → [7] and [3, 8]
7. Divide [3, 8] → [3] and [8] → Merge → [3, 8]
8. Merge [7] and [3, 8] → [3, 7, 8]
9. Final Merge [2, 4, 5, 6] and [3, 7, 8] → [2, 3, 4, 5, 6, 7, 8]

Final Sorted Array:
[2, 3, 4, 5, 6, 7, 8]

Time Complexity:
• Best case: O(n log n)
• Average case: O(n log n)
• Worst case: O(n log n)

Space Complexity:
• O(n) — Extra array used during merging

Key Features:
• Efficient for large datasets
• Stable: preserves the order of equal elements
• Divide and Conquer based
• Requires extra space (not in-place)

*/
