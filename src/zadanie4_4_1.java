public class zadanie4_4_1 {
    // 4. Составьте программу, которая переводит переменную из long в int
    public static void main(String[] args) {
        // инфо здесь: https://habr.com/ru/post/225901/
        //byte x = 10; //8 bit
        //short у = 10; //16 bit
        //int z = 10; //32 bit
        //long q = 10L; //64 bit

        long myLong = 123;
        int myInt = (int) myLong;

        System.out.println("Ответ на Задание 4: Переменная long задается написанием, при необходимости, буквы L после\n значения в правой части. При задании переменной типа int (которая конвертируется из long), нужно поставить\n в скобках (int) перед именем переменной в правой части выражения.\n Пример в коде.");
    }
}