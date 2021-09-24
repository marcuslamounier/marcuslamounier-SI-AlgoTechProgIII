public class AplicacaoInterface {

	public static void main(String[] args) {

		Figura f = new Circulo();
		Figura f2 = new Quadrado();
		Figura f3 = new TrianguloEquilatero();
		
		System.out.println( f.getArea( 10 ) );
		System.out.println( f2.getArea( 10 ) );
		System.out.println( f3.getArea( 10 ) );
	}

}
