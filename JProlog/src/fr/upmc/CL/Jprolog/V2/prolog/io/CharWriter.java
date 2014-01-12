package fr.upmc.CL.Jprolog.V2.prolog.io;

import java.io.IOException;
import java.io.Writer;

import fr.upmc.CL.Jprolog.V2.prolog.terms.Int;
import fr.upmc.CL.Jprolog.V2.prolog.terms.Prog;
import fr.upmc.CL.Jprolog.V2.prolog.terms.Sink;
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
  Writer
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
