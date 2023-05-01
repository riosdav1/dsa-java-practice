public class ReduceNumber {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14)); // 6
        System.out.println(numberOfSteps(8)); // 4
        System.out.println(numberOfSteps(123)); // 12
    }

    private static int numberOfSteps(int num) {
        int steps = 0;
        int current = num;
        while (current > 0) {
            steps++;
            if (current % 2 != 0) {
                current--;
            } else {
                current /= 2;
            }
        }
        return steps;
    }
}
