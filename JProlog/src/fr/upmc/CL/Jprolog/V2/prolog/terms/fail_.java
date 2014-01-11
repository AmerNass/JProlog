package fr.upmc.CL.Jprolog.V2.prolog.terms;
/*
 * <b>UPMC student project : "CL - Conception des langages"</b>
 * <p>This Class is part of a student project at the Pierre and Marie Curie University (UPMC).</p>
 * <p>This is an open source project : feel free to use, share, and extend this Prolog interpreter.</p>
 * 
 * @author Amer Nasser, Ibtissam Tariqui, Alexis Deluze
 * @version 2.0
 */

/**
* Always fails
*/
class fail_ extends ConstBuiltin {
  fail_() {super("fail");}

  public int exec(Prog p) {
    return 0;
  }
}