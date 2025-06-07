import java.util.Arrays;

public class MoveZeros {
    public static void moveZerosToEnd(int[] nums) {
        int nonZeroIndex = 0; // position to place next non-zero element

        // Move non-zero elements forward
        for (int num : nums) {
            if (num != 0) {
                nums[nonZeroIndex++] = num;
            }
        }

        // Fill remaining positions with zeros
        while (nonZeroIndex < nums.length) {
            nums[nonZeroIndex++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        System.out.println("Before: " + Arrays.toString(arr));

        moveZerosToEnd(arr);

        System.out.println("After: " + Arrays.toString(arr));
    }
}

/* Output:
Before: [0, 1, 0, 3, 12]
After: [1, 3, 12, 0, 0]

* How It Works

Input:
    The program takes an array of integers that may contain zeros.
    Example: [0, 1, 0, 3, 12]

Goal:
    Move all the zeroes to the end of the array
    without changing the order of the non-zero elements.
    Do this in-place (no extra array).

Step 1 – Initialization:
    A variable nonZeroIndex is initialized to 0.
    This tracks the position where the next non-zero number should go.

Step 2 – Move Non-Zero Elements Forward:
    Using a for-each loop, the code goes through every element num in the array:
    If num is not zero, it is moved to index nonZeroIndex.
    nonZeroIndex is then incremented.
    This shifts all non-zero elements to the front of the array, maintaining order.

Step 3 – Fill Remaining with Zeros:
    After all non-zero elements have been moved:
    A while loop fills the rest of the array (from nonZeroIndex to end) with 0.

Example Execution:
Initial: [0, 1, 0, 3, 12]

Step	num	Action	Array State	nonZeroIndex
1	0	skip (zero)	[0, 1, 0, 3, 12]	0
2	1	move to index 0	[1, 1, 0, 3, 12]	1
3	0	skip	[1, 1, 0, 3, 12]	1
4	3	move to index 1	[1, 3, 0, 3, 12]	2
5	12	move to index 2	[1, 3, 12, 3, 12]	3

Fill remaining:
index 3 → 0 → [1, 3, 12, 0, 12]
index 4 → 0 → [1, 3, 12, 0, 0]
✅ Final output: [1, 3, 12, 0, 0]

Key Features
    Two-Pass Solution: First moves non-zeros, then fills with zeros.
    In-Place: No extra space used, modifies the original array.
    Preserves Order: Non-zero elements keep their relative positions.
    Efficient: Time complexity is O(n), space is O(1).
    Real Use Case: Used in data cleanup, memory compaction, UI rendering, etc.

*/
