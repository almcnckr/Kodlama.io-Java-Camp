
public class Main {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 5, 7, 9, 0 };
		int find = 3;

		for (int num : nums) {
			if (num == find) {
				System.out.println(find + " sayısı dizide mevcuttur.");
				break;
			}
		}

		System.out.println(find + " sayısı dizide yoktur.");
	}

}
