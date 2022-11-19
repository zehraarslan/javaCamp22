package oopDemo.core.logging;

public class DatabaseLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println("Data is logged to Database : " + data);
	}

}
