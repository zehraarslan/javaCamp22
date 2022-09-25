package methods;

public class Main {

	public static void main(String[] args) {
		findNumber();
		findNumber();
		findNumber();
		findNumber();

	}
	
	public static void	findNumber() {
	    int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
	    int searched = 5;
	    boolean status = false;

	    for (int number : numbers) {
	      if (number == searched) {
	    	  status = true;
	        break;
	      }
	    }
	    
	    String message = "";
	    if (status) {
	    	message = "Number available : " + searched; 
	    	sendMessage(message);
	    }
	    else {
	    	message = "Number not available : " +  searched;
	    	sendMessage(message);
	    }
	}
	
	public static void sendMessage(String message) {
		System.out.println(message);
	}
}
