import java.util.Arrays;

public class ReverseArray {
    public static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Original array: " + Arrays.toString(arr));

        reverse(arr);

        System.out.println("Reversed array: " + Arrays.toString(arr));
    }
}

/* Output:
Original array: [10, 20, 30, 40, 50]
Reversed array: [50, 40, 30, 20, 10]


/*How It Works

Input: The program takes an integer array (like {10, 20, 30, 40, 50}) as input.

Two-Pointer Technique:
    It uses two pointers (indices):
    left starts at the beginning of the array (index 0)
    right starts at the end of the array (last index)

Swapping Process:
    The elements at left and right positions are swapped
    Then left moves forward (increments)right moves backward (decrements)
    This continues until left and right meet or cross each other

In-Place Modification:
    The array is modified directly (no new array is created)
    The original array gets reversed

Key Features
    Efficiency: Only needs to iterate through half of the array (O(n/2) operations)
    Memory Efficient: Works "in-place" without needing extra storage
    Simple Logic: Clean implementation of the two-pointer technique */