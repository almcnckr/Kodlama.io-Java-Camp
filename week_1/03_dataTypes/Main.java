
public class Main {

	public static void main(String[] args) {
		/* Java tip güvenli bir dildir. Yani oluşturduğumuz değişkenin tipini belirtmemizi ister ve bu tipi
		 değiştiremeyiz.
		 * Örneğin python gibi bazı dilleride bu yoktur ve otomatik olarak tip dönüşümü yapar. 
		 * İlkel Tipler (Primitive Types)
		 * boolean true veya false değer tutar
		 * char tek bir karakter tutar
		 * byte, short, int, long tamsayı tutar sınırları farklılık gösterir 
		 * float, double ondalık sayı tutar double daha hassastır
		 */
		
		int sayi = 10;
		//sayi = "Ankara"; hataya yol açar
		
		
		byte sayi2 = 10;
		//sayi2 = 128; hataya yol açar çünkü byte veri tipinin sınırları dışına çıkılmıştır
		
		char karakter = 'a';
	}

}
