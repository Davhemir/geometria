import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import junit.framework.Assert;

public class Circulo_DHMTest {

	static final double PI = 3.1416;
	
	@Test
	public void testArea() {
		Circulo_DHM circulo = new Circulo_DHM(7, null);
		double resArea = Math.pow(7,2)*PI;
		Assert.assertEquals(circulo.area(),resArea);
		
		circulo = new Circulo_DHM(0, null);
		Assert.assertEquals(circulo.area(),0.0);
		
		circulo = new Circulo_DHM(-3, null);
		resArea = Math.pow(3,2)*PI;
		Assert.assertEquals(circulo.area(),resArea);
		
		
		
		
	}
	
	@Test
	public void testPerimetro() {
		Circulo_DHM circulo = new Circulo_DHM(7, null);
		double resPerimetro = 7*2*PI;
		Assert.assertEquals(circulo.perimetro(),resPerimetro);
		
		circulo = new Circulo_DHM(0, null);
		resPerimetro = 0;
		Assert.assertEquals(circulo.perimetro(),resPerimetro);
		
		circulo = new Circulo_DHM(-3, null);
		resPerimetro = 3*2*PI;
		Assert.assertEquals(circulo.perimetro(),resPerimetro);
	}


}
