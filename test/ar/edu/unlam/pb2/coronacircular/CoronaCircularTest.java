package ar.edu.unlam.pb2.coronacircular;

import org.junit.Assert;
import org.junit.Test;

public class CoronaCircularTest {

	private static final Integer RADIO_EXTERIOR = 2;
	private static final Integer RADIO_INTERIOR = 1;
	private static final Double PERIMETRO_ESPERADO = 18.84;
	private static final Double AREA_ESPERADA = 9.42;

	// debe poder crearse ->
	// dado radio exterior se obtenga el radio interior
	// dado radio interior se obtenga el radio exterior
	@Test
	public void alCrearUnaCoronaCircularSeInicializaConSuRadioInteriorYExterior() {
		CoronaCircular corona = cuandoCreoUnaCoronaCircular(RADIO_INTERIOR, RADIO_EXTERIOR);
		laCoronaCicularTieneRadioInteriorYExterior(corona);
	}

	// obtener perimetro
	@Test
	public void alCrearUnaCoronaCircularConRadioInterior_1_YRadioExterior_2_SuPerimetroEs_X() {

		CoronaCircular corona = dadoQueExisteCoronaCircular(RADIO_INTERIOR, RADIO_EXTERIOR);

		Double areaObtenida = cuandoObtengoElAreaDeLaCorona(corona);

		entoncesSuAreaEs(areaObtenida, AREA_ESPERADA);
	}
	
	private void entoncesSuAreaEs(Double areaObtenida, Double areaEsperada) {
		Assert.assertEquals(areaObtenida, areaEsperada, 0.01);		
	}

	private Double cuandoObtengoElAreaDeLaCorona(CoronaCircular corona) {
		return corona.getArea();
	}

	// Area
	@Test
	public void alCrearUnaCoronaCircularConRadioInterior_1_YRadioExterior_2_SuAreaEs_X() {
		CoronaCircular corona = dadoQueExisteCoronaCircular(RADIO_INTERIOR, RADIO_EXTERIOR);

		Double perimetroObtenido = cuandoObtengoElPerimetroDeLaCorona(corona);

		entoncesSuPerimetroEs(perimetroObtenido, PERIMETRO_ESPERADO);
	}

	private void entoncesSuPerimetroEs(Double perimetroObtenido, Double perimetro) {
		Assert.assertEquals(perimetroObtenido, perimetro, 0.01);
	}

	// duplicidad por legibilidad
	private CoronaCircular dadoQueExisteCoronaCircular(Integer radioInterior, Integer radioExterior) {
		return new CoronaCircular(RADIO_INTERIOR, RADIO_EXTERIOR);
	}

	private Double cuandoObtengoElPerimetroDeLaCorona(CoronaCircular corona) {
		return corona.getPerimetro();
	}

	// obtener el area

	private void laCoronaCicularTieneRadioInteriorYExterior(CoronaCircular corona) {
		Assert.assertEquals(RADIO_INTERIOR, corona.getRadioInterior());
		Assert.assertEquals(RADIO_EXTERIOR, corona.getRadioExterior());
	}

	private CoronaCircular cuandoCreoUnaCoronaCircular(Integer interior, Integer exterior) {
		return new CoronaCircular(interior, exterior);
	}

}
