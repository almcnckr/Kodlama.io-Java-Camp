package kodlamaioweb.dataaccess;

import java.util.ArrayList;
import java.util.List;

import kodlamaioweb.entities.Category;

public class JdbcCategoryDao implements ICategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("JDBC : Kategori eklendi. " + category.getId());
	}

	@Override
	public void update(int id) {
		System.out.println("JDBC : Kategori güncellendi. " + id);
	}

	@Override
	public void delete(int id) {
		System.out.println("JDBC : Kategori silindi. " + id);
	}

	@Override
	public List<Category> getCategories() {
		System.out.println("JDBC : Kategori listesi getirildi.");
		
		// normalde categories databaseden geliyor fakat database bağlantısı olmadığı için null o yüzden elle atama yaptım
		// validator için
		List<Category> categories = new ArrayList<Category>();
		categories.add(new Category(999, "Veri Bilimi"));
		return categories;
	}

	@Override
	public Category getCategoryById(int id) {
		System.out.println("JDBC : Kategori getirildi. " + id);
		return null;
	}

}
