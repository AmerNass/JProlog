package fr.upmc.CL.Jprolog.V2.prolog.fluents;

import java.util.ArrayList;

import fr.upmc.CL.Jprolog.V2.prolog.terms.Prog;
import fr.upmc.CL.Jprolog.V2.prolog.terms.Sink;
import fr.upmc.CL.Jprolog.V2.prolog.terms.Term;

/**
  Builds  Fluents from Java
  Streams
  @author Ibtissam
*/
public class TermCollector extends Sink {
  protected ArrayList buffer;
  
  private Prog p;
  
  public TermCollector(Prog p){
    super(p);
    this.p=p;
    this.buffer=new ArrayList();
  }
  
  public int putElement(Term T) {
    buffer.add(T);
    return 1;
  }
  
  public void stop() {
    buffer=null;
  }
  
  public Term collect() {
    return new JavaSource(buffer,p);
  }
}
