package oopWithNLayeredApp.core.logging;

public class FileLogger implements Logger{

	@Override //Mutasyon denir. Üzerine yazıyoruz demek
	public void log(String data) {
		System.out.println("Dosyaya loglandı : " + data);
	}
	
}
