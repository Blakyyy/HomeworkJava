// Сократить строку вида aaabbbssskkk до a3b3s3k3

package HomeworkJava;
public class task2HWsem2 {
    public static void main(String[] args) {
        String str = "aaabbbssskkk";
        Compare(str);
    }
    public static void Compare(String str) {
        String[] strArr = str.split("");
        String newString = "";
        String letter = strArr[0];
        int count = 1;
        for (int i = 1; i < strArr.length; i++) {
            String stringFromArr = strArr[i];
            int var1 = stringFromArr.compareTo(letter);
            if (var1 == 0) {
                count = count + 1;
            }
            else {
                newString = newString + letter + Integer.toString(count);
                count = 1;
                letter = strArr[i];
            }
            
        } newString = newString + letter + Integer.toString(count);
        System.out.println(newString);
    }
}
