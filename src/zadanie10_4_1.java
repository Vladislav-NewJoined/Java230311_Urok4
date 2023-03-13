import java.util.Scanner;

public class zadanie10_4_1 {
    // 10. Переведите переменную из char в int и наоборот.
    public static void main(String[] args) {
        System.out.println("Перевод из char в int:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter char: ");
        char c = scanner.next().charAt(0);
        System.out.println(c);
        int charCode = c;
        System.out.println(charCode);
        System.out.println("Перевод из int в char:");
        System.out.print("Please enter int: ");
        int charCode2 = scanner.nextInt();
        System.out.println(charCode2);
        char value = (char)charCode2;
        System.out.println(value);
        System.out.println("ИТОГОВЫЙ ОТВЕТ НА ЗАДАНИЕ: \nПеревод из char в int: \nint charCode = c; (где c - это char) \nПеревод из int в char: \nchar value = (char)charCode2; где charCode2 - это int");
    }
}