package day8;

public class Task1 {
    public static void main(String[] args) {
        String string1 = "";

        for (int i = 0; i <= 20000; i++) {
            string1 += i + " ";
        }
        System.out.println(string1);
        System.out.println("Строка оставлена конкатенацией за " + System.nanoTime());


        StringBuilder string2 = new StringBuilder();

        for (int i = 0; i <= 20000; i++) {
            string2.append(i + " ");
        }
        System.out.println(string2);
        System.out.println("Строка оставлена через StringBuilder за " + System.nanoTime());
    }
}
