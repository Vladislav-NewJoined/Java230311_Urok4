public class zadanie11_4_1 {
    // 11. Пусть int равен от 30 до 150. Переведите каждый int в char, и выведите таблицу, где на каждой строчке есть int и соответствующий ему char
    public static void main(String[] args) {
        // инфо здесь: https://habr.com/ru/post/225901/

        int charCode = 30;
        char value = (char) charCode;
        while (charCode <= 150) {
            System.out.println(charCode + " " + value);
            charCode++;
            value = (char) charCode;
        }
    }
}
