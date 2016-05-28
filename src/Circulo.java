/**
 * esta clases crea un circulo atravez de un punto.
 * @author Usuario
 *
 */
public class Circulo {
	//Atributos/propiedades
	private double radio=1;
	public static final double pi = 3.1415926535;
	private PUNTO p;
	
	//constructor
	public  Circulo (PUNTO centro, double r) {
		p=centro;
		radio =r;
				
	}
	/**
	 * este metodo calcula el area del circulo
	 * @return
	 */
	public  double  calcularArea () {
		return pi * radio * radio;
	}
	/**
	 * este metodo calcula el perimetro del circulo
	 * @return
	 */
	public  double  calcularCircunferencia () {
		return 2 * pi * radio;
	}
	public void imprimirCirculo (){
		String salida = " el circulo tiene radio " + this.radio + "centro en el punto " + p.getX() + " , " + p.getY() ;
		salida = "El Area del circulo es:  " + calcularArea() + "el perimetro de la circuferencia es:" + calcularCircunferencia();
	    System.out.println(salida); 
	}
}
