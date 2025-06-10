public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];      // element to be inserted
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;   // Insert the key at correct position
        }
    }

    public static void main(String[] args) {
        int[] my_array = {12, 11, 13, 5, 6};

        insertionSort(my_array);

        // Print sorted array
        for (int num : my_array) {
            System.out.print(num + " ");
        }
    }
}

/* output: [5, 6, 11, 12, 13]

How It Works
Input:
The program takes an array of integers.
Example: [12, 11, 13, 5, 6]

Goal:
Sort the array in ascending order using Insertion Sort.

•	The algorithm divides the array into a sorted and unsorted part.
•	Initially, the sorted part contains just the first element.
•	It picks the next element (key) from the unsorted part and inserts it into the correct position in the sorted part by shifting larger elements one position ahead.

Step-by-Step Process:
1.	Start from index i = 1 (second element).
2.	Set key = arr[i] (the element to insert).
3.	Compare key with elements before it (arr[j] where j = i-1, i-2, ...):
o	While arr[j] is greater than key, shift arr[j] one position to the right.
4.	Insert key in the correct position where no element before it is greater.

Dry Run Example:
Initial: [12, 11, 13, 5, 6]
i	key	        Action	                                    Array State
1	11	Compare 11 and 12 → 12 > 11 → shift 12 right	[12, 12, 13, 5, 6]
		Insert 11 at index 0	                        [11, 12, 13, 5, 6]
2	13	13 > 12 → no shifting	                        [11, 12, 13, 5, 6]
3	5	Shift 13, 12, 11 right	                        [11, 11, 12, 13, 6]
		Insert 5 at index 0	                            [5, 11, 12, 13, 6]
4	6	Shift 13, 12, 11 right                      	[5, 11, 11, 12, 13]
		Insert 6 at index 1	                            [5, 6, 11, 12, 13]

Final Sorted Array:
[5, 6, 11, 12, 13]

Time Complexity
•	Best case: O(n)
    (When the array is already sorted — only one comparison per element)
•	Average case: O(n²)
•	Worst case: O(n²)
    (When the array is sorted in reverse order — maximum shifts per insertion)

Space Complexity
•	O(1) — In-place sorting, no extra array or data structures used.

Key Features
•	Simple and intuitive.
•	Stable: Maintains the relative order of equal elements.
•	Good for small or nearly sorted datasets.
•	Not suitable for large unsorted arrays due to O(n²) time.

*/