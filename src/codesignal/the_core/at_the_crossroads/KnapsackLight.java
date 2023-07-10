package codesignal.the_core.at_the_crossroads;

public class KnapsackLight {

    /**
     * You found two items in a treasure chest!
     * The first item weighs weight1 and is worth value1, and the second item weighs weight2 and is worth value2.
     * What is the total maximum value of the items you can take with you,
     * assuming that your max weight capacity is maxW and you can't come back for the items later?
     * <p>
     * Note that there are only two items and you can't bring more than one item of each type, i.e. you can't take two first items or two second items.
     * <p>
     * Example
     * <p>
     * For value1 = 10, weight1 = 5, value2 = 6, weight2 = 4, and maxW = 8, the output should be
     * solution(value1, weight1, value2, weight2, maxW) = 10.
     * <p>
     * You can only carry the first item.
     * <p>
     * For value1 = 10, weight1 = 5, value2 = 6, weight2 = 4, and maxW = 9, the output should be
     * solution(value1, weight1, value2, weight2, maxW) = 16.
     * <p>
     * You're strong enough to take both of the items with you.
     * <p>
     * For value1 = 5, weight1 = 3, value2 = 7, weight2 = 4, and maxW = 6, the output should be
     * solution(value1, weight1, value2, weight2, maxW) = 7.
     * <p>
     * You can't take both items, but you can take any of them.
     **/

    public static void main(String[] args) {
        System.out.println(solution(5, 3, 7, 4, 6));
    }

    static int solution(int value1, int weight1, int value2, int weight2, int maxW) {
        if (weight1 > maxW && weight2 > maxW) return 0;
        if (weight1 + weight2 <= maxW) return value1 + value2;
        if (weight1 > maxW) return value2;
        if (weight2 > maxW) return value1;
        return Math.max(value1, value2);
    }
}