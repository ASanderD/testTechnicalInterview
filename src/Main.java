/*
Билет № 4
Задача
Напишите код, с помощью которого можно разделить строку на части
*/

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str1 = "У Лукоморья дуб зеленый!";
        String[] split = str1.split(" ", 3);
        System.out.println(Arrays.toString(split));
        String str2 = str1.substring(str1.length() / 2);
        System.out.println(str2);

    }
}