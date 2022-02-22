
package libs;

/**
 * 
 * @author Virginia Ortiz Rodriguez
 *
 */

public class Funciones {
	/**
	 * funci�n que devuelve el n� de enmedio de tre n�meros pasados por par�metros
	 * @param num1  int n�mero dado por par�metro
	 * @param num2 int n�mero dado por par�metro 
	 * @param num3 int n�mero dado por par�metro
	 * @return int devuelve el n�mero del centro de los tres dados
	 */
	
	public int devuelveCentral(int num1, int num2, int num3) {
		
		int enMedio;
		
		if ((num1>num2) && (num1<num3)) {
			enMedio=num1;
		}  else if  ((num2>num1) && (num2<num3)) {
			enMedio= num2;
		} else {
			enMedio = num3;
		}
		return enMedio;
	}
	/**
	 * funci�n que nos indica si un a�o dado por par�metro es bisiesto o no
	 * @param a�o int a�o entroducido por par�metro
	 * @return int devuelve si el a�o bisiesto
	 */
	public boolean esBisiesto(int a�o) {
		boolean bisiesto = false;
		if (a�o %4 == 0 ) {
			if (a�o%100==0 && a�o%400!=0) {
				bisiesto=false;
			} else {
				bisiesto=true;
			}
		} else  {
			bisiesto=false;
		}
		return bisiesto;
	}
	/**
	 * funci�n que comprueba si un n�mero es capic�a, que desde uno central, los n�meros 
	 * por delante y por detr�s, sean iguales
	 * @param v int vector compuesto por n� dados por par�metro
	 * @return int devuelve el n�mero si es realmente capic�a
	 */
	public  boolean esCapicua(int v[]) {
		boolean capicua = true;
		
		for (int i=0, j=v.length-1; i<v.length/2; i++,j--) {
			if (v[i]!=v[j]) {
				capicua=false;
			}
		}
		return capicua;
	}
/**
 * funci�n que suma dos vectores dados por par�metros
 * @param v int vector de enteros dados por par�metro
 * @param v2 int segundo vector dado por par�metro
 * @return devuelve la suma de los dos vectores
 */
	public  int [] suma_vectores(int v[], int v2[]) {
		int vector_suma [] = new int[v.length];
		
		if (v.length!=v2.length) 
		   throw new ArithmeticException("Los vectores deben tener el mismo tama�o");
		
		for (int i = 0; i < vector_suma.length; i++) {
			vector_suma[i]=v[i]+v2[i];
		}
		return vector_suma;
	}
	
	
}
