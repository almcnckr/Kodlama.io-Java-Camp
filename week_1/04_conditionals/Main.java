public class Main {

	public static void main(String[] args) {
		// Şart blokları programın akışını kontrol etmemizi sağlar
		int sayi = 14;

		if (sayi < 20) {
			System.out.println("Sayı 20 den küçüktür");
		}

		if (sayi < 15) {
			System.out.println("Sayı 15 ten küçüktür");
		}

		// Girilen durumun aksini de içeren bir şartlı yapı için if-else yapısı kullanılır

		sayi = 30;

		if (sayi < 20) {		//Verilen şart sağlanıyor ise bu blok
			System.out.println("Sayı 20 den küçüktür");
		} else {				//Verilen şart sağlanmıyor ise bu blok
			System.out.println("Sayı 20 den küçük değildir");
		}
		
		/* Sayı 20 den küçükse ve büyükse için şartlar yazdık peki sayı 20 ye eşitse ne yapacağız
		 * Bunun için else if yapısı kullanılır
		*/
		
		sayi = 20;
		
		if (sayi < 20) {		//Verilen şart sağlanıyor ise bu blok
			System.out.println("Sayı 20 den küçüktür");
		}else if(sayi == 20) {  //Yukardaki şart sağlanmıyor ise bu şart kontrol edilir
			System.out.println("Sayı 20 ye eşittir");
		}else {				//Verilen şart sağlanmıyor ise bu blok
			System.out.println("Sayı 20 den büyüktür");
		}
		
	}

}
