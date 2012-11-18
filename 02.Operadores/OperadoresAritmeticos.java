/**
* OperadoresAritmeticos
* Clase que muestra el uso de operadores aritméticos: suma, resta...
*
* Para compilar:
*   javac OperadoresAritmeticos.java
*
* Para ejecutarlo:
*   java OperadoresAritmeticos
*/

// Librería necesaria para trabajar con la entrada/salida
import java.io.*;

/**
* clase OperadoresAritmeticos
* Muestra la declaración de operadores arítmeticos:
* +, -, *, / : suma, resta, multiplicación, división
* % : resto de la división: 7 % 3 = 1
* ++, -- : incremento y decremento en 1
* - : cambio de signo
*
* Por último tenemos un operador condicional o terciario: ?:
* que equivale a una estructura if-else. Mostramos un 
* ejemplo simple
*
* @author Pello Altadill
*/
public class OperadoresAritmeticos {
	
	/**
	* main
	* Función principal
	* esta función es la que se inicia directamente al ejecutar el programa
	*/
	public static void main (String args[])
	{
		int a,b,c;
		float x,y,z;
		
		a = b = c = 0;
		x = y = z = 0;

		// Mostramos los valores antes y después
		System.out.println("a:" + a + ", b:" + b + ", c:" + c);
		System.out.println("x:" + x + ", y:" + y + ", z:" + z);

		a = b + 45;
		c = a * 666;
		x++;
		y = --z;
		
		System.out.println("a:" + a + ", b:" + b + ", c:" + c);
		System.out.println("x:" + x + ", y:" + y + ", z:" + z);
		
		// Para operaciones en las que el resultado vaya a una de los propios
		// operandos (x = x + 4) podemos usar una operadores de asignación especial:
		// += , -=, *=, /=, %=
		a += 666;
		c %= 2;
		
		// Atención a la diferencia entre ++c y c++:
		// a = ++c primero se incrementa c, luego se asigna a a
		// b = c++ primero se asigna a b, luego se incrementa c
		a = b = c = 0;
		c = 2;
		a = ++c;
		b = c++;
		System.out.println("a:" + a + ", b:" + b + ", c:" + c);

				
		// Podemos hacer las operaciones más complejas.
		// para asegurar y aclarar el orden de operaciones podemos
		// meter paréntesis.
		x = (y *34) + 42 - (1000 % z);		

		// El operador condicional ?: permite asignar dos valores alternativos
		// según una condición:  
		// (condición)?valor_si_condición_es_verdadera:valor_en_caso_contrario
		// Si y es mayor que 0 a x se le asigna y, en caso contrario a x se le asigna 5 
		z = (y > 0)?y:5;
		
		System.out.println("x:" + x + ", y:" + y + ", z:" + z);
	}
}