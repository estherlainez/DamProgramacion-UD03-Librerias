
import java.util.Scanner;
public class EjemploMenu {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		Scanner teclado = new Scanner(System.in);
		
		int opcion;
		boolean salir=false;
		
		do {
			System.out.println("Menu");
			System.out.println("1.- Area de la circunferencia");
			System.out.println("2.- Diametro de la circunferencia");
			System.out.println("3.- Perimetro de la circunferencia");
			System.out.println("4.-Salir");
			System.out.println("Introduzca la opcion elegida: ");
			opcion=teclado.nextInt();
				
				
				switch (opcion) {
				case 1:{
					System.out.println("Vamos a calcular el area de la circunferencia");
					System.out.println("Introduzca el radio de la circunferencia: ");
					double radio=teclado.nextDouble();
					//double area=esther.
					
					System.out.println("Aqui muestro el resultado: ");
					break;
				}
				
				case 2:{
					System.out.println("Vamos a calcular el diametro de la circunferencia");
					System.out.println("Introduzca el radio de la circunferencia: ");
					double radio=teclado.nextDouble();
					//double diametro=esther.
					
					System.out.println("Aqui muestro el resultado: ");
					break;
					
				}
				
				case 3:{
					System.out.println("Vamos a calcular el perimetro de la circunferencia");
					System.out.println("Introduzca el radio de la circunferencia: ");
					double radio=teclado.nextDouble();
					//double perimetro=esther.
					
					System.out.println("Aqui muestro el resultado: ");
					break;
				}
				
				case 4:{
					System.out.println("Adios");
					break;
				}
				
				default: {
					System.out.println("Opcion no valida. Vuelva a leer");
				}
			}
		}while(opcion!=4);
		
	}
}