
/**
 * CalculadoraSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.2  Built on : Sep 06, 2010 (09:42:01 CEST)
 */
package es.aytos.main.server;

/**
 * CalculadoraSkeleton java skeleton for the axisService
 */
public class CalculadoraSkeleton {

	/**
	 * Auto generated method signature
	 * 
	 * @param dividir
	 */

	public es.aytos.main.DividirResponse dividir(es.aytos.main.Dividir dividir) {
		es.aytos.main.DividirResponse response = new es.aytos.main.DividirResponse();
		response.set_return(dividir.getArgs0() / dividir.getArgs1());
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param restar
	 */

	public es.aytos.main.RestarResponse restar(es.aytos.main.Restar restar) {
		es.aytos.main.RestarResponse response = new es.aytos.main.RestarResponse();
		response.set_return(restar.getArgs0() - restar.getArgs1());
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param multiplicar
	 */

	public es.aytos.main.MultiplicarResponse multiplicar(es.aytos.main.Multiplicar multiplicar) {
		es.aytos.main.MultiplicarResponse response = new es.aytos.main.MultiplicarResponse();
		response.set_return(multiplicar.getArgs0() * multiplicar.getArgs1());
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param sumar
	 */

	public es.aytos.main.SumarResponse sumar(es.aytos.main.Sumar sumar) {
		es.aytos.main.SumarResponse response = new es.aytos.main.SumarResponse();
		response.set_return(sumar.getArgs0() + sumar.getArgs1());
		return response;	}

}
