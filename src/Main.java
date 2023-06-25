import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int length;
        int temp = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array, n: ");
        length = scanner.nextInt();
        System.out.println("Enter the elements of the array:");

        int[] array = new int[length];

        // Read the elements of the array from the user
        for (int i = 0; i < array.length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Sorted array: ");
        // Sort the array in ascending order using the bubble sort algorithm
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    // Swap the elements if they are in the wrong order
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            System.out.print(array[i] + " ");
        }
    }
}
