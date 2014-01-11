package fr.upmc.CL.Jprolog.V2.prolog.fluents;

import java.util.HashMap;

/**
 General purpose dictionary
 @author Alexis, Amer
*/

@SuppressWarnings("rawtypes")
public class HashDict extends HashMap {
	private static final long serialVersionUID = 5484169170915765556L;

public String name() {
    return getClass().getName()+hashCode();
  }
  
  public String stat() {
    return "BlackBoard: "+size();
  }
}
