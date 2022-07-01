// Cоздать карту (Map), будет хранить в себе данные телефонной книги (Фамилии и телефонные номера), если будут дубликаты фамилий, то должны выводиться оба номера
// (если помним Map не может хранить дубликаты, будет заменять номер телефона по ключу, нужно подумать как не допустить такого)
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Task1Homework3 {   
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    map(scanner);
   }
   public static void map(Scanner scanner) {
    Map<String, ArrayList<String>> multiValueMap = new HashMap<String, ArrayList<String>>();
    System.out.println("Do you want to add new contact? ");
    String answer = scanner.nextLine();
    while (answer.equalsIgnoreCase("yes") == true) {
        System.out.println("Please insert a surname: ");
        String surname = scanner.nextLine();
        multiValueMap.put(surname, new ArrayList<String>());
        System.out.println("Please insert a number: ");
        String number = scanner.nextLine();
        multiValueMap.get(surname).add(number);
        System.out.println("Do you want to add another number to this contact?: ");
        String anothernumber = scanner.nextLine();
        while (anothernumber.equalsIgnoreCase("yes")) {
            System.out.println("Please insert a new number: ");
            String newnum = scanner.nextLine();
            multiValueMap.get(surname).add(newnum);
            System.out.println("Another number?: ");
            anothernumber = scanner.nextLine();
        }
        if (anothernumber.equalsIgnoreCase("yes") == false) {
            System.out.println("Do you want to add another contact?: ");
            answer = scanner.nextLine();
        }
        System.out.println(multiValueMap);
        
    }
    

   }
}
