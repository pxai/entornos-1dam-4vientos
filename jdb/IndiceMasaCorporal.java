
/**
* clase IndiceMasaCorporal
* Dado un peso y una altura la clase calcula el �ndice de 
* Masa Corporal que relacion peso y seg�n el valor de una
* valoraci�n.
* Para compilar con vistas a la depuraci�n
*  javac -g IndiceMasaCorporal.java
* Para depurar:
*  jdb IndiceMasaCorporal
*
* @author Pello Altadill
*/
public class IndiceMasaCorporal {
	
	private float altura;
	private float peso;

	
	/**
	* IndiceMasaCorporal
	* M�todo constructor
	* @param float peso
	* @param float altura
	*/
	IndiceMasaCorporal (float peso, float altura)
	{
		this.peso = peso;
		this.altura = altura;
	}
	
	/**
	* IndiceMasaCorporal
	* Otro m�todo constructor que utiliza dos cadenas
	* que transforma en float.
	* @param String peso
	* @param String altura
	* @throw NumberFormatException
	*/
	IndiceMasaCorporal (String peso, String altura) throws NumberFormatException
	{
		this.peso = Float.parseFloat(peso);
		this.altura = Float.parseFloat(altura);
	}
	
	/**
	* calcularIMC
	* calcula el IMC: peso / altura^2
	* @return float
	*/
	public float calcularIMC ()  throws Exception {
		float resultado = 0;
		
		if (peso <= 0 || altura <= 0) {
			throw new Exception("Deben ser mayores que 0!");
		}
		
		// c�lculo de imc
		resultado = peso / (altura * altura);
		
		// multiplicamos
		resultado *= 10000;
		
		return  resultado;
	}
	
	/**
	* diagn�stico
	* calcula el IMC y devuelve un diagn�stico
	* @return String
	*/
	public String diagnostico () throws Exception {		
		float imc = calcularIMC();
		
		if (imc < 18) {
			return "Tienes que engordar";
		} else if (imc >= 18 && imc < 25) {
			return "Muy bien";
		} else {
			return "Sobrepeso";
		} 
	}
	
	/**
	* main
	* m�todo principal. Hace un uso un poco absurdo de la clase
	* m�s que nada para ver algunos ejemplos con el depurador
	*/
	public static void main (String args[]) throws Exception {
		float altura, peso, resultado;
		
		altura = peso = resultado = 0;
		
		altura = 177F;
		peso = 80.3F;
		
		IndiceMasaCorporal imc = new IndiceMasaCorporal(peso, altura);
		
		System.out.println("Vamos a calcular el IMC ");
		
		System.out.println("Peso " + peso + " y altura: " + altura + "\n IMC=" + imc.diagnostico());
		
		resultado = imc.calcularIMC();

	}
	
}