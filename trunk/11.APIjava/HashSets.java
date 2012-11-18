/**
* HashSets
* Clase que muestra el uso de la estructura de datos HashSet
*
* Para compilar:
*   javac HashSets.java
*
* Para ejecutarlo:
*   java HashSets
*/

// Librería necesaria para trabajar con la entrada/salida
import java.io.*;

// Librería necesaria para trabajar con HashSet
import java.util.*;

/**
* clase HashSets
* Muestra el uso de la estructura de datos HashSet
* cuya peculiaridad es que forma listas en las que
* NO PUEDEN REPETIRSE LOS VALORES!!!
*
* @author Pello Altadill
*/
public class HashSets {
	
	/**
	* main
	* Función principal
	* Desde la función principal probamos un HashSet
	*/
	public static void main (String args[])
	{
		HashSet mesesVascos = new HashSet();
		
		mesesVascos.add("Urtarrila");
		mesesVascos.add("Otsaila");
		mesesVascos.add("Martxoa");
		mesesVascos.add("Apirila");
		mesesVascos.add("Maiatza");
		mesesVascos.add("Ekaina");
		mesesVascos.add("Uztaila");
		mesesVascos.add("Abuztua");
		mesesVascos.add("Iraila");
		mesesVascos.add("Urria");
		mesesVascos.add("Azaroa");
		mesesVascos.add("Abendua");
		
		// Vamos a quitar el odiado Septiembre...
		mesesVascos.remove("Iraila");
		
		// Vamos a comprobar si Enero NO está presente...
		if (!mesesVascos.contains("Enero")) {
			System.out.println("Efectivamente, no existe Enero");
		}
		
		System.out.println("Volcado: " + mesesVascos.toString());
	}
}