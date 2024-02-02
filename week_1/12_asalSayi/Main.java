
public class Main {

	public static void main(String[] args) {
		int number = 2;
		boolean isPrime = true;
		if (number > 1) {

			if (number == 2) {
				System.out.println(number + " bir asal sayıdır.");
				return;
			}
			for (int i = 2; i < 25 / 2; i++) {
				if ((number % i) == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime == true) {
				System.out.println(number + " bir asal sayıdır.");
			} else {
				System.out.println(number + " asal sayı değildir.");
			}
		} else {
			System.out.println("Geçersiz sayı girdiniz.");
		}
	}

}
