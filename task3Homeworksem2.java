package HomeworkJava;
public class task3Homeworksem2 {
    // +Задано уравнение вида q + w = e, q, w, e >= 0. 
    // Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.
    public static void main(String[] args) {
            number();
    }
    public static void number() {
        int sum = 69;
        String x = "2?";
        String y = "5?"; 
        for (int i = 0; i < 10; i++) {
            String newX = x.replace(x, "2" + i);
            int newXInt = Integer.parseInt(newX);
            for (int j = 0; j < 10; j++) {
                String newY = y.replace(y, "4" + j);
                int newYint = Integer.parseInt(newY);
                if (newXInt + newYint == sum) {
                    System.out.println("x: " +newXInt + " y: " + newYint + " res: " + sum);
                }
            }
            }
        }
    }
