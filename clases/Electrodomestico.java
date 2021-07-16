package unidad8.clases;

/*
	Los colores disponibles son blanco, negro, rojo, azul y gris. 
	No importa si el nombre esta en mayúsculas o en minúsculas.

  */
public class Electrodomestico {
	// Atributos que se pueden heredar

	protected double precioBase;
	protected String color; // blanco, negro, rojo, azul y gris
	protected char consumoEnergetico;
	double peso;

	protected final double precioDefecto = 100;
	protected final String colorDefecto = "blanco";
	protected final char consumoDefecto = 'F';
	protected final double pesoDefecto = 5;

	// Constantes

	// Constructor por defecto
	public Electrodomestico() {
		this.precioBase = precioDefecto; // Por defecto 100€
		this.color = colorDefecto; // Por defecto color Blanco
		this.consumoEnergetico = consumoDefecto; // Por defecto F
		this.peso = pesoDefecto; // Por defecto 5KG
	}

	// Constructor con precio y peso, el resto por defecto
	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = colorDefecto;
		this.consumoEnergetico = consumoDefecto;
	}

	// Constructor con todos los atributos
	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + ", precioDefecto=" + precioDefecto + ", colorDefecto="
				+ colorDefecto + ", consumoDefecto=" + consumoDefecto + ", pesoDefecto=" + pesoDefecto + "]";
	}

}
