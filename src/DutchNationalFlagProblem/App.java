package DutchNationalFlagProblem;

import java.util.Arrays;

public class App {
    public static void main(String args[]) {
        int[] nums = {2, 2, 1, 1, 0, 0, 1, 1};

        DutchFlagProblem problem = new DutchFlagProblem(nums);

        problem.solve();
        problem.showResult();


    }


}
 