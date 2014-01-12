package fr.upmc.CL.Jprolog.V2.prolog.fluents;

import prolog.terms.Const;
import prolog.terms.Prog;
import prolog.terms.Sink;
import prolog.terms.Term;

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
