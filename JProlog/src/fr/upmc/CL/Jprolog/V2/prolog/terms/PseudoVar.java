package fr.upmc.CL.Jprolog.V2.prolog.terms;


/**
  Special constants, used to Name variables
  @see Term
  @see Var
  @author Amer, Ibtissam
*/
class PseudoVar extends Const {
  PseudoVar(int i){
    super("V_"+i);
  }
  
  PseudoVar(String s){
    super(s);
  }
  
  public String toString() {
    return name();
  }
}
