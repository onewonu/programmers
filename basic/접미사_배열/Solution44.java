package basic.접미사_배열;

import java.util.Arrays;

public class Solution44 {
    public static void main(String[] args) {
        Solution44 solution = new Solution44();
        runTest(solution, "banana");
        runTest(solution, "programmers");
    }

    private static void runTest(Solution44 solution, String my_string) {
        String[] result = solution.solution(my_string);
        System.out.printf("solution(%s) = %s%n", my_string, Arrays.toString(result));
    }

    public String[] solution(String my_string) {
        String[] answer = {};
        return answer;
    }
}