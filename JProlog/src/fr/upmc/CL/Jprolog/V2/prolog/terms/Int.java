package fr.upmc.CL.Jprolog.V2.prolog.terms;
/*
 * <b>UPMC student project : "CL - Conception des langages"</b>
 * <p>This Class is part of a student project at the Pierre and Marie Curie University (UPMC).</p>
 * <p>This is an open source project : feel free to use, share, and extend this Prolog interpreter.</p>
 * 
 * @author Amer Nasser, Ibtissam Tariqui, Alexis Deluze
 * @version 2.0
 */
public class Int extends Num {
  public Int(long i){
    val=i;
  }
  
  long val;
  
  public String name() {
    return ""+val;
  }
  
  boolean bind_to(Term that,Trail trail) {
    return super.bind_to(that,trail)&&((double)val==(double)((Int)that).val);
    // unbelievable but true: converting
    // to double is the only way to convince
    // Microsoft's jview that 1==1
    // $$ casting to double to be removed
    // once they get it right
  }
  
  public final int getArity() {
    return Term.INT;
  }
  
  public final long longValue() {
    return val;
  }
  
  public final int intValue() {
    return (int)val;
  }
  
  public final double getValue() {
    return val;
  }
}
