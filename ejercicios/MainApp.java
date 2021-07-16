package unidad8.ejercicios;

import javax.swing.JOptionPane;

import unidad8.clases.Electrodomestico;
import unidad8.clases.Password;
import unidad8.clases.Persona;
import unidad8.clases.Serie;

public class MainApp {

	public static void main(String[] args) {
		
	//	************* Ejercicio 1 *****************
	/*	
		Persona persona1 = new Persona();
		System.out.println(persona1);
		
		Persona persona2 = new Persona("Pablo", 28, 'H');
		System.out.println(persona2);
		
		//String nombre, int edad, String DNI, char SEXO, int peso, int altura
		Persona persona3 = new Persona("Juana", 25, "44455566Z", 'M', 60, 160);
		System.out.println(persona3);
		
	*/	
	//	************** Ejercicio 2 ****************
	/*	
		Password password1 = new Password();
		System.out.println(password1);
		
		int longi = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la longitud de la contraseña: "));
		Password password2 = new Password(longi);
		System.out.println(password2);
		
		Password password3 = new Password(5);
		System.out.println(password3);
	*/	
	//	************** Ejercicio 3 ****************
			
		Electrodomestico electrodomestico1 = new Electrodomestico();
		Electrodomestico electrodomestico2 = new Electrodomestico(250.0, 50);
		Electrodomestico electrodomestico3 = new Electrodomestico(300.0, "negro", 'A', 75);
		
		System.out.println(electrodomestico1);
		System.out.println(electrodomestico2);
		System.out.println(electrodomestico3);		
		
	 //  ************** Ejercicio 4 ****************
		/*
		Serie serie1 = new Serie();
		Serie serie2 = new Serie("El señor de los anillos", "Pablo");
		Serie serie3 = new Serie("Harry Potter", 5, "Aventuras", "Pablo");
		
		System.out.println(serie1);
		System.out.println(serie2);
		System.out.println(serie3);
		*/
		
		
	}

}
