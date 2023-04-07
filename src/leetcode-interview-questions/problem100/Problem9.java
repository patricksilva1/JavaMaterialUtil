public class Problem9 {
	// Given an integer x, return true if x is a palindrome, and false otherwise.
	public static void main(String[] args) {
		int x = 121;

		System.out.println(isPalindrome(x));
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
