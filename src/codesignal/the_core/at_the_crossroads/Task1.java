package codesignal.the_core.at_the_crossroads;

/**
 * You are playing an RPG game. Currently your experience points (XP) total is equal to experience.
 * To reach the next level your XP should be at least at threshold.
 * If you kill the monster in front of you, you will gain more experience points in the amount of the reward.
 * <p>
 * Given values experience, threshold and reward, check if you reach the next level after killing the monster.
 * <p>
 * Example
 * <p>
 * For experience = 10, threshold = 15, and reward = 5, the output should be
 * solution(experience, threshold, reward) = true;
 * For experience = 10, threshold = 15, and reward = 4, the output should be
 * solution(experience, threshold, reward) = false.
 **/

public class Task1 {

    public static void main(String[] args) {
        System.out.println(solution(10, 15, 5));
    }

    public static boolean solution(int experience, int threshold, int reward) {
        return (experience + reward) >= threshold;
    }
}
