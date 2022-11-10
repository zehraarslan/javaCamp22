
public class Main {

	public static void main(String[] args) {
		//Değer tip
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println("sayi1 : " + sayi1);
		
		//Referans tip
		int[] sayilar1 = new int[] {1, 2, 3};
		int[] sayilar2 = new int[] {10, 20, 30};
		sayilar1 = sayilar2;
		sayilar2[0] = 1000;
		System.out.println("sayilar1[0] : " + sayilar1[0]);
		
		CreditManager creditManager = new CreditManager();
		creditManager.calculate();
		creditManager.save();
		
		Customer customer = new Customer();
		customer.setId(1);
		customer.setCity("İstanbul");
		
 
		
		Company company = new Company();
		company.setId(3);
		company.setCompanyName("Arçelik");
		company.setCity("Ankara");
		company.setTaxNumber("100000");
		
		Person person = new Person();
		person.setId(2);
		person.setFirstName("Zehra");
		person.setLastName("ARSLAN");
		person.setCity("İstanbul");
		person.setNationalIdentity("123456789");
		
		//IoC Container
		CustomerManager customerManager2 = new CustomerManager(new Person(), new CarCreditManager());
		customerManager2.save();
		customerManager2.giveCredit();
//		customerManager2.Delete();
		
		
	}

}
