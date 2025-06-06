import java.util.Arrays;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0; // slow pointer for place of unique element

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j]; // overwrite next unique
            }
        }

        return i + 1; // length of unique elements
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,4,5};
        int length = removeDuplicates(arr);

        System.out.println("Length of unique elements: " + length);
        System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOf(arr, length)));
    }
}

/* Output:
Length of unique elements: 5
Array after removing duplicates: [1, 2, 3, 4, 5]


* How It Works
Input:
    The program takes an integer array as input.
    For example: [1, 1, 2, 2, 3, 4, 4, 5].

Empty Check:
    First, it checks if the array is empty (length 0).
    If yes, it returns 0 immediately because there are no unique elements.

Initialization:
    A pointer i is initialized to 0.
    It represents the index of the last unique element found so far.

Loop through Array:
    Another pointer j starts from 1 and goes through the array until the end.
    j scans each element to find unique elements.

Comparison:
    For each j, the program compares nums[j] with nums[i].
    If they are different, it means nums[j] is a new unique element.
    Then, i is incremented to move to the next unique position, and nums[i] is updated to nums[j].
    If they are same, it means nums[j] is a duplicate and skipped.

Overwriting:
    This process effectively overwrites duplicates in the array by moving unique elements forward.

Return Value:
    After the loop ends, the program returns i + 1.
    This is the count of unique elements in the array.

Example:
    Input: [1, 1, 2, 2, 3, 4, 4, 5]
    Output: 5 (unique elements are [1, 2, 3, 4, 5])

Key Features
    In-place Operation: Modifies the original array without extra space.
    Efficient: Runs in O(n) time by scanning the array once.
    Simple Logic: Uses two pointers to identify and store unique elements.
    Accurate: Preserves the order of unique elements at the start of the array.*/
