package Junit.Junit09_Geometria;

import static org.junit.jupiter.api.Assertions.*;
import JUnit.Junit09_Geometria.dto.*;

import org.junit.jupiter.api.Test;

class GeometriaTest {

	Geometria geometria = new Geometria();

	@Test
	void testGeometriaInt() {
		int id = 3;
		String figura = "Triangulo";
		double area = 0.00;
		Geometria geotest = new Geometria(id);
		
		assertEquals(id, geotest.getId());
		assertEquals(figura, geotest.getNom());
		assertEquals(area, geotest.getArea());
	}

	@Test
	void testGeometria() {
		Geometria geotest = new Geometria();
		String nombreEsperado = "Default";
		int idEsperada = 9;
		double areaEsperada = 0.00;
		assertEquals(nombreEsperado, geotest.getNom());
		assertEquals(idEsperada, geotest.getId());
		assertEquals(areaEsperada, geotest.getArea());
	}

	@Test
	void testAreacuadrado() {
		int area = geometria.areacuadrado(5);
		int esperado = 25;
		assertEquals(esperado, area);
	}

	@Test
	void testAreaCirculo() {
		double area = geometria.areaCirculo(10);
		double esperado = 314;
		int delta = 1;
		assertEquals(esperado, area, delta);
	}

	@Test
	void testAreatriangulo() {
		int area = geometria.areatriangulo(5, 5);
		double esperado = 12.5;
		int delta = 1;
		assertEquals(area, esperado, delta);
	}

	@Test
	void testArearectangulo() {
		int area = geometria.arearectangulo(5, 5);
		int esperado = 25;
		assertEquals(area, esperado);
	}

	@Test
	void testAreapentagono() {
		int area = geometria.areapentagono(5, 10);
		int esperado = 25;
		int delta = 1;
		assertEquals(area, esperado, delta);
	}

	@Test
	void testArearombo() {
		int area = geometria.arearombo(5, 10);
		int esperado = 25;
		int delta = 1;
		assertEquals(area, esperado, delta);
	}

	@Test
	void testArearomboide() {
		int area = geometria.arearomboide(4, 5);
		int esperado = 20;
		assertEquals(area, esperado);
	}

	@Test
	void testAreatrapecio() {
		int area = geometria.areatrapecio(3, 5, 2);
		int esperado = 8;
		int delta = 1;
		assertEquals(area, esperado, delta);
	}

	@Test
	void testFigura() {
		String figura1 = geometria.figura(1);
		String figura2 = geometria.figura(2);
		String figura3 = geometria.figura(3);
		String figura4 = geometria.figura(4);
		String figura5 = geometria.figura(5);
		String figura6 = geometria.figura(6);
		String figura7 = geometria.figura(7);
		String figura8 = geometria.figura(8);
		String figura0 = geometria.figura(0);

		String esperado1 = "Cuadrado";
		String esperado2 = "Circulo";
		String esperado3 = "Triangulo";
		String esperado4 = "Rectangulo";
		String esperado5 = "Pentagono";
		String esperado6 = "Rombo";
		String esperado7 = "Romboide";
		String esperado8 = "Trapecio";
		String esperado0 = "Default";

		assertEquals(figura0, esperado0);
		assertEquals(figura1, esperado1);
		assertEquals(figura2, esperado2);
		assertEquals(figura3, esperado3);
		assertEquals(figura4, esperado4);
		assertEquals(figura5, esperado5);
		assertEquals(figura6, esperado6);
		assertEquals(figura7, esperado7);
		assertEquals(figura8, esperado8);
	}

	@Test
	void testGetId() {
		int id = geometria.getId();
		int esperado = 9;
		assertEquals(id, esperado);
	}

	@Test
	void testSetId() {
		int newID = 5;
		geometria.setId(newID);
		assertEquals(newID, geometria.getId());
	}

	@Test
	void testGetNom() {
		String nom = geometria.getNom();
		String esperado = "Default";
		assertEquals(nom, esperado);
	}

	@Test
	void testSetNom() {
		String newNom = geometria.figura(geometria.getId());
		geometria.setNom(geometria.figura(geometria.getId()));
		assertEquals(newNom, geometria.getNom());
	}

	@Test
	void testSetArea() {
		double area = 31.5;
		geometria.setArea(area);
		assertEquals(area, geometria.getArea());
	}

	@Test
	void testGetArea() {
		double esperado = 31.5;
		geometria.setArea(esperado);
		double area = geometria.getArea();
		assertEquals(area, esperado);
	}

	@Test
	void testToString() {
		geometria.setArea(3.33);
		geometria.setNom("Cuadrado");
		geometria.setId(1);
		String esperado = "Geometria [id=1, nom=Cuadrado, area=3.33]";
		assertEquals(esperado, geometria.toString());
	}

}
