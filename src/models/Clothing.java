package models;

public class Clothing extends Product {
	private Character size;
	private String material;

	public Clothing(Character size, String material) {
		// adicionar os atributos da superclasse
		super();
		this.size = size;
		this.material = material;
	}

	public Character getSize() {
		return size;
	}

	public void setSize(Character size) {
		this.size = size;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	// sobrescrever o método da superclasse
	// @Override
	public void displayDetails() {
		System.out.println("Size: " + size + ", Material: " + material);
	}

}
