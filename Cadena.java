public class Cadena{
	public static void main(String[] args){
		String cadena = "exposicióo";
		String minuscula = cadena.toLowerCase();
		String mayuscula = cadena.toUpperCase();
		System.out.printf("%s%s%n", minuscula, mayuscula);

		int longitud = cadena.length();
		int contador = 0;
		for(int i=0; i < longitud; i++){
			if(cadena.charAt(i) == 'á' || cadena.charAt(i) == 'é' || cadena.charAt(i) == 'í' || cadena.charAt(i) == 'ó' || cadena.charAt(i) == 'ú' ){
				contador = contador + 1;
			}
		}	
		System.out.printf("El numero de vocales acentuadas es %d%n", contador);
		
		//No tengo en cuenta las acentuadas ni mayúsculas
		if( cadena.charAt(0) == 'a' || cadena.charAt(0) == 'e' || cadena.charAt(0) == 'i' || cadena.charAt(0) == 'o' || cadena.charAt(0) == 'u'){
			System.out.printf("La cadena %s empieza por vocal%n", cadena);
		}
		if(cadena.charAt(longitud - 1) == 'a' || cadena.charAt(longitud - 1) == 'e' || cadena.charAt(longitud - 1) == 'i' || cadena.charAt(longitud -1) == 'o' || cadena.charAt(longitud - 1) == 'u'){
			System.out.printf("La cadena %s termina por vocal%n", cadena);

		}


	}
	//Comentario para hacer commit
}
