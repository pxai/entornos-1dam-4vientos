/**
 * 
 */

/**
 * @author pello_altadill
 *
 */
public class Robot {
	String nombre;
	int autonomia;
	
	
	public Robot ()  {
		nombre = "Nestor 5";
		autonomia = 1000;
	}
	
	/**
	 * @param nombre
	 * @param autonomia
	 */
	public Robot(String nombre, int autonomia) {
		this.nombre = nombre;
		this.autonomia = autonomia;
	}

	/**
	 * saludar
	 * saca un saludo por pantalla
	 */
	public void saludar () {
		System.out.println("Hola soy " + nombre);
	}

}
