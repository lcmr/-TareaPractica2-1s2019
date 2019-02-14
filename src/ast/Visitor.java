package ast;

/**
 * @author luis
 * Esta interfaz se encarga de visitar cada una de las clases
 */
public interface Visitor{
	int visit(Numero numero);
	int visit(Aritmetica aritmetica);
}
