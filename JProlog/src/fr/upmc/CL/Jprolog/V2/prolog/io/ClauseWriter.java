package fr.upmc.CL.Jprolog.V2.prolog.io;

import fr.upmc.CL.Jprolog.V2.prolog.terms.Const;
import fr.upmc.CL.Jprolog.V2.prolog.terms.Fun;
import fr.upmc.CL.Jprolog.V2.prolog.terms.Prog;
import fr.upmc.CL.Jprolog.V2.prolog.terms.Term;

/**
  Writer
  @author Ibtissam
*/
public class ClauseWriter extends CharWriter {
  public ClauseWriter(String f,Prog p){
    super(f,p);
  }
  
  public ClauseWriter(Prog p){
    super(p);
  }
  
  public int putElement(Term t) {
    if(null==writer)
      return 0;
    String s=null;
    if((t instanceof Fun)&&"$string".equals(((Fun)t).name())) {
      Const Xs=(Const)((Fun)t).getArg(0);
      s=Term.charsToString(Xs);
    } else
      s=t.pprint();
    IO.print(writer,s);
    return 1;
  }
}
