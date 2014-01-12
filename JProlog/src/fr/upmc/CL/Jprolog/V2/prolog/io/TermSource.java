package fr.upmc.CL.Jprolog.V2.prolog.io;

import fr.upmc.CL.Jprolog.V2.prolog.terms.Const;
import fr.upmc.CL.Jprolog.V2.prolog.terms.Fun;
import fr.upmc.CL.Jprolog.V2.prolog.terms.Nonvar;
import fr.upmc.CL.Jprolog.V2.prolog.terms.Prog;
import fr.upmc.CL.Jprolog.V2.prolog.terms.Source;
import fr.upmc.CL.Jprolog.V2.prolog.terms.Term;

/**
 * Maps a Term to an Source for iterating over its arguments
 * @author Ibtissam
 */
public class TermSource extends Source {
  public TermSource(Nonvar val,Prog p){
    super(p);
    this.val=val;
    pos=0;
  }
  
  private Nonvar val;
  
  private int pos;
  
  public Term getElement() {
    Term X;
    if(null==val)
      X=null;
    else if(!(val instanceof Fun)) {
      X=val;
      val=null;
    } else if(0==pos)
      X=new Const(val.name());
    else if(pos<=((Fun)val).getArity())
      X=((Fun)val).getArg(pos-1);
    else {
      X=null;
      val=null;
    }
    pos++;
    return X;
  }
  
  public void stop() {
    val=null;
  }
}
