public class zadanie5_4_1 {
    // 5. Составьте программу, которая переводит переменную из float в double
    public static void main(String[] args) {
        // инфо здесь: https://habr.com/ru/post/225901/
        //byte x = 10; //8 bit
        //short у = 10; //16 bit
        //int z = 10; //32 bit
        //long q = 10L; //64 bit
        //double d = 10.0 // 64 bit
        //float f = 10.0 // 32 bit

        float myFloat = 123.3F;
        double myDouble = myFloat;
        System.out.println(myDouble);
        System.out.println("Ответ на Задание 5: Переменная float завдается написанием буквы F (или f) после числового \n значения справа (если с точкой, т.е. дробное число). Она имеет меньший размер памяти (32 bit),\n нежели double (64 bit), поэтому конвертация из float в double происходит автоматически,\n т.н. 'неявным' способом. Пример в коде.");
    }
}