import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public static Integer[] createRandom() {
        Random number = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("List elements of array: ");
        for (int i = 0; i < 100; i++) {
            arr[i] = number.nextInt(100);
            System.out.print(arr[i]+ " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        Integer[] arr = createRandom();
        Scanner input = new Scanner(System.in);
        System.out.println("\nPlease enter the index of any element: ");
        try {
            int x = input.nextInt();
            System.out.println("The value of the element with index " + x + " is: " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Index exceeds the limit of the array!");
        } catch (InputMismatchException e) {
            System.err.println("The input value must be an integer!");
        }
    }
}
