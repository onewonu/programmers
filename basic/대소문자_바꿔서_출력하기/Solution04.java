package basic.대소문자_바꿔서_출력하기;

import java.util.Scanner;

public class Solution04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < a.length(); i++) {
            stringBuilder.append(toggleCase(a.charAt(i)));
        }

        System.out.print(stringBuilder);
    }

    public static char toggleCase(char c) {
        if (Character.isUpperCase(c)) {
            return Character.toLowerCase(c);

        } else if (Character.isLowerCase(c)) {
            return Character.toUpperCase(c);
        }

        return c;
    }
}