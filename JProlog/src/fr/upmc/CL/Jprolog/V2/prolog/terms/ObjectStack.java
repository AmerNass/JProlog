package fr.upmc.CL.Jprolog.V2.prolog.terms;

import java.util.ArrayList;
/**
 * 
 * @author Alexis
 *
 */

public class ObjectStack extends ArrayList {
  public final void push(Object x) {
    add(x);
  }
  
  public final Object pop() {
    return remove(size()-1);
  }
}
