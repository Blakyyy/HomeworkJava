package HomeworkJava;
import java.util.Random;
public class task2Homework {
    public static void main(String[] args) {
        whatNumber();
    }
    public static int whatNumber() {
        Random rand = new Random();
        int number = rand.nextInt(100);
        int digit1 = number / 10;
        int digit2 = number % 10;
        int sum = digit1 + digit2;
        int res = 0;
        if (number % sum == 0) {
            res = number;
        } 
        else {
            System.out.println("Число " + number + " не делится на сумму их цифр без остатка");
        }
        return res;
    }
}
