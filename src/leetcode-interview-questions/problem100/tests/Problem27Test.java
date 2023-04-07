package tests;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class Problem27Test {

	@Test
	 void testRemoveElement() {
		// Test case 1
		int[] nums1 = { 3, 2, 2, 3 };
		int val1 = 3;
		int expected1 = 2;
		int result1 = removeElement(nums1, val1);
		Assert.assertEquals(expected1, result1);

		// Test case 2
		int[] nums2 = { 0, 1, 2, 2, 3, 0, 4, 2 };
		int val2 = 2;
		int expected2 = 5;
		int result2 = removeElement(nums2, val2);
		Assert.assertEquals(expected2, result2);

		// Test case 3
		int[] nums3 = { 1, 2, 3, 4, 5 };
		int val3 = 6;
		int expected3 = 5;
		int result3 = removeElement(nums3, val3);
		Assert.assertEquals(expected3, result3);
	}
	// Function
	public static int removeElement(int[] nums, int val) {
		int k = 0; // contador para o novo tamanho do array
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[k++] = nums[i]; // substitui o elemento e incrementa o contador
			} else {
				nums[i] = '_'; // substitui o elemento removido por "_"
			}
		}
		return k; // retorna o novo tamanho do array
	}
}
