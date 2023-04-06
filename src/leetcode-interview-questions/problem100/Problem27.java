
public class Problem27 {
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
