import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((c == ')' && top != '(') || 
                    (c == '}' && top != '{') || 
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses solution = new ValidParentheses();
        String s = "()[]{}";
        System.out.println(solution.isValid(s)); // true
    }
}
/* Output: true

*How the Valid Parentheses Algorithm Works:
    Stack Usage: Uses a stack to keep track of opening brackets
    Push Operation: Every time an opening bracket '(', '{', '[' is found, push it onto the stack
    Match & Pop: For every closing bracket ')', '}', ']', check if the stack is not empty and the top element matches the correct opening bracket
    Early Termination: If a mismatch occurs or a closing bracket appears without a corresponding opening one, return false immediately
    Final Check: At the end, if the stack is empty, the string is valid; otherwise, invalid

*Time Complexity:
    Worst Case: O(n) (Traverse the entire string once, n = length of string)
    Best Case: O(1) (Immediate mismatch at the start)
    Average Case: O(n) (Single pass with stack operations)

*Space Complexity:
    O(n) (Stack may store all opening brackets in the worst case, e.g., "(((((")

*Key Characteristics:
    Ensures that brackets are closed in the correct order (Last In, First Out behavior of stack)
    Works for mixed types of brackets: (), {}, []
    Returns false immediately if mismatch or extra closing bracket occurs
    Uses only one stack and single pass (efficient solution)
    Common interview problem to test understanding of stacks and string traversal
*/
