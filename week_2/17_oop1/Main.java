
public class Main {

	public static void main(String[] args) {

		Product product1 = new Product();

		// set value
		product1.setName("DeLonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.jpg");

//		product1.name = "DeLonghi Kahve Makinesi";
//		product1.unitPrice = 7500;
//		product1.discount = 7;
//		product1.unitsInStock = 3;
//		product1.imageUrl = "image1.jpg";

		// get
		// System.out.println(product1.name);

		Product product2 = new Product();

		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		product2.setImageUrl("image2.jpg");

//		product2.name = "Smeg Kahve Makinesi";
//		product2.unitPrice = 6500;
//		product2.discount = 8;
//		product2.unitsInStock = 2;
//		product2.imageUrl = "image2.jpg";

		Product product3 = new Product();

		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(3);
		product3.setImageUrl("image3.jpg");

//		product3.name = "Kitchen Aid Kahve Makinesi";
//		product3.unitPrice = 4500;
//		product3.discount = 9;
//		product3.unitsInStock = 4;
//		product3.imageUrl = "image3.jpg";

		Product[] products = { product1, product2, product3 };

		for (Product product : products) {
			System.out.println(product.getName());
		}

		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("05222222222");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Engin");
		individualCustomer.setLastName("Demiroğ");

		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhone("05333333333");
		corporateCustomer.setTaxNumber("11111111111");
		corporateCustomer.setCustomerNumber("54321");

		Customer[] customers = { individualCustomer, corporateCustomer };
	}

}
