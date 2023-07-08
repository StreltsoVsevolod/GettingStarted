package codesignal.the_core.intro_gates;

public class Task6 {

    public static void main(String[] args) {

        System.out.println(solution(6, 3));
    }

    public static int solution(int n, int firstNumber) {
        int mid = n / 2;
        return firstNumber >= mid ? firstNumber - mid : firstNumber + mid;
    }
}

