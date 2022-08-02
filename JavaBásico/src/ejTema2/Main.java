package ejTema2;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(getPrice(15));
		
	}

	private static double IVA = 0.21;
	
	private static double getPrice(double price) {
		double totalPrice = price;
		return totalPrice + (totalPrice * IVA);
	}

}
