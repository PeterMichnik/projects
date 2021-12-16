package arrays;

import java.util.Scanner;

public class ArraysExercise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size array: ");
        int sizeArray = sc.nextInt();
        int[] array = new int[sizeArray];
        int i = 0;

        while (i < sizeArray) {
            System.out.print("Enter a " + (i + 1) + " number: ");
            int number = sc.nextInt();
            array[i] = number;
            System.out.println("Element at index " + i + " : " + array[i]);
            System.out.println(" ");
            i++;
        }
        int sum = 0;
        for (int y = 0; y < array.length; y++) {
            sum += array[y];
        }
        System.out.println("Array sum: " + sum);
        System.out.println("Average: " + sum / sizeArray);
    }
}
