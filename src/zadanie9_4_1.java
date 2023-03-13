import java.util.Scanner;

public class zadanie9_4_1 {
    // 9. Переведите переменную из char в string.
    public static void main(String[] args) {
        System.out.println("Один из вариантов: ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter char: ");
        char c = scanner.next().charAt(0);
        System.out.println(c);
        int charCode = c;
        String str = Integer.toString(charCode);
        System.out.println("The char converted to String is: " + str);
        //Источник: https://java-blog.ru/osnovy/perevod-int-string-java
        System.out.println("или");
        //String str2 = Character.toString(g);
        String str2 = String.valueOf(c);
        System.out.println("(Method 2) The char converted to String is: " + str2);
        System.out.println("Ответ: Сконвертировать из char в string можно с помощью методов: Integer.toString(), \nлибо String.valueOf().");
    }
}
