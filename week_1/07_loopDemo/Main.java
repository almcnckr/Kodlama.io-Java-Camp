import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		/*
		 * Aynı işlemi birçok kez tekrar etmek istediğimizde döngüleri kullanırız
		 * Örneğin 1 den 100 e kadar tüm sayıları ekrana basmak
		 */
		
		
		for (int i = 1; i < 10; i++) {//i++ , i = i + 1 analmına gelir
		/* int i = 0 kısmı sayaç tanımıdır ve başlangıç değeri verilir
		 * i < 10 koşul kısmıdır koşul sağlandığı taktirde döngü çalışmaya devam eder
		 * i++ kısmı ise sayacı arttırdığımız kısımdır
		 */
	
			System.out.println(i);
		}
		
		System.out.println("For döngüsü bitti");
		
		//While
		int i = 1;
		
		while (i<10) {// Döngü koşulu
			System.out.println(i);
			
			i++; //sayaç arttırma işlemi
		}
		
		System.out.println("While döngüsü bitti");
		
		//do-while
		int j = 20;
		
		//do-while döngüsünde koşul sağlanmasa bile bir kere çalışır
		do {
			System.out.println(j);
			
			j++;// sayaç arttırma işlemi
		} while (j<10);// döngü koşulu
		
		System.out.println("Do-while döngüsü bitti");
	}
	
}
