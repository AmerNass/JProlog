package fr.upmc.CL.Jprolog.V2.prolog.terms;


/**
  Always succeeds
  @author Amer, Ibtissam
*/
class true_ extends ConstBuiltin {
  true_(){
    super("true");
  }
  
  public int exec(Prog p) {
    return 1;
  }
}
