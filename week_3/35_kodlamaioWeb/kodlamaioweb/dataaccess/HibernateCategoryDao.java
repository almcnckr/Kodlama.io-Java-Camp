package kodlamaioweb.dataaccess;

import java.util.ArrayList;
import java.util.List;

import kodlamaioweb.entities.Category;

public class HibernateCategoryDao implements ICategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Hibernate : Kategori eklendi. " + category.getId());
	}

	@Override
	public void update(int id) {
		System.out.println("Hibernate : Kategori güncellendi. " + id);
	}

	@Override
	public void delete(int id) {
		System.out.println("Hibernate : Kategori silindi. " + id);
	}

	@Override
	public List<Category> getCategories() {
		System.out.println("Hibernate : Kategori listesi getirildi.");
		
		// normalde categories databaseden geliyor fakat database bağlantısı olmadığı için null o yüzden elle atama yaptım
		// validator için
		List<Category> categories = new ArrayList<Category>();
		categories.add(new Category(999, "Veri Bilimi"));
		return categories;
	}

	@Override
	public Category getCategoryById(int id) {
		System.out.println("Hibernate : Kategori getirildi. " + id);
		return null;
	}

}
