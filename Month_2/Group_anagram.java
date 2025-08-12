import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Create a map to group anagrams
        Map<String, List<String>> map = new HashMap<>();
        
        for (String s : strs) {
            // Convert string to char array and sort
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            
            // Add to the appropriate group
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        GroupAnagrams solution = new GroupAnagrams();
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result = solution.groupAnagrams(strs);
        System.out.println(result);
    }
}
/* Output: [[eat, tea, ate], [tan, nat], [bat]]

*How the Group Anagrams Algorithm Works:
    Hash Map Grouping: Uses a hash map where the key is the sorted version of a word, and the value is a list of words with the same sorted characters
    String Sorting: Each word is converted to a character array, sorted alphabetically, and converted back to a string to form the key
    Group Formation: Words with identical sorted keys are placed in the same group (anagram group)
    Collection of Results: The final grouped anagrams are returned as a list of lists

*Time Complexity:
    Worst Case: O(n * k log k)  
        - n = number of words  
        - k = average length of each word  
        - Sorting each word takes O(k log k), and we do it for n words
    Best Case: O(n * k log k) (All words are already grouped in order but still need sorting)
    Average Case: O(n * k log k)

*Space Complexity:
    O(n * k) (Storage for hash map keys and lists of words)

*Key Characteristics:
    Does not require input strings to be in any specific order
    Works for any set of characters (including uppercase, lowercase, or symbols)
    Uses sorting of characters as the grouping criterion
    Can be adapted to use a frequency array (O(k)) instead of sorting for better performance
*/
