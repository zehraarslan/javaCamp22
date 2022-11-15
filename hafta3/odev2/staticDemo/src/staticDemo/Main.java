package staticDemo;

public class Main {

	public static void main(String[] args) {
		ProductManager manager = new ProductManager();
		Product product = new Product();
		product.id = 1;
		product.name = "";
		product.price = 100;
		
		manager.add(product);
		
		DatabaseHelper.Connection.createConnection();
		DatabaseHelper.Crud.delete();
		
	}

}
