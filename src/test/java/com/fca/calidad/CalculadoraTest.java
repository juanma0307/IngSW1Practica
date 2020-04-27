package com.fca.calidad;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class CalculadoraTest {
	private Calculadora miCalculadora;
	@Before
	public void setup() {
		 miCalculadora = new Calculadora();
	
}
	@Test
	public void sumapositivo() {
		//llamar al codigo
		float resultadoesperado=6;
		float resultadoEjecucion = miCalculadora.suma(2, 4);
		//verificar
		asserThat(resultadoesperado, equalTo(resultadoEjecucion));
	}
	@Test
	public void sumaConceroTest() {
		//llamar al codigo
		float resultadoEsperando=4;
		float resultadoEjecucion = miCalculadora.suma(0,4);
		//verificar
		asserThat(resultadoesperado, equalTo(resultadoEjecucion));
	}
	
	@Test
	public void Multiplicacionormal() {
	//llamar al codigo	
		float resultadoesperando= 8;
		float resultadoEjecucion= miCalculadora.multiplica(2,4);
	//verificar
		asserThat(resultadoesperado, equalTo(resultadoEjecucion));
		
	}
	@Test
	public void Multiplicacionconcero() {
	//llamar al codigo	
		float resultadoesperando= 0;
		float resultadoEjecucion= miCalculadora.multiplica(0,4);
	//verificar
		asserThat(resultadoesperado, equalTo(resultadoEjecucion));	
	}
	@Test
	public void divisionnormal() {
	//llamar al codigo	
		float resultadoesperando= 5;
		float resultadoEjecucion= miCalculadora.divide(25,5);
	//verificar
		asserThat(resultadoesperado, equalTo(resultadoEjecucion));	
	}
	
	@Test
	public void divisioncondecimal() {
	//llamar al codigo	
		double  resultadoesperando= 0.2;
		float resultadoEjecucion= miCalculadora.divide(5,25);
	//verificar
		asserThat(resultadoesperado, equalTo(resultadoEjecucion));	
	}
	@After
	public void teardown() {
		System.out.println("prueba terminada");
	}

}
