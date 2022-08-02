package ejTema4;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SmartPhone pocoF3 = 
				new SmartPhone(5000, 5.9, "azul", "1980x1080", 2, "Amoled");

		System.out.println(pocoF3.getMahBateria());
		System.out.println(pocoF3.getPulgadas());
		System.out.println(pocoF3.getColor());
		System.out.println(pocoF3.getResolucion());
		System.out.println(pocoF3.getCantidadTarjetaSim());
		System.out.println(pocoF3.getTipoPantalla());
		System.out.println("\n");
		
		SmartWatch appleWatch =
				new SmartWatch(900, 1.9, "gris", "cuero", true);
		
		System.out.println(appleWatch.getMahBateria());
		System.out.println(appleWatch.getPulgadas());
		System.out.println(appleWatch.getCorrea());
		System.out.println(appleWatch.getColor());
		System.out.println(appleWatch.isDigital());
		
	}

}
