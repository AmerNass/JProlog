package fr.upmc.CL.Jprolog.V2.prolog.terms;

/**
* Template for builtins of arity >0
* @author Alexis
*/

abstract public class FunBuiltin extends Fun {
  public FunBuiltin(String f,int i){
    super(f,i);
  }
  
  abstract public int exec(Prog p);
  
  public boolean isBuiltin() {
    return true;
  }
}
