package ast;

public abstract class Expresion  {
	
	protected Nodo _izq, _der;
	
	protected final TipoOperacion _tipo;
	
	public Expresion(Nodo _izq, Nodo _der, TipoOperacion _tipo) {
		this._izq = _izq;
		this._der = _der;
		this._tipo = _tipo;
	}

	public enum TipoOperacion {
		SUMA,
		RESTA,
		MULTIPLICACION,
		DIVISION
	}
}
