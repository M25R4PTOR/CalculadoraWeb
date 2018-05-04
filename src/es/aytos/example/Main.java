package es.aytos.example;

import es.aytos.main.client.CalculadoraStub;
import es.aytos.main.client.CalculadoraStub.Dividir;
import es.aytos.main.client.CalculadoraStub.DividirResponse;
import es.aytos.main.client.CalculadoraStub.Multiplicar;
import es.aytos.main.client.CalculadoraStub.MultiplicarResponse;
import es.aytos.main.client.CalculadoraStub.Restar;
import es.aytos.main.client.CalculadoraStub.RestarResponse;
import es.aytos.main.client.CalculadoraStub.Sumar;
import es.aytos.main.client.CalculadoraStub.SumarResponse;

public class Main {
	public static void main(String[] args) throws Exception {
		suma();
		resta();
		multiplica();
		divide();
	}
	
	private static void suma() throws Exception {
		CalculadoraStub stub = new CalculadoraStub();
		Sumar operacion = new Sumar();
		SumarResponse response = null;
		// Establecemos los parámetros de la operación
		operacion.setArgs0(100);
		operacion.setArgs1(200);
		// Invocamos el WS
		response = stub.sumar(operacion);
		// Mostramos el resultado
		System.out.println(operacion.getArgs0() + " + " + operacion.getArgs1() + " = "  + response.get_return());
	}
	
	private static void resta() throws Exception {
		CalculadoraStub stub = new CalculadoraStub();
		Restar operacion = new Restar();
		RestarResponse response = null;
		// Establecemos los parámetros de la operación
		operacion.setArgs0(700);
		operacion.setArgs1(200);
		// Invocamos el WS
		response = stub.restar(operacion);
		// Mostramos el resultado
		System.out.println(operacion.getArgs0() + " - " + operacion.getArgs1() + " = " + response.get_return());
	}
	
	private static void multiplica() throws Exception {
		CalculadoraStub stub = new CalculadoraStub();
		Multiplicar operacion = new Multiplicar();
		MultiplicarResponse response = null;
		// Establecemos los parámetros de la operación
		operacion.setArgs0(20);
		operacion.setArgs1(5);
		// Invocamos el WS
		response = stub.multiplicar(operacion);
		// Mostramos el resultado
		System.out.println(operacion.getArgs0() + " * " + operacion.getArgs1() + " = " + response.get_return());
	}
	
	private static void divide() throws Exception {
		CalculadoraStub stub = new CalculadoraStub();
		Dividir operacion = new Dividir();
		DividirResponse response = null;
		// Establecemos los parámetros de la operación
		operacion.setArgs0(20);
		operacion.setArgs1(2.5);
		// Invocamos el WS
		response = stub.dividir(operacion);
		// Mostramos el resultado
		System.out.println(operacion.getArgs0() + " / " + operacion.getArgs1() + " = " + response.get_return());
	}
}