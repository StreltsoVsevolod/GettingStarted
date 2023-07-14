package codesignal.the_core.at_the_crossroads;

/**
 * Given integers a and b, determine whether the following pseudocode results in an infinite loop
 * <p>
 * while a is not equal to b do
 * increase a by 1
 * decrease b by 1
 * <p>
 * Assume that the program is executed on a virtual machine which can store arbitrary long numbers and execute forever.
 * <p>
 * Example
 * <p>
 * For a = 2 and b = 6, the output should be
 * solution(a, b) = false;
 * For a = 2 and b = 3, the output should be
 * solution(a, b) = true.
 **/

public class IsInfiniteProcess {

    public static void main(String[] args) {
        System.out.println("a = 2 ; b = 6 : " + solution(2, 6)); //false
        System.out.println("a = 2 ; b = 3 : " + solution(2, 3)); //true
        System.out.println("a = 0 ; b = 1 : " + solution(0, 1)); //true
        System.out.println("a = 5 ; b = 10 : " + solution(5, 10)); //true
        System.out.println("a = 6 ; b = 10 : " + solution(6, 10)); //false
        System.out.println("a = 5 ; b = 5 : " + solution(5, 5)); //false

    }

    static boolean solution(int a, int b) {
        return b < a | ((a + b) % 2 != 0);
    }
}
