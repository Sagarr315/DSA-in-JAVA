public class LastOccurrence {

    public static int lastOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                result = mid;
                low = mid + 1;
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
        int index = lastOccurrence(arr, target);
        System.out.println("Last Occurrence of " + target + " is at index: " + index);
    }
}

/* Output: Last Occurrence of 10 is at index: 4

*How Last Occurrence Binary Search Works:
    Modified Binary Search: Similar to standard binary search
    Store and Search Right: If target is found, store index and search right subarray
    Stops on Last: Continues until the last matching index is found
    Sorted Array: Works only if the input array is sorted

*Time Complexity:
    Worst Case: O(log n) — due to binary division
    Best Case: O(log n)
    Average Case: O(log n)

*Space Complexity:
    O(1) — constant space used (iterative version)

*Key Characteristics:
    Efficient in finding last appearance in sorted arrays with duplicates
    Returns index of last occurrence or -1 if not found
    Avoids unnecessary traversal after matching
    Suitable for frequency counting and range searching
    Can also be implemented recursively
*/
