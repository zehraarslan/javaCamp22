package methodOverloading;

public class Main {

	public static void main(String[] args) {
		FourTransactions fourTransactions = new FourTransactions();
		System.out.println(fourTransactions.sum(1, 2));
		System.out.println(fourTransactions.sum(3, 5, 2));

	}

}
