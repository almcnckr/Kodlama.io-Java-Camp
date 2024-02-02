package oopWithNLayerdApp;

import oopWithNLayerdApp.business.ProductManager;
import oopWithNLayerdApp.core.logging.DatabaseLogger;
import oopWithNLayerdApp.core.logging.FileLogger;
import oopWithNLayerdApp.core.logging.Logger;
import oopWithNLayerdApp.core.logging.MailLogger;
import oopWithNLayerdApp.dataAccess.HibernateProductDao;
import oopWithNLayerdApp.entities.Product;

public class Main {
	public static void main(String[] args) throws Exception {
		Product product1 = new Product(1, "IPhone XR", 10000);
		Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new MailLogger() };

		ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
		productManager.add(product1);
	}
}
