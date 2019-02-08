/**
 * 
 */
package ast;

/**
 * @author luis
 * Interfaz que se encargara de ejecutar cada uno de los metodos dependiendo del visitor
 */
public interface Nodo {
	public int accept( Visitor v);
}
