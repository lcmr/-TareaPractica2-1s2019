package ast;

import ast.Expresion.TipoOperacion;

/**
 * @author luis
 * Clase Multiplicacion, que visita el VisitorImplement y devuelve la multiplicacion de sus operadores
 */
public class Division extends Aritmetica{
	
	Nodo operadorIzq, operadorDer;
	
	public Division(Nodo _izq, Nodo _der) {
		super(_izq, _der, TipoOperacion.DIVISION);
		// TODO Auto-generated constructor stub
	}

}
