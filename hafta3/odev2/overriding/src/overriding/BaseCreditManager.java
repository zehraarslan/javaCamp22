package overriding;

public class BaseCreditManager {
	//final method'un ezilmemesini sağlıyor.
//	public final double calculate(double amount)
//	{
//		return amount * 1.18;
//	}
	
	public double calculate(double amount)
	{
		return amount * 1.18;
	}
}

//overridable