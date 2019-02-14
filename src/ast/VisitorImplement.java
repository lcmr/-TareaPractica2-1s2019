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

	@Override
	public int visit(Aritmetica _arit) {
		
		switch (_arit._tipo) {
		case RESTA:
			return _arit._izq.accept(this) - _arit._der.accept(this);	
		case SUMA:
			return _arit._izq.accept(this) + _arit._der.accept(this);	
		case MULTIPLICACION:
			return _arit._izq.accept(this) * _arit._der.accept(this);	
		case DIVISION:
			return _arit._izq.accept(this) / _arit._der.accept(this);		
		case NEGATIVO:
			return -( _arit._izq.accept(this));	
		default:
			return 0;
		}
		
	}
	
}
