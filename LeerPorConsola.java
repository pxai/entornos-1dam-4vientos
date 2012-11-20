import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 
 */

/**
 * @author pello_altadill
 *
 */
public class LeerPorConsola {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		
		// Magia:
		BufferedReader lector =new BufferedReader(new InputStreamReader(System.in));
		
		String linea = "";
		int numero = 0;
		
		// Solicitamos un valor por consola
		System.out.println("Introduce un texto: ");
		// lo leemos y lo guardamos en linea
		linea = lector.readLine();
		// lo sacamos por pantalla
		System.out.println("Has metido: " + linea);

		// Solicitamos un valor por consola
		System.out.println("Introduce un número: ");
		// lo leemos y lo guardamos en linea
		linea = lector.readLine();
		// lo convertimos
		numero = Integer.parseInt(linea); 
		// lo sacamos por pantalla
		System.out.println("Has metido: " + numero);
		
	}

}
