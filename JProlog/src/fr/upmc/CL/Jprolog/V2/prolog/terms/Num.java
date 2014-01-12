package fr.upmc.CL.Jprolog.V2.prolog.terms;


/**
  Abstract numeric class, part of the Term hierarchy
  @see Int
  @see Real
  @see Term
  @author Ibtissam
*/
public abstract class Num extends Nonvar {
 
  public String toString() {
    return name();
  }

  abstract public double getValue();
}