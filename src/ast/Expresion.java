package ast;

public abstract class Expresion implements Nodo  {
	
	public Nodo _izq, _der;
	
	public final TipoOperacion _tipo;
	
	public Expresion(Nodo _izq, Nodo _der, TipoOperacion _tipo) {
		this._izq = _izq;
		this._der = _der;
		this._tipo = _tipo;
	}
	
	public Expresion(Nodo _izq,  TipoOperacion _tipo) {
		this._izq = _izq;
		this._tipo = _tipo;
	}

	public Expresion(Nodo _izq) {
		this._izq = _izq;
		this._tipo = TipoOperacion.ERROR;
	}
	public enum TipoOperacion {
		SUMA,
		RESTA,
		MULTIPLICACION,
		DIVISION,
		NEGATIVO,
		ERROR,
	}

}
