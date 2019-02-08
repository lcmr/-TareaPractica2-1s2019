package ast;

/**
 * @author luis
 * clase VisitorImplement, esta implementa los metodos visit definidos en nuestra interfaz Visitor
 */
public class VisitorImplement implements Visitor {


	/**
	 * @param numero	Instancia de la Clase numero
	 * 
	 * esta devuelve el valor definido.
	 */
	@Override
	public int visit(Numero numero) {
		// TODO Auto-generated method stub
		return numero.getValor();
	}

	/**
	 * @param suma	Instancia de la Clase Suma
	 * 
	 * esta devuelve el valor suma de sus dos operadores,
	 * ejecuta el operadorIzq y el operadorDer, hasta llegar a Numero y asi opera su valor
	 */
	@Override
	public int visit(Suma suma) {
		// TODO Auto-generated method stub
		return suma.operadorIzq.accept(this) + suma.operadorDer.accept(this);
	}

	/**
	 * @param multiplicacion	Instancia de la Clase Multiplicacion
	 * 
	 * esta devuelve el valor multiplicacion de sus dos operadores,
	 * ejecuta el operadorIzq y el operadorDer, hasta llegar a Numero y asi opera su valor
	 */
	@Override
	public int visit(Multiplicacion multiplicacion) {
		// TODO Auto-generated method stub
		return multiplicacion.operadorIzq.accept(this) * multiplicacion.operadorDer.accept(this);
	}

}
