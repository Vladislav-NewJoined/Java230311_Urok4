public class zadanie8_4_1 {
    // 8. Придумайте способ переводить из String в boolean.
    public static void main(String[] args) {

        String s1 = "true";
        String s2 = "TRUE";
        String s3 = "Any text";

        boolean b1=Boolean.parseBoolean(s1);
        boolean b2=Boolean.parseBoolean(s2);
        boolean b3=Boolean.parseBoolean(s3);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        System.out.println("Переводить из String в boolean можно при помощи метода Boolean.parseBoolean(string)");
    }
}