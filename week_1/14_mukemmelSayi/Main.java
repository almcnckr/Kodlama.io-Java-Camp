
public class Main {

	public static void main(String[] args) {
		int number = 28;
		int sum = 1;

		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				sum += i;
			}
		}

		if (number == sum) {
			System.out.println(number + " sayısı mükemmel sayıdır.");
		} else {
			System.out.println(number + " sayısı mükemmel sayı değildir.");
		}
	}

}
