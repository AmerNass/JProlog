package fr.upmc.CL.Jprolog.V2.prolog.fluents;

import java.util.HashMap;

/**
 General purpose dictionary
 @author Alexis, Amer
*/
public class HashDict extends HashMap {
  public String name() {
    return getClass().getName()+hashCode();
  }
  
  public String stat() {
    return "BlackBoard: "+size();
  }
}
