package cogent.education.exercise2;
import java.util.*;

public class SequentialSearch {

    public static int search(int[] arr, int target) {
        int found = -1;

        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                found = i;
            }
        }

        return found;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 5;
        int array[] = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number:");
            array[i] = sc.nextInt();
        }

        System.out.println("Enter a number to find:");
        int target = sc.nextInt();
        int answer = search(array, target);

        if (answer == -1) {
            System.out.println("Element was not found");
        } else {
            System.out.println("Element was found at index " + answer);
        }

    }
}
