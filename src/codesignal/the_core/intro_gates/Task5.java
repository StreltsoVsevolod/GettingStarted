package codesignal.the_core.intro_gates;

public class Task5 {

    public static void main(String[] args) {
        System.out.println(solution(3, 10));
    }

    public static int solution(int divisor, int bound) {
        return bound - (bound % divisor);
    }
}
