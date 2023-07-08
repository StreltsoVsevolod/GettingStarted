package codesignal.the_core.intro_gates;

public class Task4 {
    public static void main(String[] args) {

        System.out.println(solution(16, 11, 5, 3));

    }

    public static int solution(int nCols, int nRows, int col, int row) {
        return (nCols - col + 1) * (nRows - row);
    }
}
