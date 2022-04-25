package ar.edu.unlam.pb2.coronacircular;

import org.junit.Assert;
import org.junit.Test;

public class CirculoTest {

	
	private static final Double RADIO = 1.0;

	@Test
	public void alCrearUnaCoronaCircularSeInicializaConSuRadioInteriorYExterior() {
		Circulo circulo = cuandoCreoUnCirculo(RADIO);
		elCirculoTieneRadio(circulo);
	}

	private void elCirculoTieneRadio(Circulo circulo) {
		Assert.assertEquals(circulo.getRadio(), RADIO);
	}

	private Circulo cuandoCreoUnCirculo(Double radio) {
		return new Circulo(radio);
	}

}
