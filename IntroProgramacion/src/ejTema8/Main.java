package ejTema8;

public class Main {
	
	
	static class Persona {
	
		private int edad;
		private String nombre;
		private int telefono;
		
		public Persona(int edad, String nombre, int telefono) {
			this.edad = edad;
			this.nombre = nombre;
			this.telefono = telefono;
		}
		
		public int getEdad() {
			return this.edad;
		}
		
		public void setEdad(int edad) {
			this.edad = edad;
		}
		
		public String getNombre() {
			return this.nombre;
		}
		
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		public int getTelefono() {
			return this.telefono;
		}
		
		public void setTelefono(int telefono) {
			this.telefono = telefono;
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p = new Persona(0, null, 0);
		
		System.out.println(p.getEdad()+ ", " + p.getNombre() + ", " + p.getTelefono());
		p.setEdad(20);
		p.setNombre("Pepe");
		p.setTelefono(123456789);
		System.out.println(p.getEdad()+ ", " + p.getNombre() + ", " + p.getTelefono());
	}
	


}
