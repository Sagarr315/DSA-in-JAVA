public class ReverseStringUsingCharArray {
    public static String reverse(String str) {
        char[] chars = str.toCharArray(); // Convert to char array
        int left = 0, right = chars.length - 1;

        while(left < right) {
            // Swap characters
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        return new String(chars); // Convert back to string
    }

    public static void main(String[] args) {
        String input = "hello";
        String reversed = reverse(input); // call to method

        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);
    }
}


/* How It Works

Input: The program takes a string (like "hello") as input.

Conversion to Char Array:
    First, it converts the string into an array of characters.  
    For "hello", this becomes ['h', 'e', 'l', 'l', 'o'].

Two-Pointer Technique:
    It uses two "pointers" (indices) - one at the start (left) and one at the end (right) of the array.
    These pointers move towards each other, swapping characters at each step.

Swapping Process:
    The left character and right character swap places.
    Then left moves right (increments) and right moves left (decrements).
    This continues until they meet in the middle.

Result Conversion:
    After all swaps, the character array is converted back to a string.
    For "hello", it becomes "olleh".

Key Features
    Efficient: Only needs to go through half of the string to reverse it.
    In-Place: Does the reversal within the same array without creating a new one (memory efficient).
    Simple Logic: Easy to understand two-pointer approach. */