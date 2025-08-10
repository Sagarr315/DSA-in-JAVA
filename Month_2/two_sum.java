import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // Create a hash map to store value-index pairs
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            // Check if complement exists in the map
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            // Put current number and its index in the map
            map.put(nums[i], i);
        }
        return new int[] {}; // No solution found
    }

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}

/* Output: [0, 1]

*How the Two Sum Algorithm Works:
    Hash Map Storage: Stores each number with its index as we iterate
    Complement Calculation: For each number, calculates the value needed to reach the target (target - current number)
    Instant Lookup: Checks in O(1) time if the complement already exists in the hash map
    Early Return: If found, immediately returns the stored index of the complement and current index
    Iteration Completion: If no pair is found, returns an empty array

*Time Complexity:
    Worst Case: O(n) (Need to check all elements once)
    Best Case: O(1) (First two numbers form the target sum)
    Average Case: O(n) (Single pass through the array)

*Space Complexity:
    O(n) (Hash map may store all elements in the worst case)

*Key Characteristics:
    Works for both positive and negative numbers
    Returns the first valid pair found
    Much faster than the brute-force O(n²) approach due to O(1) lookups
    Hash map avoids re-checking previous elements
    Does not require the array to be sorted
*/
