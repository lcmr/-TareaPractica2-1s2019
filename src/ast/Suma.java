package ast;

/**
 * @author luis
 * Clase Suma, que visita el VisitorImplement y devuelve la suma de sus operadores
 */
public class Suma implements Nodo {
	

	Nodo operadorIzq, operadorDer;
	
	public Suma(Nodo operadorIzq, Nodo operadorDer) {
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
