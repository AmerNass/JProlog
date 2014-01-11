package fr.upmc.CL.Jprolog.V2.prolog.fluents;

import java.util.HashMap;

/*
 * <b>UPMC student project : "CL - Conception des langages"</b>
 * <p>This Class is part of a student project at the Pierre and Marie Curie University (UPMC).</p>
 * <p>This is an open source project : feel free to use, share, and extend this Prolog interpreter.</p>
 * 
 * @author Amer Nasser, Ibtissam Tariqui, Alexis Deluze
 * @version 2.0
 */

/**
 General purpose dictionary
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
