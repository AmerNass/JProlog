package fr.upmc.CL.Jprolog.V2.prolog.terms;

/**
  Special constant terminating a list
  @author Amer
*/
public class Nil extends Const {
  public Nil(String s){
    super(s);
  }
  
  public Nil(){
    this("[]");
  }
}
