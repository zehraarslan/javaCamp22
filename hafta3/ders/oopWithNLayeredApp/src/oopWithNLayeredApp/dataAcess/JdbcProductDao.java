package oopWithNLayeredApp.dataAcess;

import oopWithNLayeredApp.entities.Product;

//Veri tabanına erişim işlemlerini gerçekleştiriyoruz.

//Implemente mantığı: JdbcProductDao class'ı ProductDao'nun
// kurallarına uymak zorunda.
public class JdbcProductDao implements ProductDao{
	public void add(Product product) {
		//Sadece ve sadece db erişim kodları buraya yazılır... SQL
		System.out.println("JDBC ile veri tabanına eklendi.");
	}
}
