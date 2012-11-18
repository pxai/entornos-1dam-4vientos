/**
* OperadoresAritmeticos
* Clase que muestra el uso de operadores aritm�ticos: suma, resta...
*
* Para compilar:
*   javac OperadoresAritmeticos.java
*
* Para ejecutarlo:
*   java OperadoresAritmeticos
*/

// Librer�a necesaria para trabajar con la entrada/salida
import java.io.*;

/**
* clase OperadoresAritmeticos
* Muestra la declaraci�n de operadores ar�tmeticos:
* +, -, *, / : suma, resta, multiplicaci�n, divisi�n
* % : resto de la divisi�n: 7 % 3 = 1
* ++, -- : incremento y decremento en 1
* - : cambio de signo
*
* Por �ltimo tenemos un operador condicional o terciario: ?:
* que equivale a una estructura if-else. Mostramos un 
* ejemplo simple
*
* @author Pello Altadill
*/
public class OperadoresAritmeticos {
	
	/**
	* main
	* Funci�n principal
	* esta funci�n es la que se inicia directamente al ejecutar el programa
	*/
	public static void main (String args[])
	{
		int a,b,c;
		float x,y,z;
		
		a = b = c = 0;
		x = y = z = 0;

		// Mostramos los valores antes y despu�s
		System.out.println("a:" + a + ", b:" + b + ", c:" + c);
		System.out.println("x:" + x + ", y:" + y + ", z:" + z);

		a = b + 45;
		c = a * 666;
		x++;
		y = --z;
		
		System.out.println("a:" + a + ", b:" + b + ", c:" + c);
		System.out.println("x:" + x + ", y:" + y + ", z:" + z);
		
		// Para operaciones en las que el resultado vaya a una de los propios
		// operandos (x = x + 4) podemos usar una operadores de asignaci�n especial:
		// += , -=, *=, /=, %=
		a += 666;
		c %= 2;
		
		// Atenci�n a la diferencia entre ++c y c++:
		// a = ++c primero se incrementa c, luego se asigna a a
		// b = c++ primero se asigna a b, luego se incrementa c
		a = b = c = 0;
		c = 2;
		a = ++c;
		b = c++;
		System.out.println("a:" + a + ", b:" + b + ", c:" + c);

				
		// Podemos hacer las operaciones m�s complejas.
		// para asegurar y aclarar el orden de operaciones podemos
		// meter par�ntesis.
		x = (y *34) + 42 - (1000 % z);		

		// El operador condicional ?: permite asignar dos valores alternativos
		// seg�n una condici�n:  
		// (condici�n)?valor_si_condici�n_es_verdadera:valor_en_caso_contrario
		// Si y es mayor que 0 a x se le asigna y, en caso contrario a x se le asigna 5 
		z = (y > 0)?y:5;
		
		System.out.println("x:" + x + ", y:" + y + ", z:" + z);
	}
}