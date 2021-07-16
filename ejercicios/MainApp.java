package unidad8.ejercicios;

import javax.swing.JOptionPane;

import unidad8.clases.Password;
import unidad8.clases.Persona;

public class MainApp {

	public static void main(String[] args) {
		
	//	************* Ejercicio 1 *****************
		Persona persona1 = new Persona();
		System.out.println(persona1);
		
		Persona persona2 = new Persona("Pablo", 28, 'H');
		System.out.println(persona2);
		
		//String nombre, int edad, String DNI, char SEXO, int peso, int altura
		Persona persona3 = new Persona("Juana", 25, "44455566Z", 'M', 60, 160);
		System.out.println(persona3);
		
	/*	************** Ejercicio 2 ****************
		Password password1 = new Password();
		System.out.println(password1);
		
		int longi = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la longitud de la contraseña: "));
		Password password2 = new Password(longi);
		System.out.println(password2);
		
		Password password3 = new Password(5);
		System.out.println(password3);
		
	  */
	}

}
