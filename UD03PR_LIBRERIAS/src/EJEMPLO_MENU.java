import java.util.Scanner;
public class EJEMPLO_MENU {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		int opcion;
		boolean salir=false;
		do {
			System.out.println("MENU");
			System.out.println("1-Area de la circunferencia");
			System.out.println("2-Diametro de la circunferencia");
			System.out.println("3-Perimetro de la circunferencia");
			System.out.println("4-Salir");
			System.out.println("Introduzca la opcion: ");
			opcion=teclado.nextInt();
			
			switch (opcion) {
			case 1:{
				System.out.println("vamos a calcular el area de la circunferencia");
				System.out.println("Introduzca el radio de la circunferencia");
				double radio=teclado.nextDouble();
				//double r=ejer06Jorge.areaCircunferencia(radio);
				System.out.println("Aqui muestro el resultado ");
				break;
			}
			case 2:{
				System.out.println("vamos a calcular el diametro de la circunferencia");
				System.out.println("introduzca el radio  de la circunferencia");
				double radio=teclado.nextDouble();
				//double r=ejer06Jorge.diametroCircunferencia(radio);
				System.out.println("Aqui muestro el resultado");
				break;
			}
			case 3:{
				System.out.println("vamos a calcular el perimetro de la circunferencia");
				System.out.println("introduzca el radio  de la circunferencia");
				double radio=teclado.nextDouble();
				//double r=ejer06Jorge.perimetroCircunferencia(radio);
				System.out.println("Aqui muestro resultado");
				break;
			}
			case 4:{
				System.out.println("Adios");
				break;
			}
			default: {
				System.out.println("opcion no valida, vuelva a leer");
			}
			
			}
			
			
		}while(opcion!=4);

	}
	

}
