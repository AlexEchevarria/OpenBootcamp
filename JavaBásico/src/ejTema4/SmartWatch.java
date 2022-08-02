package ejTema4;

public class SmartWatch extends SmartDevice{
	
	private String correa;
	private boolean digital;
	
	public SmartWatch(int tamanyoBateria, double pulgadas, String color, String correa, boolean digital) {
		super(tamanyoBateria, pulgadas, color);
		this.correa = correa;
		this.digital = digital;
	}

	public String getCorrea() {
		return correa;
	}

	public void setCorrea(String correa) {
		this.correa = correa;
	}

	public boolean isDigital() {
		return digital;
	}

	public void setDigital(boolean digital) {
		this.digital = digital;
	}
	
}
