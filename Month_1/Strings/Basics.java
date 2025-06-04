//String Basics: Immutability, concatenation, slicing

public class StringExample {
    public static void main(String[] args) {
        String str = "Hello";
        str.concat(" World");
        System.out.println(str); // Output: Hello     because the string is immutable 
    }
}   /*Why?
    str.concat(" World") creates a new String "Hello World" but you didn’t assign it.
    Original str remains "Hello"  */

str = str.concat(" World");
System.out.println(str); // Output: Hello World


//String Concatenation

String first = "Java";
String second = " Programming";
String result = first + second;
System.out.println(result); // Output: Java Programming

String result2 = first.concat(second);
System.out.println(result2); // Output: Java Programming

//String Slicing (Substring)

String name = "JavaProgramming";

System.out.println(name.substring(0, 4));   // Output: Java
System.out.println(name.substring(4));      // Output: Programming
System.out.println(name.substring(0, 8));   // Output: JavaProg



// replace, split, join
 String s = "apple,banana,orange";

        // split the string by commas and store the result in an array
        String[] fruits = s.split(",");
        System.out.println(Arrays.toString(fruits)); 
        // Output: [apple, banana, orange]

        // replace "banana" with "grape" in the original string
        String replaced = s.replace("banana", "grape");
        System.out.println(replaced); 
        // Output: apple,grape,orange

        // join the fruits array using "-" as separator
        String joined = String.join("-", fruits);
        System.out.println(joined); 
        // Output: apple-banana-orange
  