package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.hamcrest.core.IsInstanceOf;
import org.junit.jupiter.api.*;

import JUnit.Junit09_Geometria.dto.Geometria;


class GeometriaTest {
	
	Geometria g;

	@BeforeEach //Se instanciará um objeto Geometria antes de cada test
	public void testBefore() {
		g = new Geometria();
		assertTrue(g instanceof Geometria);
		assertEquals("Default", g.getNom());
	}
	
	@Test
	public void testConstructorParam() {
		System.out.println("testConstructorParam()");
		g = new Geometria(1);
		assertEquals(1, g.getId());
		assertTrue(g.getNom().equals("cuadrado"));
	}
	
	@Test
	public void testAreaCuadrado() {
		System.out.println("testAreaCuadrado()");
		int esperado = 16;
		int resultado = g.areacuadrado(4);
		assertEquals(esperado, resultado);
	}
	@Test
	public void testAreaCirculo() {
		System.out.println("testAreaCirculo()");
		double esperado = 28.27;
		double resultado = g.areaCirculo(3);
		double delta = 0.01;
		assertEquals(esperado, resultado, delta);
	}
	
	@Test
	public void testAreaTriangulo() {
		System.out.println("testAreaTriangulo()");
		int esperado = 8;
		int resultado = g.areatriangulo(4,4);
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testAreaRectangulo() {
		System.out.println("testAreaRectangulo()");
		int esperado = 20;
		int resultado = g.arearectangulo(4,5);
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testAreaPentagono() {
		System.out.println("testAreaPentagono()");
		int esperado = 8;
		int resultado = g.areapentagono(4,4);
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testAreaRombo() {
		System.out.println("testAreaRombo()");
		int esperado = 8;
		int resultado = g.arearombo(4,4);
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testarearomboide() {
		System.out.println("testAreaRomboide()");
		int esperado = 16;
		int resultado = g.arearomboide(4,4);
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testAreaTrapecio() {
		System.out.println("testareatrapecio()");
		int esperado = 8;
		int resultado = g.areatrapecio(4,4,2);
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testFiCode() {
		System.out.println("testFiguaCode");
		g = new Geometria(1);
		assertEquals("cuadrado", g.getNom());
		g = new Geometria(2);
		assertEquals("Circulo", g.getNom());
		g = new Geometria(3);
		assertEquals("Triangulo", g.getNom());
		g = new Geometria(4);
		assertEquals("Rectangulo", g.getNom());
		g = new Geometria(5);
		assertEquals("Pentagono", g.getNom());
		g = new Geometria(6);
		assertEquals("Rombo", g.getNom());
		g = new Geometria(7);
		assertEquals("Romboide", g.getNom());
		g = new Geometria(8);
		assertEquals("Trapecio", g.getNom());
		g = new Geometria(-1);
		assertEquals("Default", g.getNom());
	}
	
	@Test
	public void testSetId() {
		System.out.println("testSetId");
		g.setId(4);
		assertEquals(4, g.getId());
	}
	
	@Test
	public void testSetNom() {
		System.out.println("testSetNom");
		assertEquals("Default", g.getNom());
		g.setNom("cuadrado");
		assertEquals("cuadrado", g.getNom());
	}
	@Test
	public void testSetGetArea() {
		g = new Geometria(1);
		g.setArea(g.areacuadrado(4));
		double esperado = 16.0;
		assertEquals(esperado, g.getArea(), 0);
	}
	
	@Test
	public void testToString() {
		g.setArea(10);
		String esperado = "Geometria [id=9, nom=Default, area=10.0]";
		assertTrue(g.toString().equals(esperado));
	}
	

	
	

}
