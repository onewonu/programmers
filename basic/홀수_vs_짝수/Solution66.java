package basic.홀수_vs_짝수;

import java.util.Arrays;

public class Solution66 {
    public static void main(String[] args) {
        Solution66 solution = new Solution66();
        runTest(solution, new int[] {4, 2, 6, 1, 7, 6});
        runTest(solution, new int[] {-1, 2, 5, 6, 3});
    }

    private static void runTest(Solution66 solution, int[] num_list) {
        int result = solution.solution(num_list);
        System.out.printf("solution(%s) = %d%n", Arrays.toString(num_list), result);
    }

    public int solution(int[] num_list) {
        int sumOdd = 0, sumEven = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0) sumOdd += num_list[i];
            else sumEven += num_list[i];
        }
        
        return Math.max(sumOdd, sumEven);
    }
}