Array Modification: Space & Time Complexity Guide
1. When to Return int (Length Only)
Use Case:
•	In-place modification problems (e.g., removing duplicates, moving zeros)
•	Goal: Return metadata (e.g., new length) while modifying the original array
Example:
public static int removeDuplicates(int[] nums) {  // Modifies input array
    int i = 0;
    for (int j = 1; j < nums.length; j++) {
        if (nums[j] != nums[i]) nums[++i] = nums[j];
    }
    return i + 1;  // Returns length of unique elements
}

Complexity:
•	⏳ Time: O(n) (single pass)
•	💾 Space: O(1) (no extra space beyond pointers)
Pros:
•	Memory-efficient (no array copying)
•	Follows DSA competition patterns (e.g., LeetCode)
Cons:
•	Caller must handle the modified array carefully
________________________________________
2. When to Return int[] (New Array)
Use Case:
•	Immutable data requirements
•	Functional programming (avoid side effects)
Example:
public static int[] removeDuplicatesNewArray(int[] nums) {  // Returns new array
    HashSet<Integer> set = new HashSet<>();
    for (int num : nums) set.add(num);
    return set.stream().mapToInt(i -> i).toArray();
}

Complexity:
•	⏳ Time: O(n) (but slower due to HashSet overhead)
•	💾 Space: O(n) (new array + HashSet storage)
Pros:
•	Preserves original array
•	Cleaner API (no side effects)
Cons:
•	Higher memory usage
•	Slower for large datasets
________________________________________
3. Key Decision Factors
Factor	Return int (Length)	Return int[]
Memory Use	O(1)	O(n)
Time Complexity	Faster (single pass)	Slower (overhead)
Original Array	Modified	Preserved
Use Case	DSA/Competitions	Production (immutability)
________________________________________
4. Template for Your Code

// In-place modification (return length)
int solveInPlace(int[] arr) {
    // ... modify arr ...
    return length;  // e.g., unique element count
}

// New array return (immutable)
int[] solveNewArray(int[] arr) {
    int[] result = new int[arr.length];
    // ... build result ...
    return result;
}
________________________________________
5. When to Use Which?
•	Competitions/Interviews: Prefer int return (optimized)
•	Production Code: Use int[] if immutability matters
•	Large Data: Always prioritize in-place (int)


***Loop Styles in Java: Index vs For-Each***
1. Key Differences
Feature	Traditional for Loop (result[i])	Enhanced for Loop (num)
Access Method	Access via index (i)	Direct value iteration
Index Available	Yes (can use i)	No
Modification	Can modify array elements	Read-only (safe iteration)
Code Readability	More verbose	Cleaner intent
Bound Checks	Manual (risk of IndexOutOfBounds)	Automatic (safer)


2. DSA Implications
Time Complexity
•	Both loops are O(n) for traversing an array of size n.
•	Mythbuster: No significant performance difference in modern JVMs for simple iteration.
Space Complexity
•	Both use O(1) auxiliary space (only i or num is stored).
•	Exception: For-each creates a hidden iterator for collections (negligible overhead).

When to Use Which?
Use Case	Recommended Loop	Why?
Need indices	Traditional for	Required for index math
Modify elements	Traditional for	result[i] = x works
Read-only traversal	Enhanced for	Cleaner, less error-prone
Multi-array ops	Traditional for	Sync indices across arrays


3. Examples
Traditional for (Best for DSA Modifications)
// Reverse an array (requires indices)
for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
    int temp = arr[i];
    arr[i] = arr[j];  // Modification needs index access
    arr[j] = temp;
}
Enhanced for (Best for Read-Only)
// Summing values (no indices needed)
int sum = 0;
for (int num : arr) {
    sum += num;  // Direct value access
}
4. DSA Pro Tip
•	Competitions/Interviews: Use traditional for when solving in-place modification problems (e.g., two-pointer techniques).
•	Production Code: Prefer enhanced for for readability unless indices are critical.

5. Edge Cases
// WARNING: This doesn't modify the array!
for (int num : arr) {
    num *= 2;  // Modifies only the local `num` copy

