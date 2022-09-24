package DutchNationalFlagProblem;

import java.util.Arrays;

public class DutchFlagProblem {

    private int[] nums;

    public DutchFlagProblem(int[] nums) {
        this.nums = nums;
    }

    public void solve() {
        int i = 0;
        int j = 0;
        // We know that 1 is the middle item (0, 1, 2)
        int pivot = 1;
        int k = nums.length - 1;

        // It has O(N) linear running time complexity
        while (j <= k) {
        // When item with index j = 0
            if (nums[j] < pivot) {
                swap(i, j);
                i++;
                j++;
        // Item is 2
            } else if (nums[j] > pivot) {
                swap(j, k);
                k--;
        // The item is 1
            } else {
                j++;
            }

        }
    }

    private void swap(int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

    public void showResult() {
        System.out.println(Arrays.toString(nums));
    }


}
