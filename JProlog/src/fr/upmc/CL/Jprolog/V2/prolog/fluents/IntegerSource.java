package fr.upmc.CL.Jprolog.V2.prolog.fluents;

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
 * creates a source of integers based on x=a*x+b formula
 */
public class IntegerSource extends Source {
  
  public IntegerSource(long fuel,long a,long x,long b,Prog p){
    super(p);
    this.fuel=fuel;
    this.a=a;
    this.b=b;
    this.x=x;
  }
  
  private long fuel;
  
  private long a;
  
  private long b;
  
  private long x;
  
  public Term getElement() {
    if(fuel<=0)
      return null;
    Int R=new Int(x);
    x=a*x+b;
    --fuel;
    return R;
  }
  
  public void stop() {
    fuel=0;
  }
  
  public String toString() {
    return "{(x->"+a+"*x+"+b+")["+fuel+"]="+x+"}";
  }
  
}