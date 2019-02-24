

public class variasFunciones {
	
		
		
		public static boolean esPrimo(int numero) {

		int contador=2;
		boolean esPrimo=true;
		
		
		while((contador!=numero)&&(esPrimo==true)) {
			if (numero%contador!=0) {
				
				esPrimo=true;
			}else {
				esPrimo=false;
			}
			contador++;
		}
		return esPrimo;
		}
		
		
		
		
		public static void Imprimir (String nombre) {
			System.out.println("El string que llega como parametro es"+nombre);
		}
		
}
