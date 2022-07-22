package ejTema9;

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
	
	
	static class Cliente extends Persona {
		
		private int credito;
		
		public Cliente(int edad, String nombre, int telefono, int credito) {
			super(edad, nombre, telefono);
			this.credito = credito;
		}
		
		public int getCredito() {
			return this.credito;
		}
		
		public void setTelefono(int credito) {
			this.credito = credito;
		}
		
	}
	
	static class Trabajador extends Persona {
		
		private int salario;
		
		public Trabajador(int edad, String nombre, int telefono, int salario) {
			super(edad, nombre, telefono);
			this.salario = salario;
		}
		
		public int getSalario() {
			return this.salario;
		}
		
		public void setSalario(int credito) {
			this.salario = credito;
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente c = new Cliente(25, "pepe", 123456789, 10000);
		System.out.println(c.getEdad() + ", " + c.getNombre()+ ", " + c.getTelefono() + ", " + c.getCredito());
		
		Trabajador t = new Trabajador(20, "Juan", 123456123, 5000);
		System.out.println(t.getEdad() + ", " + t.getNombre()+ ", " + t.getTelefono() + ", " + t.getSalario());
		
	}

}
