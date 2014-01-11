package fr.upmc.CL.Jprolog.V2.prolog.fluents;

import prolog.terms.SystemObject;


/**
 * 
 * @author Nasser, Alexis
 *
 */
public class JavaObject extends SystemObject {
  public JavaObject(Object i){
    // available=true;
    val=i;
  }
  
  Object val;
  
  public Object toObject() {
    return val;
  }
  
  /*
  private boolean available;

  synchronized public void suspend() {
    available=false;
    while(!available) {
      try {
        wait();
      }
      catch(InterruptedException e) {}
    }
  }

  synchronized public void resume() {
    available=true;
    notifyAll();
  }
  */
}