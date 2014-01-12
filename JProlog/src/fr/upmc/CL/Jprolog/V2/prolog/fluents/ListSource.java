package fr.upmc.CL.Jprolog.V2.prolog.fluents;

import fr.upmc.CL.Jprolog.V2.prolog.terms.Const;
import fr.upmc.CL.Jprolog.V2.prolog.terms.Copier;
import fr.upmc.CL.Jprolog.V2.prolog.terms.Prog;

/*
 * <b>UPMC student project : "CL - Conception des langages"</b>
 * <p>This Class is part of a student project at the Pierre and Marie Curie University (UPMC).</p>
 * <p>This is an open source project : feel free to use, share, and extend this Prolog interpreter.</p>
 * 
 * @author Amer Nasser, Ibtissam Tariqui, Alexis Deluze
 * @version 2.0
 */

/**
  Builds an iterator from a list
*/
public class ListSource extends JavaSource {
  public ListSource(Const Xs,Prog p){
    super(Copier.ConsToVector(Xs),p);
  }
}
