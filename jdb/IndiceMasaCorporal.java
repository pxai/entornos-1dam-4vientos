
/**
* clase IndiceMasaCorporal
* Dado un peso y una altura la clase calcula el Índice de 
* Masa Corporal que relacion peso y según el valor de una
* valoración.
* Para compilar con vistas a la depuración
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
	* Método constructor
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
	* Otro método constructor que utiliza dos cadenas
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
		
		// cálculo de imc
		resultado = peso / (altura * altura);
		
		// multiplicamos
		resultado *= 10000;
		
		return  resultado;
	}
	
	/**
	* diagnóstico
	* calcula el IMC y devuelve un diagnóstico
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
	* método principal. Hace un uso un poco absurdo de la clase
	* más que nada para ver algunos ejemplos con el depurador
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