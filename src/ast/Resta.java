package ast;

/**
 * @author luis
 * Clase Suma, que visita el VisitorImplement y devuelve la suma de sus operadores
 */
public class Resta extends Expresion implements Nodo {
	
	
	public Resta(Nodo operadorIzq, Nodo operadorDer) {
		super(operadorIzq, operadorDer, TipoOperacion.RESTA);
		// TODO Auto-generated constructor stub
	}


	@Override
	public int accept(Visitor v) {
		// TODO Auto-generated method stub
		return v.visit(this);
	}

}
