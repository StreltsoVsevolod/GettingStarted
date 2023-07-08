package codesignal.the_core.intro_gates;

import java.util.Arrays;

public class Task7 {

    public static void main(String[] args) {

        System.out.println(solution(808));
    }

    static int solution(int n) {
        String timer = n / 60 + Integer.toString(n % 60);
        return Arrays.stream(timer.split("")).map(Integer::parseInt).reduce(0, Integer::sum);
    }
}
