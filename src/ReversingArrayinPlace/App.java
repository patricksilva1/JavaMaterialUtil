package ReversingArrayinPlace;

import java.util.Arrays;

public class App {
    public static void main(String args[]) {
        ReverseArrayProblem rp = new ReverseArrayProblem();

        int[] nums = { 1, 2, 3, 4, 5 };

        System.out.println("And here, the Reverse Array running: "
                + Arrays.toString(rp.solve(nums)) + ".");
    }
}
