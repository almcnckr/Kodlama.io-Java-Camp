
public class Main {

	public static void main(String[] args) {
		char letter = 'ö';

		switch (letter) {
		case 'A':
		case 'a':
		case 'I':
		case 'ı':
		case 'O':
		case 'o':
		case 'U':
		case 'u':
			System.out.println(letter + " harfi kalın ünlüdür.");
			break;
		case 'E': 
		case 'e': 
		case 'İ': 
		case 'i': 
		case 'Ö': 
		case 'ö': 
		case 'Ü': 
		case 'ü':
			System.out.println(letter + " harfi ince ünlüdür.");
			break;
		default:
			System.out.println("Geçersiz harf girdiniz");
			break;
		}
	}

}
