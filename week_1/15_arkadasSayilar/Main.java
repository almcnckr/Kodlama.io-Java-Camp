
public class Main {

	public static void main(String[] args) {
		int number1 = 220, number2 = 284, sum1 = 1, sum2 = 1;

		for (int i = 2; i <= number1 / 2; i++) {
			if ((number1 % i) == 0) {
				sum1 += i;
			}
		}

		for (int i = 2; i <= number2 / 2; i++) {
			if ((number2 % i) == 0) {
				sum2 += i;
			}
		}

		if (sum1 == number2 && sum2 == number1) {
			System.out.println(number1 + " ve " + number2 + " arkadaş sayılardır.");
		}else {
			System.out.println(number1 + " ve " + number2 + " arkadaş sayı değildirler.");			
		}
	}

}
