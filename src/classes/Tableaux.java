package classes;

public class Tableaux {
	public static void main(String[] args) {
		int[] ints =  {5, 9, 3, 45};
		for (int i = 0; i < ints.length; i++) {
			System.out.println(ints[i]);
		}
		System.out.println("The sum of the ints is %s".formatted(tableauAdd(ints)));
		System.out.println(tableauAdd(new int[] {3, 5, 1}));
		
		String myStr = "Bonjour";
		System.out.println(myStr.length());
		
	}
	
	public static int tableauAdd(int[] tab) {
		int sum = 0;
		for (int i = 0; i < tab.length; i++) {
			sum += tab[i];
		}
		return sum;
	}
}
