package ejTema3;

public class Main {
	
	// Primera Parte
	public static int suma (int x, int y, int z) {
		int suma = 0;
		return suma = x+y+z;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(suma(1,2,3)); // 6
		
		//Creamos coche con 0 puertas
		Coche c = new Coche(0);
		
		//Mostramos sus puertas
		System.out.println(c.numPuertas); // 0
		
		c.incrementarPuertas();
		c.incrementarPuertas();
		System.out.println(c.numPuertas); // 2
	}
	
}
