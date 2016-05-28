
public class SimuladorGeometrico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PUNTO p= new PUNTO (5,8);
		double x = p.getX();
		
		p.imprimir();

		Circulo  c = new Circulo(p, 5);
		c.imprimirCirculo();
	
	}


}
