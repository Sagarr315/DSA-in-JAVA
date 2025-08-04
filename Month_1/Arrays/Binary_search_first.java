public class FirstOccurrence {

    public static int firstOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                result = mid;
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 10, 10, 10, 18, 20};
        int target = 10;
        int index = firstOccurrence(arr, target);
        System.out.println("First Occurrence of " + target + " is at index: " + index);
    }
}

/* Output: First Occurrence of 10 is at index: 2

*How First Occurrence Binary Search Works:
    Modified Binary Search: Works like standard binary search with a twist
    Store and Search Left: If target is found, store index and search left subarray
    Stops on First: Terminates when the first occurrence is confirmed
    Sorted Array: Requires array to be sorted beforehand

*Time Complexity:
    Worst Case: O(log n) — binary split every step
    Best Case: O(log n)
    Average Case: O(log n)

*Space Complexity:
    O(1) — constant space used in iterative implementation

*Key Characteristics:
    Efficient for finding first appearance in sorted arrays with duplicates
    Returns index of first occurrence or -1 if not found
    Faster than linear search (O(n)) in sorted arrays
    Can also be implemented recursively
    Avoids unnecessary traversal after finding the first match
*/
