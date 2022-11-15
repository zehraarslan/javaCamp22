package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
		
//		EmailLogger emailLogger = new EmailLogger();
//		emailLogger.log("Log mesajı");
//		
//		DatabaseLogger databaseLogger = new DatabaseLogger();
//		databaseLogger.log("Log mesajı");
		
//		BaseLogger[] loggers = new BaseLogger[] {new DatabaseLogger(), new EmailLogger(), new FileLogger(), new ConsoleLogger()};
//		for (BaseLogger logger:loggers)
//		{
//			logger.log("Log mesajı");
//		}
		
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();
	}

}
