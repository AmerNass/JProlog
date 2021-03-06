package fr.upmc.CL.Jprolog.V2.prolog.io;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import fr.upmc.CL.Jprolog.V2.prolog.terms.Const;
import fr.upmc.CL.Jprolog.V2.prolog.terms.Int;
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
  Builds  Fluents from Java Streams
*/
public class CharReader extends Source {
  public Reader reader;
  
  public CharReader(Reader reader,Prog p){
    super(p);
    this.reader=reader;
  }
  
  public CharReader(String f,Prog p){
    super(p);
    makeReader(f);
  }
  
  public CharReader(Term t,Prog p){
    super(p);
    this.reader=new StringReader(t.toUnquoted());
  }
  
  public CharReader(Prog p){
    this(IO.input,p);
  }
  
  protected void makeReader(String f) {
    this.reader=IO.url_or_file(f);
  }
  
  public Term getElement() {
    if(IO.input==reader) {
      String s=IO.promptln(">:");
      if(null==s||s.length()==0)
        return null;
      return new Const(s);
    }
    
    if(null==reader)
      return null;
    int c=-1;
    try {
      c=reader.read();
    } catch(IOException e) {
    }
    if(-1==c) {
      stop();
      return null;
    } else
      return new Int(c);
  }
  
  public void stop() {
    if(null!=reader&&IO.input!=reader) {
      try {
        reader.close();
      } catch(IOException e) {
      }
      reader=null;
    }
  }
}
