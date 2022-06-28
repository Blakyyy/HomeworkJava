package HomeworkJava;
    // Написать программу вычисления n-ого треугольного числа. T=n(n+1)/2
import java.util.List;
import java.util.ArrayList;

public class task1Homework {
    public static void main(String[] args) {
        nNumber(10);
    }
    public static void nNumber(int n) {
        List<Integer> integers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            int t = i*(i+1)/2;
            integers.add(t);
            for (int value : integers) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
            
        }
    }

