public class PalindromeCheck {
    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Characters don't match
            }
            left++;
            right--;
        }
        return true; // All characters matched
    }

    public static void main(String[] args) {
        String input = "racecar";
        System.out.println(input + " is palindrome? " + isPalindrome(input));

        input = "hello";
        System.out.println(input + " is palindrome? " + isPalindrome(input));
    }
}

/* Output:
racecar is palindrome? true
hello is palindrome? false

* How It Works
    Input:
    The program takes a string as input.
    Example: "racecar" or "hello"

Two-Pointer Setup:
    It uses two pointers:
    left starting at the beginning of the string (index 0)
    right starting at the end of the string (index str.length() - 1)

While Loop Logic:
    The loop continues as long as left < right:
    It compares the characters at the left and right positions.
    If they don’t match, the string is not a palindrome, so it returns false.
    If they match, it moves both pointers:
    left++ (move forward)
    right-- (move backward)
    This continues until all character pairs are checked.

Final Check:
    If the loop completes without finding any mismatch, all characters matched properly in mirrored positions → The string is a palindrome, so it returns true.
    Example 1: "racecar"
    Compare 'r' and 'r' → match
    Compare 'a' and 'a' → match
    Compare 'c' and 'c' → match

Now left == right at 'e', so loop ends
✅ All matched → return true

Example 2: "hello"

Compare 'h' and 'o' → not match
❌ Immediately return false

Key Features
    Efficient: Runs in O(n) time with O(1) space.
    No Extra Memory: Uses two-pointer approach, no need to reverse the string or use extra space.
    Accurate: Checks mirrored characters from both ends.
    Simple Logic: Clean and easy to follow.
    Real-Life Use Case: Useful in palindrome-based checks in algorithms and interview questions.

*/
