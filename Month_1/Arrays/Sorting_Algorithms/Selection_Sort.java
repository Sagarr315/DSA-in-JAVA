public class Main {
    public static void main(String[] args) {
        int[] my_array = {64, 34, 25, 12, 22, 11, 90, 5};
        int n = my_array.length;

        for (int i = 0; i < n; i++) {
            int min_index = i;
            for (int j = i+1; j < n; j++) {
                if (my_array[j] < my_array[min_index]) {
                    min_index = j;
                }
            }
            int temp = my_array[i];
            my_array[i] = my_array[min_index];
            my_array[min_index] = temp;
        }

        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(my_array[i] + " ");
        }
        System.out.println();
    }
}
/* output:Sorted array: 5 11 12 22 25 34 64 90

How It Works
 * 
Input:
    The program takes an array of unsorted integers.
    Example: [64, 34, 25, 12, 22, 11, 90, 5]

Goal:
    Sort the array in ascending order using Selection Sort.

Selection Sort Logic:
    Idea:
        In each pass, find the smallest element in the unsorted part,
        and swap it with the first element of the unsorted part.

Step-by-Step Process:
    Outer Loop (Index i):
    Goes from 0 to n-1
    At each step, assumes element at index i is the smallest.

Inner Loop (Index j):
    Starts from i + 1 to n-1
    It finds the actual minimum value's index in the remaining array.

Swapping:
    After finding the correct min_index, it swaps the element at i with the element at min_index.
    This places the smallest value at its correct position in the sorted part.

Dry Run Example:
    Initial: [64, 34, 25, 12, 22, 11, 90, 5]

Pass 1 (i=0):
    Find min from index 0 to end → min is 5 at index 7
    Swap 64 and 5 → [5, 34, 25, 12, 22, 11, 90, 64]

Pass 2 (i=1):
    Min from index 1 to end → min is 11 at index 5
    Swap 34 and 11 → [5, 11, 25, 12, 22, 34, 90, 64]

Pass 3 (i=2):
    Min from index 2 to end → min is 12 at index 3
    Swap 25 and 12 → [5, 11, 12, 25, 22, 34, 90, 64]

Pass 4 (i=3):
    Min is 22 → Swap with 25 → [5, 11, 12, 22, 25, 34, 90, 64]

Pass 5 (i=4):
    Already correct, skip or swap with itself.
    Continue until entire array is sorted.

Final Output:
    Sorted array: 5 11 12 22 25 34 64 90

Key Features
    In-Place Sort: Does not use extra space.
    Simple Logic: Easy to understand and implement.
    Time Complexity: O(n²) — not suitable for very large datasets.
    Stable: No, selection sort is not stable by default.
    Best Use Case: Useful when memory is limited and array size is small. 
    
 * Time Complexity:
 * - Worst Case: O(n^2)
 * - Best Case: O(n^2)     
 * - Average Case: O(n^2)
 *
 * Space Complexity:
 * - O(1) (in-place sorting)
 */

    
    */