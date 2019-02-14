package ast;

import ast.Expresion.TipoOperacion;

/**
 * @author luis
 * Clase Multiplicacion, que visita el VisitorImplement y devuelve la multiplicacion de sus operadores
 */
public class Multiplicacion extends Aritmetica{
	
	Nodo operadorIzq, operadorDer;
	
	public Multiplicacion(Nodo _izq, Nodo _der) {
		super(_izq, _der, TipoOperacion.MULTIPLICACION);
		// TODO Auto-generated constructor stub
	}

}
