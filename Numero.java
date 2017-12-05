import java.util.Scanner;
/**
 Examen tipoB ejercicio 1
 @author Javi
 @version 1.0
*/

public class Numero{
	public static void main(String[] args){
		
		int numero1, numero2;
		Scanner sc = new Scanner(System.in);
		System.out.printf( "Introduce el numero 1%n:");
		numero1 = sc.nextInt();
		System.out.printf( "Introduce el numero 2%n:");
		numero2 = sc.nextInt();
		sc.close();

		if( (numero1 < 1) || (numero1 > 999) || (numero2 < 1) || (numero2 > 999)  ){
			System.out.printf( "Los numeros introducidos no son válidos%n");
		}
		
		else{
			int mayor = serMayor( numero1, numero2 );
			System.out.printf( "El numero mayor es %d%n ", mayor );
			
			mostrarMultiplos3( numero1);
		}

	}
	/**
	Metodo que nos dice cual es mayor de dos numeros
	@param numero1 int
	@param numero2 int
	@return mayor int nos devuelve el numero mayor
	*/
	public static int serMayor (int numero1, int numero2){
		int mayor;
		if( numero1 >= numero2){
			mayor = numero1;	
		}
		else{
			mayor = numero2;
		}
		return mayor;
	}
	/**
	Metodo que nos muestra los 10 primeros multiplos de 3 del numero1
	@param numero1 int
	*/
	public static void mostrarMultiplos3 (int numero1){
		System.out.printf("Mostramos los 10 primeros multiplos de 3 del numero %d%n", numero1);
		int resultado = numero1;
		int acumulador;
		for(int i =1; i<=10; i++){
			resultado = resultado*3;
			System.out.printf("%d%n",resultado);
			 
		}
	}
//Comentario para realizar el commit
}
