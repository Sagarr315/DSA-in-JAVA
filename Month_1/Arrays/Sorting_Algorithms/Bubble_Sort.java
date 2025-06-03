public class Main {
    public static void main(String[] args) {
        int[] my_array = {64, 34, 25, 12, 22, 11, 90, 5};
        int n = my_array.length;

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (my_array[j] > my_array[j+1]) {
                    int temp = my_array[j];
                    my_array[j] = my_array[j+1];
                    my_array[j+1] = temp;
                }
            }
        }

        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(my_array[i] + " ");
        }
        
    }
}

/*output: Sorted array: 5 11 12 22 25 34 64 90

 * How Bubble Sort Works:
 * - Repeatedly steps through the list.
 * - Compares adjacent elements.
 * - Swaps them if they are in the wrong order.
 * - Each iteration "bubbles" the largest unsorted element to the end of the array.
 * - The process repeats until the array is sorted.

 * Example Input:  {64, 34, 25, 12, 22, 11, 90, 5}
 * Example Output: Sorted array: 5 11 12 22 25 34 64 90

 * Time Complexity:
 * - Worst Case: O(n^2)
 * - Best Case (Already Sorted): O(n)
 * - Average Case: O(n^2)

 * Space Complexity:
 * - O(1) (in-place sorting) */