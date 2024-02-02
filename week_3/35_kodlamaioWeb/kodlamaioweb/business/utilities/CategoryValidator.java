package kodlamaioweb.business.utilities;

import java.util.List;

import kodlamaioweb.dataaccess.ICategoryDao;
import kodlamaioweb.entities.Category;

public class CategoryValidator {
	public static boolean isValid(Category category, ICategoryDao categoryDao) {
		List<Category> categories = categoryDao.getCategories();

		for (Category category_ : categories) {
			if (category_.getName().equals(category.getName())) {
				System.out.println("Kategori isimleri tekrar edemez.");
				return false;
			}
		}
		return true;
	}
}
