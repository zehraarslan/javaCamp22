 //SOLID
//Katmanlı Mimari
public class Customer {
	private int id;
	private String city;
	
	
	//Nesne her new'lendiğinde bu blok çalışır.
	public Customer()
	{
		System.out.println("Müşteri nesnesi başlatıldı.");
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
