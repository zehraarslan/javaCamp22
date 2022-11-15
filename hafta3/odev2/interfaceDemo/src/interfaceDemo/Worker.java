package interfaceDemo;

//Bizim çalışanımız.
public class Worker implements IWorkable, IEatable, IPayable{

	@Override
	public void work() {
		System.out.println("Çalışana iş verildi.");
	}

	@Override
	public void eat() {
		System.out.println("Çalışana yemek verildi.");
	}

	@Override
	public void pay() {
		System.out.println("Çalışana maaş verildi.");
	}

}
