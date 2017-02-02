package EJERCICIO_1;
import java.util.Scanner;

public class EJER_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Son " + grados(leerFloat()) + " grados Farenheit.");
		
		
	}

	public static float leerFloat() {

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String entrada = "";
		float num = 0;
		boolean error = false;

		do {
			System.out.println("Introduzca los grados Celsius:");
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
	
	public static float grados(float grados){
		
		float gradosF=32 + (9 * grados/5);
		
		return gradosF;
	}
	
}
