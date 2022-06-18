package HomeworkJava;
    // Написать программу вычисления n-ого треугольного числа. T=n(n+1)/2

public class task1Homework {
    public static void main(String[] args) {
        nNumber(10);
    }
    public static void nNumber(int n) {
        for (int i = 0; i <= n; i++) {
            int t = i*(i+1)/2;
            for (int j = 0; j <= t; j++) {
                System.out.print(j);
            }
            System.out.println();
            
        }
    }
}
