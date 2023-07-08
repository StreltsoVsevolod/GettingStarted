package codesignal.the_core.intro_gates;

public class Task8 {

    public static void main(String[] args) {

        System.out.println(solution(2, 2, 1, 2));
    }

    public static int solution(int min1, int min2_10, int min11, int s) {
        int minutes = 0;
        int money = s;

        if (money >= min1) {
            minutes += 1;
            money -= min1;
        } else {
            return minutes;
        }

        if (money >= min2_10) {
            if ((money / min2_10) > 9) {
                money -= min2_10 * 9;
                minutes += 9;
            } else {
                minutes += money / min2_10;
                return minutes;
            }
        } else {
            return minutes;
        }

        if (money >= min11) {
            minutes += money / min11;
        }
        return minutes;
    }
}
