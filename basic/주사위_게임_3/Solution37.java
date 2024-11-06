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

        for (int number : dice) {
            countDice.put(number, countDice.getOrDefault(number, 0) + 1);
            System.out.println(countDice);
        }

        if (countDice.size() == 1) { // 모든 숫자가 같은 경우
            return 1111 * a;

        } else if (countDice.size() == 2) { // 1) 3가지 숫자만 같은 경우, 2) 2가지 숫자가 서로 같은 경우

            int p = 0;
            int q = 0;

            for (Integer key : countDice.keySet()) {
                if (countDice.get(key) == 3) { // 3가지 숫자가 같은 경우
                    p = key;
                } else if (countDice.get(key) == 1) { // 3가지 숫자가 같은 경우의 나머지 1개
                    q = key;
                } else { // 2가지 숫자가 서로 같은 경우
                    p = key;
                    q = key;
                }
            }

            if (countDice.get(p) == 3) { // 3번 중복
                return (int) Math.pow((10 * p + q), 2);
            } else if (countDice.get(q) == 2) { // 2번 중복
                return (p + q) * Math.abs(p - q);
            }
        } else if (countDice.size() == 3) { // 2가지 숫자만 같은 경우

            int q = 0;
            int r = 0;

            for (Integer key : countDice.keySet()) {
                if (countDice.get(key) == 1) { // 2가지 숫자만 같은 경우의 서로 다른 두가지의 숫자
                    if (q == 0) { // 첫번째 값을 할당하기 위한 조건
                        q = key;
                    } else {
                        r = key;
                    }
                }
            }

            return q * r;
        } else { // 모든 숫자 중 일치하는 요소가 없음
            return Math.min(Math.min(a, b), Math.min(c, d));
        }

        return 0;
    }
}