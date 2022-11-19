package oopDemo.core.logging;

public class EmailLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println("Data is logged to Email : " + data);
	}
	
}
