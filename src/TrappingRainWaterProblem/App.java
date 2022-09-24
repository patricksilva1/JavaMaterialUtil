package TrappingRainWaterProblem;

public class App {
    public static void main(String[] args) {
        int[] heights = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

        TrappedRainProblem problem = new TrappedRainProblem();

        System.out.println(problem.solve(heights));
    }
}
