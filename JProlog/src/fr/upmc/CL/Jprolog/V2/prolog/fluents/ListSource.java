package fr.upmc.CL.Jprolog.V2.prolog.fluents;

import prolog.terms.Const;
import prolog.terms.Copier;
import prolog.terms.Prog;

/**
  Builds an iterator from a list
  @author Amer, Ibtissam
*/
public class ListSource extends JavaSource {
  public ListSource(Const Xs,Prog p){
    super(Copier.ConsToVector(Xs),p);
  }
}
