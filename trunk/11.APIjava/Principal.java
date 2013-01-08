import java.util.Vector;

/**
 * 
 */

/**
 * @author pello_altadill
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Féliz año 1900");
		Vector alumnos = new Vector();
		
		alumnos.add("Javier");
		alumnos.add("Demi");
		alumnos.add("Vector");
		alumnos.add("Rubén");
		
		for (int i = 0; i < alumnos.size(); i++) {
			System.out.println(alumnos.get(i));
		}
		
		alumnos.clear();
		
		Vector ejercitoDeRobots = new Vector();
		
		Robot unRobot = new Robot();
		ejercitoDeRobots.add(unRobot);
		
		Robot otroRobot = new Robot("Arale",100);
		ejercitoDeRobots.add(otroRobot);
		
		// Añado una instancia directamente
		ejercitoDeRobots.add(new Robot("Alita",543));
		
		for (int i = 0; i < ejercitoDeRobots.size(); i++) {
			((Robot)ejercitoDeRobots.get(i)).saludar();
		}
		
		
		
	}

}
