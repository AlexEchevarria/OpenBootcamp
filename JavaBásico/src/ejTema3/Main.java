package ejTema3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String primero = "Hola mundo";
		String segundo = "estoy";
		String tercero = "concatenando";
		String cuarto = "textos";
		
		String [] nombres = {"Pepe", "Juan", "Sara"};
		
		//Concatenar strings
		String concatenado = "";
		concatenado = primero + " " + segundo + " " + tercero + " " + cuarto +".";
		
		
		//Bucle concatenado
		String bucleConcatenado = "";
		for(int i=0; i<nombres.length;i++) {
			if(i+1 == nombres.length) {
				bucleConcatenado+=nombres[i] + ".";
			}else {
				bucleConcatenado+=nombres[i] + ", ";
			}
			
			
		}
		
		System.out.println(concatenado);
		System.out.println(bucleConcatenado);
	}

}
