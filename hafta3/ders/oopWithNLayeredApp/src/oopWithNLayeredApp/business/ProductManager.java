package oopWithNLayeredApp.business;


import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAcess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	private Logger[] loggers;
	
	// ProductManager new'lendiğinde bana bir ProductDao
	// ver demek.
	public ProductManager(ProductDao productDao, Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers; 
	}
	
	

	public void add(Product product) throws Exception {
		//is kurallari
		if (product.getUnitPrice() < 10) {
			throw new Exception("Ürün fiyatı 10'dan küçük olamaz.");
		}
		productDao.add(product);
		
		for (Logger logger : loggers) {
			logger.log(product.getName());
		}
	}
}