package HomeworkJava;
import java.util.Random;
public class task2Homework {
    public static void main(String[] args) {
        whatNumber();
    }
    public static int whatNumber() {
        Random rand = new Random();
        int number = rand.nextInt(100);
        int number1 = number;
        int length = String.valueOf(number).length();
        int[] array = new int[length];
        int sum = 0;
        int res = 0;
        for (int i = 0; i < array.length; i ++) {
           int digit = number % 10;
           array[i] = digit;
           sum = sum + array[i];
           number = number / 10;
        }
        if (number1 % sum == 0) {
            res = number1;
        } 
        else {
            System.out.println("Число " + number1 + " не делится на сумму их цифр без остатка");
        }
        return res;
    }
}
