package ejTema5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CocheCRUDImpl objeto = new CocheCRUDImpl();
		
		System.out.println(objeto.save());
		System.out.println(objeto.findAll());
		System.out.println(objeto.delete());

	}

}
