package fr.upmc.CL.Jprolog.V2.prolog.terms;


/**
* Template for builtins of arity 0
* @author Amer,
*/

abstract public class ConstBuiltin extends Const {
  
  public ConstBuiltin(String s){
    super(s);
  }
  
  abstract public int exec(Prog p);
  
  public boolean isBuiltin() {
    return true;
  }
}
