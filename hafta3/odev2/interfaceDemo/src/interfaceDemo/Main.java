package interfaceDemo;

public class Main {

	public static void main(String[] args) {
		
		Worker worker = new Worker();
		worker.work();
		worker.eat();
		worker.pay();
		
		OutsourceWorker outsourceWorker = new OutsourceWorker();
		outsourceWorker.work();
		
		Robot robot = new Robot();
		robot.work();
	}

}
