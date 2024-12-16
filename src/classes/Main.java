package classes;

public class Main {
	
	public static void main(String[] args) {
		
		String myMessage = "Yes it is";
		int a = 15;
		int b = 12;
		int res = addition(a,b);
		
		System.out.println("Le resultat de %s plus %s est: %s".formatted(a, b, res));
		
	}
	
	public static String ChangeString(String message) {
		message = message + ", But it's different now!";
		
		return message;
	}
	
	public static int addition(int x, int y) {
		return x + y;
	}
	
}
