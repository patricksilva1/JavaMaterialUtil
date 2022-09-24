package ReversingArrayinPlace;

// No need for extra memory (in-place algorithm)
// O(N/2) = O(N) linear running time
public class ReverseArrayProblem {
    public int[] solve(int[] nums) {
        int lowIndex = 0;
        int highIndex = nums.length - 1;

        while (lowIndex < highIndex) {
            swap(nums, lowIndex, highIndex);
            lowIndex++;
            highIndex--;
        }
        return nums;
    }

    public void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
