public class Main {
    public static void main(String[] args) {
        int[] myArray = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int myTarget = 15;

        int result = binarySearch(myArray, myTarget);

        if (result != -1) {
            System.out.println("Value " + myTarget + " found at index " + result);
        } else {
            System.out.println("Target not found in array.");
        }
    }

    public static int binarySearch(int[] arr, int targetVal) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == targetVal) {
                return mid;
            }

            if (arr[mid] < targetVal) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}

/* Output:Value 15 found at index 7

*How Binary Search Works:
    Divide and Conquer: Repeatedly divides the sorted array into two halves
    Middle Element Check: Compares the target value with the middle element
    Range Reduction: Eliminates one half of the array based on the comparison
    Termination: Continues until the element is found or the search space is exhausted

*Time Complexity:
    Worst Case: O(log n) (Element at either end of the array)
    Best Case: O(1) (Element at the middle of the array)
    Average Case: O(log n)

*Space Complexity:
    O(1) (Uses constant extra space for iterative implementation)

*Key Characteristics:
    Requires the array to be sorted beforehand
    Much faster than linear search for large datasets (O(log n) vs O(n))
    Returns only the first occurrence if duplicates exist   
    Can be implemented both iteratively (shown here) and recursively    
    Mid-point calculation prevents overflow with: mid = left + (right - left)/2   */