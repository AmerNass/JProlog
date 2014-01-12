package fr.upmc.CL.Jprolog.V2.prolog.fluents;

import fr.upmc.CL.Jprolog.V2.prolog.terms.Const;
import fr.upmc.CL.Jprolog.V2.prolog.terms.Copier;
import fr.upmc.CL.Jprolog.V2.prolog.terms.Prog;
import fr.upmc.CL.Jprolog.V2.prolog.terms.Source;
import fr.upmc.CL.Jprolog.V2.prolog.terms.Term;
/*
 * <b>UPMC student project : "CL - Conception des langages"</b>
 * <p>This Class is part of a student project at the Pierre and Marie Curie University (UPMC).</p>
 * <p>This is an open source project : feel free to use, share, and extend this Prolog interpreter.</p>
 * 
 * @author Amer Nasser, Ibtissam Tariqui, Alexis Deluze
 * @version 2.0
 */

/**
  Merges a List of Sources into a new Source which
  (fairly) iterates over them breadth first.
*/
public class SourceMerger extends JavaSource {
  public SourceMerger(Const Xs,Prog p){
    super(p);
    this.Q=new Queue(Copier.ConsToVector(Xs));
  }
  
  private Queue Q;
  
  public Term getElement() {
    if(null==Q)
      return null;
    while(!Q.isEmpty()) {
      Source current=(Source)Q.deq();
      if(null==current)
        continue;
      Term T=current.getElement();
      if(null==T)
        continue;
      Q.enq(current);
      return T;
    }
    return null;
  }
}
