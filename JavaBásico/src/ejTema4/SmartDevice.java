package ejTema4;

public class SmartDevice {
	
	private int mahBateria;
	private double pulgadas;
	private String color;
	
	public SmartDevice() {
		
	}
	
	public SmartDevice (int tamanyoBateria, double pulgadas, String color) {
		this.mahBateria = tamanyoBateria;
		this.pulgadas = pulgadas;
		this.color = color;
	}
	
	
	public int getMahBateria() {
		return mahBateria;
	}

	public void setMahBateria(int mahBateria) {
		this.mahBateria = mahBateria;
	}

	public double getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(double pulgadas) {
		this.pulgadas = pulgadas;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}



	
	
	
	
}
