package fr.upmc.CL.Jprolog.V2.prolog.fluents;

import prolog.terms.SystemObject;
/*
 * <b>UPMC student project : "CL - Conception des langages"</b>
 * <p>This Class is part of a student project at the Pierre and Marie Curie University (UPMC).</p>
 * <p>This is an open source project : feel free to use, share, and extend this Prolog interpreter.</p>
 * 
 * @author Amer Nasser, Ibtissam Tariqui, Alexis Deluze
 * @version 2.0
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