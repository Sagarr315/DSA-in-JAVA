public class RunningSum {
    public static int[] runningSum(int[] nums) {
        // Traverse the array starting from index 1
        for (int i = 1; i < nums.length; i++) {
            // Update the current index with sum of current and previous index
            nums[i] += nums[i - 1];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] result = runningSum(arr);

        // Print the result
        System.out.print("Running Sum: ")
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

/*output: Running Sum: 1 3 6 10

* How It Works

Input:
    The program takes an array of integers as input.
    For example: [1, 2, 3, 4]

Concept:
    It calculates the running sum of the array.
    Running sum means:
    Each element at index i becomes the sum of all elements from index 0 to i.

So for [1, 2, 3, 4]:

Index 0: 1

Index 1: 1 + 2 = 3

Index 2: 1 + 2 + 3 = 6

Index 3: 1 + 2 + 3 + 4 = 10
→ Result: [1, 3, 6, 10]

Loop Process:
    The program starts a loop from index 1 and goes till the end of the array.

At each step:
    It adds the previous element (nums[i - 1]) to the current element (nums[i])
    The result is stored back at index i (i.e., modifies original array)

In-place Update:
    No extra space is used.
    The input array is directly updated to hold the running sums.

Return Value:
    After completing the loop, the modified array is returned.
    This array now contains the running sums.

Output Example:
    Input: [1, 2, 3, 4]
    Output: Running Sum: 1 3 6 10

Key Features
    In-place Update: Uses the input array itself to save memory.
    Simple Logic: Just one loop and a single formula: nums[i] += nums[i - 1]
    Efficient: Time complexity is O(n), space complexity is O(1).
    Useful Concept: Running sum is used in prefix sums, stats, and charts.

*/