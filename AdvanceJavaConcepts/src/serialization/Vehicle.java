package serialization;

public class Vehicle {
	String regno;
	int model;

	public Vehicle(String regno, int model) {
		super();
		this.regno = regno;
		this.model = model;
	}

	public String getRegno() {
		return regno;
	}

	public void setRegno(String regno) {
		this.regno = regno;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Vehicle [regno=" + regno + ", model=" + model + "]";
	}

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

}
