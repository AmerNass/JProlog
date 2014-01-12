package fr.upmc.CL.Jprolog.V2.prolog.terms;

/**
 * 
 * @author Amer, Ibtissam
 *
 */

abstract public class Sink extends Fluent {
  
  public Sink(Prog p){
    super(p);
  }
  
  abstract public int putElement(Term T);
  
  public Term collect() {
    return null;
  }
}
