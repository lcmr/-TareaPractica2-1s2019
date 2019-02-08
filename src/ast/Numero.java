package ast;

/**
 * @author luis
 * Clase Numero, que visita el VisitorImplement y devuelve su valor
 */
public class Numero implements Nodo {
	private int valor;
	
	public Numero(int valor) {
		this.valor = valor;
	}
	
	@Override
	public int accept(Visitor v) {
		// TODO Auto-generated method stub
		return v.visit(this);
	}
	public int getValor() {
		return valor;
	}

}
