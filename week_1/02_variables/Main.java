
public class Main {

	public static void main(String[] args) {
		/* String metinsel ifadedir
		 * int sayısal değişkendir
		 * 
		 * değişkenler aynı veriyi kullanacağımız bir çok yerde veri değiştiğinde veriyi kullandığımız 
		 yerlerin otomatik olarak güncellenmesi için kullanılır aynı zamanda değişkenler bellek tasarufu 
		 da sağlar.
		 */
		System.out.println("Öğrenci sayısı : 12");
		System.out.println("Öğrenci sayısı : 12");
		System.out.println("Öğrenci sayısı : 12");
		System.out.println("Öğrenci sayısı : 12");
		System.out.println("Öğrenci sayısı : 12");
		
		/* Örneğin öğrenci sayısı 13 olduğunda 12 olan yerleri elle değiştirmek gerekir
		 * fakat bu değeri bir değişkene atarsak bu değer değişkeni kullandığımız her yerde otomatik olarak
		 güncellenir
		 * Aynı zamanda kullandığımız "Öğrenci sayısı : " ifadesi için de bellekte otomatik olarak değişken
		 oluşturulur. Kendimiz bir değişken oluşturup bu değişkene değer ataması yaparak gereksiz değişken
		 oluşturulmasını önlemiş oluruz böylece çok büyük veriler için bellek tasarufu yapmış oluruz.
		*/
		int ogrenciSayisi = 13;
		String mesaj = "Öğrenci sayısı : ";

		System.out.println(mesaj + ogrenciSayisi);
		System.out.println(mesaj + ogrenciSayisi);
		System.out.println(mesaj + ogrenciSayisi);
		System.out.println(mesaj + ogrenciSayisi);
		System.out.println(mesaj + ogrenciSayisi);
	}

}
