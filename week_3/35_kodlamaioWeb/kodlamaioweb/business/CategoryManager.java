package kodlamaioweb.business;

import java.util.List;

import kodlamaioweb.business.utilities.CategoryValidator;
import kodlamaioweb.core.logging.ILogger;
import kodlamaioweb.dataaccess.ICategoryDao;
import kodlamaioweb.entities.Category;

public class CategoryManager implements ICategoryService {
	private ICategoryDao categoryDao;
	private ILogger logger;

	public CategoryManager(ICategoryDao categoryDao, ILogger logger) {
		this.categoryDao = categoryDao;
		this.logger = logger;
	}

	@Override
	public void add(Category category) {
		if (CategoryValidator.isValid(category, categoryDao)) {
			categoryDao.add(category);
			logger.log("Kategori eklendi. " + category.getId());
		}
	}

	@Override
	public void update(int id) {
		categoryDao.update(id);
		logger.log("Kategori güncellendi. " + id);
	}

	@Override
	public void delete(int id) {
		categoryDao.delete(id);
		logger.log("Kategori silindi. " + id);
	}

	@Override
	public List<Category> getCategories() {
		return categoryDao.getCategories();
	}

	@Override
	public Category getCategoryById(int id) {
		return categoryDao.getCategoryById(id);
	}
}
