package fr.upmc.CL.Jprolog.V2.prolog.terms;
/*
 * <b>UPMC student project : "CL - Conception des langages"</b>
 * <p>This Class is part of a student project at the Pierre and Marie Curie University (UPMC).</p>
 * <p>This is an open source project : feel free to use, share, and extend this Prolog interpreter.</p>
 * 
 * @author Amer Nasser, Ibtissam Tariqui, Alexis Deluze
 * @version 2.0
 */

/**
  List Constructor. Cooperates with terminator Nil.
  @see Nil
*/
public class Cons extends Fun {
  public Cons(String cons,Term x0,Term x1){
    super(cons,x0,x1);
  }
  
  public Cons(Term x0,Term x1){
    this(".",x0,x1);
  }
  
  public Term getHead() {
    return getArg(0);
  }
  
  public Term getTail() {
    return getArg(1);
  }
  
  /**
    List printer.
  */
  public String toString() {
    Term h=getArg(0);
    Term t=getArg(1);
    StringBuffer s=new StringBuffer("["+watchNull(h));
    for(;;) {
      if(t instanceof Nil) {
        s.append("]");
        break;
      } else if(t instanceof Cons) {
        h=((Cons)t).getArg(0);
        t=((Cons)t).getArg(1);
        s.append(","+watchNull(h));
      } else {
        s.append("|"+watchNull(t)+"]");
        break;
      }
    }
    return s.toString();
  }
}
