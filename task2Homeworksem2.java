package HomeworkJava;
//метод который эмулирует работу динамического массива
public class task2Homeworksem2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9 ,10};
        int newNumber = 11;
        Array(arr, newNumber);
    }
   public static int[] Array(int[] arr, int newNumber) {
    int[] dynamicArr = new int[arr.length + 1];
    for (int j = 0; j < arr.length; j++) {
        dynamicArr[j] = arr[j];
    }
    dynamicArr[arr.length] = newNumber;
        return dynamicArr;
   }
}