package oopDemo.core.logging;

public class FileLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println("Data is logged to File : " + data);
	}

}
