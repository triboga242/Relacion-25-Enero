package EJER_3;

import java.util.Scanner;

public class EJER_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("Son " + velocidad(leerFloat()) + "m/s");
		
	}
	
	public static double velocidad (double velo){
		double velo2= velo / 3.6;
		return velo2;
	}
	
	
	public static float leerFloat() {

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String entrada = "";
		float num = 0;
		boolean error = false;

		do {
			System.out.println("Introduzca una velociad en km/h:");
			entrada = teclado.nextLine();

			try {
				num = Float.parseFloat(entrada);
				error = false;
				} catch (NumberFormatException ne) {
				error = true;
				System.out.println("Error no has introducido un numero");
				} catch (Exception e) {
				error = true;
				System.out.println("Error generico, revisa la excepcion");
				}
			} while (error);
		return num;
	}
}
