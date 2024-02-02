import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		//Diziler aynı türden verileri toplu halde tutmaya yarar ve bir diziyi döngü kullanarak 
		//kolayca gezebiliriz
		
		String ogrenci1 = "Engin";
		String ogrenci2 = "Derin";
		String ogrenci3 = "Salih";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		
		System.out.println("-------------");
		
		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Engin";
		ogrenciler[1] = "Derin";
		ogrenciler[2] = "Salih";
		ogrenciler[3] = "Ahmet";
 		
		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		
		System.out.println("-------------");
		
		for (String ogrenci : ogrenciler) {//for döngüsünün farklı bir versiyonu
			System.out.println(ogrenci);
		}
	}
	
}
