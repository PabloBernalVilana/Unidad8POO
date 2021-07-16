package unidad8.clases;

public class Persona {
	
	private final char SEXO = 'H';
	
	private String nombre;
	private int edad;
	private String DNI;
	private char sexo;
	private int peso;
	private int altura;
	
	public Persona() {
		this.nombre = "";
		this.edad  = 0;
		this.DNI = DNI;
		this.peso = 0;
		this.altura = 0;
		this.sexo = SEXO;
	}
	public Persona (String nombre, int edad, char SEXO) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = SEXO;
	}
	
	public Persona (String nombre, int edad, String DNI, char SEXO, int peso, int altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = DNI;
		this.sexo = SEXO;
		this.peso = peso;
		this.altura = altura;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public char getSEXO() {
		return SEXO;
	}
	@Override
	public String toString() {
		return "Nombre=" + nombre + ", Edad=" + edad + ", DNI=" + DNI + ", Sexo=" + sexo
				+ ", Peso=" + peso + ", Altura=" + altura + "]";
	}
	
	
	


	
	
}
