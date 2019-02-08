package ast;

/**
 * @author luis
 * Clase Multiplicacion, que visita el VisitorImplement y devuelve la multiplicacion de sus operadores
 */
public class Multiplicacion implements Nodo {
	
	Nodo operadorIzq, operadorDer;
	
	public Multiplicacion(Nodo operadorIzq, Nodo operadorDer) {
		this.operadorIzq = operadorIzq;
		this.operadorDer = operadorDer;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int accept(Visitor v) {
		// TODO Auto-generated method stub
		return v.visit(this);
	}

}
