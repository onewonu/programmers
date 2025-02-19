package basic.주사위_게임_3;

import java.util.HashMap;

public class Solution37 {
    public static void main(String[] args) {
        Solution37 solution = new Solution37();
        runTest(solution, 2, 2, 2, 2);
        runTest(solution, 4, 1, 4, 4);
        runTest(solution, 6, 3, 3, 6);
        runTest(solution, 2, 5, 2, 6);
        runTest(solution, 6, 4, 2, 5);
    }

    private static void runTest(Solution37 solution, int a, int b, int c, int d) {
        int result = solution.solution(a, b, c, d);
        System.out.printf("solution(%d, %d, %d, %d) = %d%n", a, b, c, d, result);
    }

    public int solution(int a, int b, int c, int d) {

        int[] dice = {a, b, c, d};
        HashMap<Integer, Integer> countDice = new HashMap<>();

        for (int number : dice) countDice.put(number, countDice.getOrDefault(number, 0) + 1);

        if (countDice.size() == 1) {
            return 1111 * a;

        } else if (countDice.size() == 2) {
            int p = 0, q = 0;

            for (Integer key : countDice.keySet()) {
                if (countDice.get(key) == 3) p = key;
                else q = key;
            }

            if (countDice.containsValue(3)) {
                return (10 * p + q) * (10 * p + q);
            } else {
                for (Integer key : countDice.keySet()) {
                    if (p == 0) p = key;
                    else q = key;
                }

                return (p + q) * Math.abs(p - q);
            }

        } else if (countDice.size() == 3) {
            int q = 0, r = 0;

            for (Integer key : countDice.keySet()) {
                if (countDice.get(key) == 1) {
                    if (q == 0) q = key;
                    else r = key;
                }
            }

            return q * r;

        } else {
            return Math.min(Math.min(a, b), Math.min(c, d));
        }
    }
}