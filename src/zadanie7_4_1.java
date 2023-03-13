public class zadanie7_4_1 {
    // 7. Придумайте способ переводить из int в boolean и наоборот.
    public static void main(String[] args) {
        int int_a = 1;
        boolean boolean_b = int_a == 1;
        System.out.println(boolean_b);
        System.out.println("1. Конвертировать из int в boolean можно с помощью выражения boolean Boolean_b=Int_a==1");
        System.out.println("");
        boolean d = true;  // или можно ввести false
        int val = d ? 1 : 0; // Тернарный оператор
        System.out.println(val);
        System.out.println("2. Конвертировать из boolean в int можно с помощью следующего преобразования переменных: \nboolean d = true; \nint val = d ? 1 : 0;");
    }
}
