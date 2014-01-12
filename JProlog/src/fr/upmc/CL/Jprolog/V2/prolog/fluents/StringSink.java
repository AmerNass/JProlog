package fr.upmc.CL.Jprolog.V2.prolog.fluents;

import fr.upmc.CL.Jprolog.V2.prolog.terms.Const;
import fr.upmc.CL.Jprolog.V2.prolog.terms.Prog;
import fr.upmc.CL.Jprolog.V2.prolog.terms.Sink;
import fr.upmc.CL.Jprolog.V2.prolog.terms.Term;

/**
  Builds  Fluents from Java
  Streams
  @author Amer
*/
public class StringSink extends Sink {
  protected StringBuffer buffer;
  
  public StringSink(Prog p){
    super(p);
    this.buffer=new StringBuffer();
  }
  
  public int putElement(Term t) {
    buffer.append(t.toUnquoted());
    return 1;
  }
  
  public void stop() {
    buffer=null;
  }
  
  public Term collect() {
    return new Const(buffer.toString());
  }
}
