

// Leetcode number 75. Sort Colors 
// Runtime = 0ms; Memory 40.3 MB; Neats 99.32%
/*
 * class Solution {
    public void sortColors(int[] nums) {
        int a = 0;
        int b = 0;
        int c = 0;
        
        //1.iterate and count each color
        for(int num : nums)
        {
            switch(num)
            {
                case 0:
                    a+=1;
                    break;
                case 1:
                    b+=1;
                    break;
                case 2:
                    c+=1;
                    break;
            }
        }
        
        //2.rewrite array
        int cnt = 0;
        while(a>0)
        {
            nums[cnt] = 0;
            a--;
            cnt++; 
        }
        
        while(b>0)
        {
            nums[cnt] = 1;
            b--;
            cnt++; 
        }
        
        while(c>0)
        {
            nums[cnt] = 2;
            c--;
            cnt++; 
        }
    }
}
 */
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
