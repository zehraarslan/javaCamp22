package methods2;

public class Main {

	public static void main(String[] args) {
		
		String message = "The weather is very nice today";
		int number = total(5, 3);
		int sum = total(1, 2, 5, 7, 9, 11, 13);
		String city = giveCity();
		
		System.out.println("Number : " + number);
		System.out.println("Numbers : " + sum);
		System.out.println("City : " + city);
		
	}
	
	public static void add() {
		System.out.println("Added");
	}
	
	public static void delete() {
		System.out.println("Deleted");
	}
	
	public static void update() {
		System.out.println("Updated");
	}
	
	public static int total(int number1, int number2) {
		return number1 + number2;
	}
	
	//Variable arguments
	public static int total(int... numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}
	public static String giveCity() {
		return "Ankara";
	}
}
