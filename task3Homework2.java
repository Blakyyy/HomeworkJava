// используя минимальное колличество попыток найти загаданное число

package HomeworkJava;

import java.util.Scanner;
public class task3Homework2 {
    public static void main(String[] args) {
        array();
    }
    public static void array() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int left = array.length - array.length;
        int right = array.length - 1;
        int mid = (right + left) / 2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter which number you want to guess: ");
        int num = scanner.nextInt();
        scanner.close();
        boolean found = false;
        for (int n : array) {
            if (n == num) {
                found = true; 
            }
    }
        if (found == false) {
            System.out.println("Your number doesnt exist inside the bounds of array");
        }
        while (found == true) {
            while (num > array[mid]) {
                left = mid;
                mid = (left + right) / 2;
                if (mid == array.length - 2) {
                    mid = mid + 1;
                }
                
            }
            while (num < array[mid]) {
                right = mid;
                mid = (left + right) / 2;
            }
            if (num == array[mid]) {
                System.out.println("Your number has index " + mid);
                found = false;
            }
        }
        

    }
}
