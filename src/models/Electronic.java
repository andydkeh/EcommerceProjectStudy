package models;

public class Electronic extends Product {
	private String brand;
	private Integer voltage;

	public Electronic(String brand, Integer voltage) {
		// adicionar os atributos da superclasse
		super();
		this.brand = brand;
		this.voltage = voltage;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Integer getVoltage() {
		return voltage;
	}

	public void setVoltage(Integer voltage) {
		this.voltage = voltage;
	}

	// sobrescrever o método da superclasse
	// @Override
	public void displayDetails() {
		System.out.println("Brand: " + brand + ", Voltage: " + voltage + "V");
	}
	
}
