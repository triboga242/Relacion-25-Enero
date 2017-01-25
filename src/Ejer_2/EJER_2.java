package Ejer_2;

import java.util.Scanner;

public class EJER_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("¿Cual es el radio de la circunferencia?");
		float radio=leerFloat();
		System.out.println("La longitud de la circunferencia es : "+longitud (radio));
		System.out.println("El area de la circunferencia es : " + area(radio));
		
	}
	
	public static double longitud (float cm1){
	
		double cm3 = 2*Math.PI*cm1;
		return cm3;	
	}
	
	public static double area (float cm2){
		
		double cm4 = Math.PI*(cm2*cm2); 
		return cm4;
	} 
		
	public static float leerFloat() {

			@SuppressWarnings("resource")
			Scanner teclado = new Scanner(System.in);
			String entrada = "";
			float num = 0;
			boolean error = false;

			do {
				System.out.println("Introduzca el radio de la circunferencia:");
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
					if (num<=0){
						error=true;
					}
				} while (error);
			return num;
		}
}
