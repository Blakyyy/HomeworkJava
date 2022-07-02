import java.util.Scanner;


// Написать метод, который проверяет валидность логина и пароля (где нибудь в переменных сохраните) и при помощи конструкции 
//try-catch рекурсивно принимайте данные (нужно ограничить колиичество попыток до 6 и после 3 попытки должно быть сообщение, 
// мол вы привысили количество попыток, немного пододождите тут можете поток заслипить на некоторое время. А когда попытки кончатся - выйти)

public class task2Homework3 {
    public static void main(String[] args) {
     tryEnter(5);
    }
    public static void tryEnter(int maxCount) {
        Scanner scanner = new Scanner(System.in);
        String login = "admin";
        String pass = "qwerty";
        System.out.println("Please enter login: ");
        String tryLogin = scanner.nextLine();
        System.out.println("Please enter password: ");
        String tryPass = scanner.nextLine();
        try {
           if(login.equals(tryLogin) == false && pass.equals(tryPass) == false) {
            int exception = 1 / 0;
            System.out.println(exception);
           }
           else if (login.equals(tryLogin) == true && pass.equals(tryPass) == true) {
            System.out.println("You are in!");
           }
        }
        catch (Exception e) {
            if (maxCount == 3) {
                try {
                    System.out.println("Try again in 10 seconds");
                    Thread.sleep(10000);
                } catch(InterruptedException y) {
                    System.out.println("I should have been sleeping now :) ");
                }
                
            }
            if (maxCount == 0) {
                System.out.println("You tried to many times, programm is closed");
                System.exit(0);
            }
            System.out.println("Login or password are incorrect, please try again");
            tryEnter(maxCount - 1);
        }
        scanner.close();
    }
    

}
