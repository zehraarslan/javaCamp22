package oopDemo.buisness;

import java.util.List;

import oopDemo.core.logging.Logger;
import oopDemo.dataAcess.CategoryDao;
import oopDemo.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private List<Category> categories;
	private List<Logger> loggers;
	
	public CategoryManager(CategoryDao categoryDao, List<Category> categories, List<Logger> loggers) {
		this.categoryDao = categoryDao;
		this.categories = categories;
		this.loggers = loggers;
	}
	
	public void add(Category category) throws Exception {
		try {
			if (category.getCategoryName().isEmpty()) {
				throw new Exception("Category name is invalid.");
			}
			
			for (Category _category : categories) {
				if (_category.getCategoryName().equalsIgnoreCase(category.getCategoryName())) {
					throw new Exception("There is a category name");
				}
			}
			categories.add(category);
			categoryDao.add(category);
			
			for (Logger logger : loggers) {
				logger.log(category.getCategoryName());
			}
			System.out.println("Successful category saved : " + category.getCategoryName());
		} catch (Exception e) {
			System.out.println("An unexpected error has occurred : " + e);
		}
	}
}
