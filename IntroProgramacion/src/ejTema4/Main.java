package ejTema4;

public class Main {
	
	public static boolean funcionIf(int numeroIf) {
		boolean positivo = false;
		
		if (numeroIf > 0) positivo = true;
		
		return positivo;
	}
	
	public static void bucleWhile() {
		int i = 0;
		while(i < 3) {
			System.out.println("Valor while: " + i); 
			i++;
		}
	}
	
	public static void doWhile() {
		int i=0;
		do {
			System.out.println("Valor doWhile: " + i);
			i++;
		}while(i<1);
	}
	
	public static void bucleFor() {
		for(int i=0;i<3;i++) {
			System.out.println("Valor for: " + i);
		}
	}
	
	public static void bucleSwitch(int estacion) {

		switch(estacion) {
			case 0:
				System.out.println("Invierno");
				break;
			case 1:
				System.out.println("Primavera");
				break;
			case 2:
				System.out.println("Verano");
				break;
			case 3:
				System.out.println("Otonyo");
				break;
			default:
				System.out.println("Estacion no definida");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroIf = 1;
		int numeroIf2 = 0;
		int numeroIf3 = -1;
		System.out.println(funcionIf(numeroIf));
		System.out.println(funcionIf(numeroIf2));
		System.out.println(funcionIf(numeroIf3));
		
		bucleWhile();
		
		doWhile();
		
		bucleFor();
		
		bucleSwitch(1);
		bucleSwitch(3);
	}

}
