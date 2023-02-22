/**
 * 
 * @author David Hernández
 * @version 1.2
 *
 */
public class Rectangulo_DHM extends FiguraGeometrica_DHM {
	private double l1;
	private double l2;
	
	/**
	 * Constructor de clase Rectangulo_DHM
	 * @param tipoFigura
	 * @param lG
	 * @param lP
	 */
	public Rectangulo_DHM(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}

	/**
	 * Devuelve el area
	 * @return area
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	
	/**
	 * Devuelve el perimetro
	 * @return perimetro
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
