package fr.upmc.CL.Jprolog.V2.prolog;

import fr.upmc.CL.Jprolog.V2.prolog.builtins.Builtins;

/*
 * <b>UPMC student project : "CL - Conception des langages"</b>
 * <p>This Class is part of a student project at the Pierre and Marie Curie University (UPMC).</p>
 * <p>This is an open source project : feel free to use, share, and extend this Prolog interpreter.</p>
 * 
 * @author Amer Nasser, Ibtissam Tariqui, Alexis Deluze
 * @version 2.0
 */

/**
   Minimal command line only Prolog main entry point
*/
public class Main {
  public static int init() {
    if(!Init.startProlog())
      return 0;
    Init.builtinDict=new Builtins();
    Init.askProlog("reconsult('"+Init.default_lib+"')");
    return 1;
  }
  
  public static void main(String args[]) {
    if(0==init())
      return;
    if(!Init.run(args))
      return;
    Init.standardTop(); // interactive
  }
}
