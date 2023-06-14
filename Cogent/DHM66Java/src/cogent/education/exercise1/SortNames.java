package cogent.education.exercise1;

import java.util.Scanner;

public class SortNames {

    public static void swap(int i, int j, String[] names) {
        String tempName = names[i];
        names[i] = names[j];
        names[j] = tempName;
    }

    public static void sortNamesAscendingOrder(String[] names) {
        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].compareTo(names[j]) > 0) {
                    swap(i, j, names);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 5;

        String[] names = new String[size];
        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter a names:");
            names[i] = sc.nextLine();
        }

        sortNamesAscendingOrder(names);

        for (String name: names) {
            System.out.print(name + " ");
        }

    }
}
