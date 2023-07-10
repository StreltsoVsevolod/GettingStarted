package codesignal.the_core.at_the_crossroads;

public class ExtraNumber {

    /**
     * You're given three integers, a, b and c.
     * It is guaranteed that two of these integers are equal to each other.
     * What is the value of the third integer?
     * <p>
     * Example
     * <p>
     * For a = 2, b = 7, and c = 2, the output should be
     * solution(a, b, c) = 7.
     * <p>
     * The two equal numbers are a and c. The third number (b) equals 7, which is the answer.
     **/

    public static void main(String[] args) {
        System.out.println(solution(2, 7, 2));
    }

    static int solution(int a, int b, int c) {
        if (a == c) return b;
        if (b == c) return a;
        if (a == b) return c;
        return 0;
    }
}
