package ast;

import ast.Expresion.TipoOperacion;

/**
 * @author luis
 * Clase Suma, que visita el VisitorImplement y devuelve la suma de sus operadores
 */
public class Suma extends Aritmetica {
	
	public Suma(Nodo _izq, Nodo _der) {
		super(_izq, _der, TipoOperacion.SUMA);
		// TODO Auto-generated constructor stub
	}
}
