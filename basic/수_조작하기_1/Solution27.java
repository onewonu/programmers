package basic.수_조작하기_1;

public class Solution27 {
    public static void main(String[] args) {
        Solution27 solution = new Solution27();
        runTest(solution, 0, "wsdawsdassw" );
    }

    private static void runTest(Solution27 solution, int n, String control) {
        int result = solution.solution(n, control);
        System.out.printf("solution(%d, %s) = %s%n", n, control, result);
    }

    public int solution(int n, String control) {
        for (char ch : control.toCharArray()) {
            n += switch (ch) {
                case 'w' -> 1;
                case 's' -> -1;
                case 'd' -> 10;
                case 'a' -> -10;
                default -> 0;
            };
        }

        return n;
    }
}