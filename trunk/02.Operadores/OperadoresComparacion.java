/**
* OperadoresComparacion
* Clase que muestra el uso de operadores de comparación
*
* Para compilar:
*   javac OperadoresComparacion.java
*
* Para ejecutarlo:
*   java OperadoresComparacion
*/

// Librería necesaria para trabajar con la entrada/salida
import java.io.*;

/**
* clase OperadoresComparacion
* Muestra el uso de los operadores de comparación que sirven para comparar
* entre si dos valores. Es importantes saber que:
* - Los dos valores comparadods deben ser del mismo tipo
* - El resultado es booleano, es decir verdadero o falso
*
* Los operadores de comparación son los siguientes:
*    >   mayor que, por ejemplo a mayor que b: a > b
*    <   menor que
*    ==  igual que
*    >=  mayor o igual que
*    <=  menor o igual que
*    !=  distinto de
*
* Normalmente se utilizan como expresiones para establecer una condición
* en estructuras condicionales, bubles, etc... y unidos mediante operadores
* booleanos pueden construirse expresiones más complejas
*
* @author Pello Altadill
*/
public class OperadoresComparacion {
	
	/**
	* main
	* Función principal
	* esta función es la que se inicia directamente al ejecutar el programa
	*/
	public static void main (String args[])
	{
		// Solo pueden ser true o false
		boolean resultado;
		int enano, grande;
		
		char letra = 'a';
		char otraLetra = 'k';
		char mayuscula = 'A';
		
		String autobot = "Optimus";
		String decepticon = "Megatron";
		String agente = "007";
		
		enano = grande = 0;
		
		resultado = (enano == grande);

		System.out.println("Son iguales enano y grande? " + resultado);
		
		grande = 42;
		// Podemos comparar y mostrar directamente. 
		// la comparación la ponemos entre paréntesis por claridad 
		System.out.println("Son iguales enano y grande? " + (enano == grande));
		System.out.println("Es enano mayor que grande? " + (enano > grande));
		System.out.println("Es enano menor que grande? " + (enano < grande));		
		System.out.println("Es enano distinto de grande? " + (enano != grande));	
		
		// Podemos comparar letras	e incluso cadenas
		resultado = (letra > otraLetra);
		System.out.println("Es 'a' mayor que 'k' " + resultado);	
		
		resultado = (letra == mayuscula);
		System.out.println("Es 'a' igual que 'A' " + resultado);	
		
		// Con las cadenas podemos usar == y !=
		System.out.println("Optimos es igual que Megatron? " +  (autobot == decepticon));	
		System.out.println("Optimos es distinto de Megatron? " +  (autobot != decepticon));	
		// Esto no podriamos
		//System.out.println("Y si una palabra empieza por un número? " +  (agente > autobot));	

	}
}