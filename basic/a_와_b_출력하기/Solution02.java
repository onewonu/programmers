package basic.a_와_b_출력하기;

import java.util.Scanner;

public class Solution02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("a = %d\nb = %d", a, b);

        sc.close();
    }
}