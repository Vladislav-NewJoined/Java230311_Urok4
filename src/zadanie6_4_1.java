public class zadanie6_4_1 {
    // 6. Составьте программу, которая переводит переменную из double в float
    public static void main(String[] args) {
        // инфо здесь: https://habr.com/ru/post/225901/
        // double d = 10.0 // 64 bit
        // float f = 10.0 // 32 bit

        double myDouble = 123.3;
        float myFloat = (float) 123.3;

        System.out.println(myFloat);
        System.out.println("Ответ на Задание 6: Преобразование из double в float производится путём написания (float) перед именем\n переменной в правой части выражения. При этом необходимо следить за точностью вычислений, т.к. может быть\n потеряна дробная часть (после точки) (или ее точность) в итоговом числовом значении.");
    }
}