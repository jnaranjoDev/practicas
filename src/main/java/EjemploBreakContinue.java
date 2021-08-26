
public class EjemploBreakContinue {

	public static void main(String[] args) {
		
		/*
		 *  1. while imprimir los numeros del 1 al 20
		 *  
		 */
		
		/*
		 *  2. while imprimir los numeros del 1 al 20 y para cada uno de elos mostrar
		 *  si es par o impar
		 */
		
		/*
		 * 3. While imprimir los numeros del 1 al 20 y para cada unop de ellos mostrar
		 * si es par o impar. Pero si el numero es el 7 saltar el paso de decir si es par o impar.
		 * 
		 */
		
		/*
		 * int num = 0; while(num < 20) { num ++; System.out.println(num); }
		 */
		
		/*
		 * int num1 = 0; while(num1 < 20) { if(num1 == 7) { num1++; continue; } if (num1
		 * % 2 == 0) { System.out.println(num1+" Es par");; } else {
		 * System.out.println(num1+"Es impar"); } num1 ++; }
		 */
		
		/*
		 * con for mejorado 5 veces mostrar las letras de la A a la F
		 */

		for(int i= 0; i<5;i++) {
			for(int l= (byte) 'A'; l <= (byte) 'F'; l++) {
				System.out.println((char)l);
				if(l == 'E');
			}
			System.out.println();
		}
		

	}

}
