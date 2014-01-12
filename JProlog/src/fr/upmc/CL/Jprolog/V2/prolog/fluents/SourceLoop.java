package fr.upmc.CL.Jprolog.V2.prolog.fluents;

import java.util.ArrayList;

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
  An Infinite Source.
  If based on a finite Source, it moves to its the first element after reaching its last element.
  A SourceLoop returns 'no' if the original Source is empty. 
  In case the original Source is infinite, a SourceLoop will 
  return the same elements as the original Source. 
  (In particular, this happens if the original Source is also a Source loop).
*/
public class SourceLoop extends Source {
  private ArrayList v;
  
  Source s;
  
  private int i;
  
  public SourceLoop(Source s,Prog p){
    super(p);
    this.s=s;
    this.v=new ArrayList();
    this.i=0;
  }
  
  private final Term getMemoized() {
    if(null==v||v.size()<=0)
      return null;
    Term T=(Term)v.get(i);
    i=(i+1)%v.size();
    return T;
  }
  
  public Term getElement() {
    Term T=null;
    if(null!=s) { // s is alive
      T=s.getElement();
      if(null!=T)
        v.add(T);
      else {
        s=null;
      }
    }
    if(null==s)
      T=getMemoized();
    return T;
  }
  
  public void stop() {
    v=null;
    s=null;
  }
}
