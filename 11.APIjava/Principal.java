import java.util.Enumeration;
import java.util.Hashtable;
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

		Vector<Robot> ejercitoDeRobots = new Vector<Robot>();
		
		
		Robot unRobot = new Robot();
		ejercitoDeRobots.add(unRobot);
		
		Robot otroRobot = new Robot("Arale",100);
		ejercitoDeRobots.add(otroRobot);
		
		// Añado una instancia directamente
		ejercitoDeRobots.add(new Robot("Alita",543));
		
		for (int i = 0; i < ejercitoDeRobots.size(); i++) {
			// No necesitamos hacer un cast
			ejercitoDeRobots.get(i).saludar();
		}
		
		Hashtable<String,Robot> robots = new Hashtable<String,Robot>();
		
		// Añadimos un elemento al Hastable
		robots.put("Arale", otroRobot );
		
		Robot otroRobotMas = new Robot("Bender", 666);
		Robot otroRobotMasoMenos = new Robot("Flexo", 667);
		
		robots.put("Bender", otroRobotMas );
		robots.put("Flexo", otroRobotMasoMenos );
		
		// Existe algún objeto con la clave "Bender" ?
		if (robots.containsKey("Bender")) {
			System.out.println("Besa mi brillante culo metálico");
			// Con un cast
			//((Robot)robots.get("Bender")).saludar();
			robots.get("Bender").saludar();
		}
		
		// Saco las claves
		Enumeration lista = robots.keys();
		
		// y las voy mostrando
		while(lista.hasMoreElements()) {
			String clave = lista.nextElement().toString();
			robots.get(clave).saludar();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
