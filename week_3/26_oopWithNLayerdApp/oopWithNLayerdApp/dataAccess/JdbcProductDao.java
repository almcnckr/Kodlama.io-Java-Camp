package oopWithNLayerdApp.dataAccess;

import oopWithNLayerdApp.entities.Product;

public class JdbcProductDao implements ProductDao{
	public void add(Product product) {
//		sadece database erişim kodları yazılır
		System.out.println("JDBC ile eklendi.");
	}
}
