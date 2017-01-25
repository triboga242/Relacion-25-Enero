package EJER_4;

import java.util.Scanner;

public class EJER_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float cateto1=leerFloat();
		float cateto2=leerFloat();
		System.out.println("La hipotenusa es " + hipotenusa(cateto1, cateto2) + "cms");				
	}
	
	public static double hipotenusa (float cat1, float cat2){
		double hipo=0.00F;
		hipo=Math.sqrt((cat1*cat1)+(cat2*cat2));
		return hipo;
	}
	
	public static float leerFloat() {

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String entrada = "";
		float num = 0;
		boolean error = false;

		do {
			System.out.println("Introduzca la longitud del cateto en cms:");
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
				error= true;
				System.out.println("numero negativo, inutil.");
			}
			} while (error);
		return num;
	}
}
