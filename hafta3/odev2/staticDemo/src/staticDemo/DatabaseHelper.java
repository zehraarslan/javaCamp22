package staticDemo;

public class DatabaseHelper {
	//Create read update delete
	public static class Crud {
		public static void delete() {
			System.out.println("Veri silindi.");
		}
		public static void update() {
			System.out.println("Veri güncellendi.");
		}
	}
	
	public static class Connection {
		public static void createConnection() {
			System.out.println("Bağlantı sağlandı.");
		}
	}
}
