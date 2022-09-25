package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product2 = new Product(2, "Bilgisayar","Lenovo Laptop", 4500, 4, "White");
		
		Product product = new Product();
		product.setId(1);
		product.setName("Laptop");
		product.setPrice(5000);
		product.setDescription("Asus Laptop");
		product.setStockAmount(3);
		product.setColor("Black");
		
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println("Code : " + product.getCode());
		System.out.println("--------------------------------------------");
		productManager.Add(product2);
		System.out.println("Code : " + product2.getCode());
	}

}
