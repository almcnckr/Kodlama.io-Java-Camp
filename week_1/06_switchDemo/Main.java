
public class Main {

	public static void main(String[] args) {
		/*
		 * switch-case yapısı bir ifadenin alabileceği değerlere göre programın akışını değiştiren yapıdır
		 * switch-case bloklarıyla dallandırma yapılır
		 */
		
		char grade = 'A';
		
		switch (grade) {
		case 'A': // grade değişkeni A değerini aldığında bu bloğa girer
			System.out.println("Mükemmel : Geçtiniz");
			break;
		case 'B':// Eğer iki durumda da aynı çıktıyı istiyorsak bu şekilde bi yapı kullanırız
		case 'C':
			System.out.println("İyi : Geçtiniz");
			break;
		case 'D':
			System.out.println("Fena Değil : Geçtiniz");
			break;
		case 'F':
			System.out.println("Maalesef kaldınız");
			break;
		default:// Girilen A,B,C,D,F durumları dışında farklı bir değer alırsa default bloğu çalışır
			System.out.println("Geçersiz not");
			break;
		}
	}

}
