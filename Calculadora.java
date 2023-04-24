package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * La clase Calculadora representa una calculadora básica que puede realizar
 * operaciones aritméticas básicas como suma, resta, multiplicación y división.
 */
public class Calculadora {

	/** El primer valor de la operación. */
	private Float valor1;

	/** El segundo valor de la operación. */
	private Float valor2;

	/** El resultado de la operación. */
	private Float resultado;

	/** La lista de resultados de las operaciones realizadas. */
	private List<String> resultados = new ArrayList<String>();

	/**
	 * Obtiene el primer valor de la operación.
	 * 
	 * @return El primer valor de la operación.
	 */
	public Float getValor1() {
		return valor1;
	}

	/**
	 * Establece el primer valor de la operación.
	 * 
	 * @param valor1 El primer valor de la operación.
	 */
	public void setValor1(Float valor1) {
		this.valor1 = valor1;
	}

	/**
	 * Obtiene el segundo valor de la operación.
	 * 
	 * @return El segundo valor de la operación.
	 */
	public Float getValor2() {
		return valor2;
	}

	/**
	 * Establece el segundo valor de la operación.
	 * 
	 * @param valor2 El segundo valor de la operación.
	 */
	public void setValor2(Float valor2) {
		this.valor2 = valor2;
	}

	/**
	 * Obtiene el resultado de la operación.
	 * 
	 * @return El resultado de la operación.
	 */
	public Float getResultado() {
		return resultado;
	}

	/**
	 * Establece el resultado de la operación.
	 * 
	 * @param resultado El resultado de la operación.
	 */
	public void setResultado(Float resultado) {
		this.resultado = resultado;
	}

	/**
	 * Obtiene la lista de resultados de las operaciones realizadas.
	 * 
	 * @return La lista de resultados de las operaciones realizadas.
	 */
	public List<String> getResultados() {
		return resultados;
	}

	/**
	 * Establece la lista de resultados de las operaciones realizadas.
	 * 
	 * @param resultados La lista de resultados de las operaciones realizadas.
	 */
	public void setResultados(List<String> resultados) {
		this.resultados = resultados;
	}
	
	/**
	 * Realiza la operación de suma entre los dos valores y agrega el resultado a la lista de resultados.
	 */
	public void somar(){
		resultado=valor1+valor2;
		resultados.add("["+valor1+"+"+valor2+"="+resultado+"]");
	}
	
	/**
	 * Realiza la operación de resta entre los dos valores y agrega el resultado a la lista de resultados.
	 */
	public void subtrair(){
		resultado=valor1-valor2;
		resultados.add("["+valor1+"-"+valor2+"="+resultado+"]");
	}
	
	/**
	 * Realiza la operación de multiplicación entre los dos valores y agrega el resultado a la lista de resultados.
	 */
	public void multiplicar(){
		resultado=valor1*valor2;
		resultados.add("["+valor1+"*"+valor2+"="+resultado+"]");
	}
	
	/**
	 * Realiza la operación de división entre los dos valores y agrega el resultado a la lista de resultados.
	 */
	public void dividir(){
		resultado=valor1/valor2;
		resultados.add("["+valor1+"/"+valor2+"="+resultado+"]");
	}

}
