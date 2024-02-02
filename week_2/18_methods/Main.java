
public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
	}

	public static void sayiBulmaca() {
		int[] nums = { 1, 2, 5, 7, 9, 0 };
		int find = 3;

		for (int num : nums) {
			if (num == find) {
				mesajVer(find + " sayısı dizide mevcuttur.");
				break;
			}
		}

		mesajVer(find + " sayısı dizide yoktur.");
	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
}
