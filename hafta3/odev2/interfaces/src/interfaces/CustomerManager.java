package interfaces;

public class CustomerManager {
	
	//ICustomerDal customerDal;
	
	public ICustomerDal customerDal;
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	
	public void add(){
		this.customerDal.Add();
	}
}
