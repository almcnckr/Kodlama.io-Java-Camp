package kodlamaioweb.dataaccess;

import java.util.List;

import kodlamaioweb.entities.Category;

public interface ICategoryDao {

	void add(Category category);

	void update(int id);

	void delete(int id);

	List<Category> getCategories();

	Category getCategoryById(int id);
}
