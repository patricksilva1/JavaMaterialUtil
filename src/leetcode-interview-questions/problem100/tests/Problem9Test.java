package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem9Test {

	@Test
	public void testIsPalindrome() {
		Assertions.assertTrue(isPalindrome(0));
		Assertions.assertTrue(isPalindrome(1));
		Assertions.assertTrue(isPalindrome(9));
		Assertions.assertTrue(isPalindrome(121));
		Assertions.assertTrue(isPalindrome(12321));
		Assertions.assertTrue(isPalindrome(1234321));

		Assertions.assertFalse(isPalindrome(-1));
		Assertions.assertFalse(isPalindrome(10));
		Assertions.assertFalse(isPalindrome(123));
		Assertions.assertFalse(isPalindrome(12345));
		Assertions.assertFalse(isPalindrome(1234567));
	}

	public static boolean isPalindrome(int x) {
		if (x < 0)
			return false;

		if (x == 0) {
			return true;
		} else if (x % 10 == 0) {
			return false;
		}
		int reversed = 0;
		while (x > reversed) {
			int digit = x % 10;
			reversed *= 10;
			reversed += digit;
			x /= 10;
		}

		return (x == reversed || x == reversed / 10);
	}
}
