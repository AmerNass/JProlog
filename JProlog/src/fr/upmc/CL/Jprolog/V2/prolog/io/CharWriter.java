package fr.upmc.CL.Jprolog.V2.prolog.io;

import java.io.IOException;
import java.io.Writer;

import prolog.terms.Int;
import prolog.terms.Prog;
import prolog.terms.Sink;
import prolog.terms.Term;


/**
  Writer
  @author Ibtissam
*/
public class CharWriter extends Sink {
  protected Writer writer;
  
  public CharWriter(String f,Prog p){
    super(p);
    this.writer=IO.toFileWriter(f);
  }
  
  public CharWriter(Prog p){
    super(p);
    this.writer=IO.output;
  }
  
  public int putElement(Term t) {
    if(null==writer)
      return 0;
    try {
      char c=(char)((Int)t).intValue();
      writer.write(c);
    } catch(IOException e) {
      return 0;
    }
    return 1;
  }
  
  public void stop() {
    if(null!=writer&&IO.output!=writer) {
      try {
        writer.close();
      } catch(IOException e) {
      }
      writer=null;
    }
  }
}
