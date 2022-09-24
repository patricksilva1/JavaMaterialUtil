package TrappingRainWaterProblem;

public class TrappedRainProblem {

    // It has O(N) running time (With additional O(N) memory complexity)
    // Dynamic programming approach - memorization!!!
    public int solve(int[] heights) {

        // Less than 3 bars can not trap any water
        if (heights.length < 3)
            return 0;

        // Create arrays for the max left and right values
        int[] leftMax = new int[heights.length];
        int[] rightMax = new int[heights.length];

        // Calculating the left max values (from left to right)
        leftMax[0] = 0;

        for (int i = 1; i < leftMax.length; ++i)
            leftMax[i] = Math.max(leftMax[i - 1], heights[i - 1]);

        // Calculating the right max values (from right to left)
        rightMax[rightMax.length - 1] = 0;

        for (int i = rightMax.length - 2; i >= 0; --i)
            rightMax[i] = Math.max(rightMax[i + 1], heights[i + 1]);

        // Consider all the items in O(N) running time
        int trapped = 0;

        for (int i = 1; i < rightMax.length - 1; i++)
            if (Math.min(leftMax[i], rightMax[i]) > heights[i])
                trapped += Math.min(leftMax[i], rightMax[i]) - heights[i];

        return trapped;
    }

}
