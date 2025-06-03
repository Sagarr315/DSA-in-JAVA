public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 9, 5};
        int targetVal = 9;

        int result = linearSearch(arr, targetVal);

        if (result != -1) {
            System.out.println("Value " + targetVal + " found at index " + result);
        } else {
            System.out.println("Value " + targetVal + " not found");
        }
    }

    public static int linearSearch(int[] arr, int targetVal) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == targetVal) {
                return i;
            }
        }
        return -1;
    }
}

/*output: Value 9 found at index 3

*How Linear Search Works:
    Sequential Checking: Examines each element in the array one by one from start to end
    Direct Comparison: Compares each element directly with the target value
    Immediate Return: Returns the index immediately when a match is found
    Complete Scan: If no match is found after scanning the entire array, returns -1

*Time Complexity:
    Worst Case: O(n) (Target is last element or not present)
    Best Case: O(1) (Target is first element)
    Average Case: O(n)

*Space Complexity:
    O(1) (Uses constant extra space)

*Key Characteristics:
    Works on both sorted and unsorted arrays
    Simple to implement
    Inefficient for large datasets compared to binary search (O(n) vs O(log n))
    Only returns the first occurrence if duplicates exist */