package ejTema4;

public class SmartPhone extends SmartDevice{
	
	private String resolucion;
	private int cantidadTarjetaSim;
	private String tipoPantalla;
	
	
	public SmartPhone(int tamanyoBateria, double pulgadas, String color,
			String resolucion, int cantidadTarjetasSim, String tipoPantalla) {
		super(tamanyoBateria, pulgadas, color);
		this.resolucion = resolucion;
		this.cantidadTarjetaSim = cantidadTarjetasSim;
		this.tipoPantalla = tipoPantalla;

	}


	public String getResolucion() {
		return resolucion;
	}


	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}


	public int getCantidadTarjetaSim() {
		return cantidadTarjetaSim;
	}


	public void setCantidadTarjetaSim(int cantidadTarjetaSim) {
		this.cantidadTarjetaSim = cantidadTarjetaSim;
	}


	public String getTipoPantalla() {
		return tipoPantalla;
	}


	public void setTipoPantalla(String tipoPantalla) {
		this.tipoPantalla = tipoPantalla;
	}
	
	
	
}
