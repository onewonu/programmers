package basic.무작위로_K개의_수_뽑기;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Solution95 {
    public static void main(String[] args) {
        Solution95 solution = new Solution95();
        runTest(solution, new int[]{ 0, 1, 1, 2, 2, 3 }, 3);
        runTest(solution, new int[]{ 0, 1, 1, 1, 1 }, 4);
    }

    private static void runTest(Solution95 solution, int[] arr, int k) {
        int[] result = solution.solution(arr, k);
        System.out.printf("solution(%s, %d) = %s%n", Arrays.toString(arr), k, Arrays.toString(result));
    }

    public int[] solution(int[] arr, int k) {
        Set<Integer> set = new LinkedHashSet<>();

        for (int num : arr) {
            set.add(num);
            if (set.size() == k) {
                break;
            }
        }

        int[] answer = new int[k];
        int index = 0;

        for (int num : set) {
            answer[index++] = num;
        }

        while (index < k) {
            answer[index++] = -1;
        }

        return answer;
    }
}