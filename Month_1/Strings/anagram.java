// File: ValidAnagram.java

import java.util.Arrays;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        // If lengths differ, they can't be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Convert both strings to character arrays
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        // Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare sorted arrays using two-pointer style
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "listen";
        String t = "silent";

        boolean result = isAnagram(s, t);
        System.out.println("Are they anagrams? " + result);
    }
}
 /*output:Are they anagrams? true

* How It Works

Input:
    The program takes two strings as input.
    For example: "listen" and "silent".

Length Check:
    First, it checks if both strings are of the same length.
    If not, it returns false immediately.
    For example: "abc" and "ab" are not the same length, so not anagrams.

Conversion to Char Arrays:
    Both strings are converted into arrays of characters.
    "listen" becomes ['l', 'i', 's', 't', 'e', 'n']
    "silent" becomes ['s', 'i', 'l', 'e', 'n', 't']

Sorting Process:
    The character arrays are then sorted alphabetically.
    After sorting:
        "listen" → ['e', 'i', 'l', 'n', 's', 't']
        "silent" → ['e', 'i', 'l', 'n', 's', 't']

Comparison:
    The program compares both sorted arrays character by character.
    If all characters at each position match, the strings are anagrams.
    If any character differs, it returns false.

Final Result:
    If all characters matched, it returns true.
    For "listen" and "silent", sorted arrays are equal, so output is true.

Key Features
    Simple Logic: Uses sorting and basic comparison.
    Reliable: Works for any pair of strings with same characters.
    Accurate: Ensures both character content and frequency match.
    Easy to Understand: Clean step-by-step checking using sorting.
*/

