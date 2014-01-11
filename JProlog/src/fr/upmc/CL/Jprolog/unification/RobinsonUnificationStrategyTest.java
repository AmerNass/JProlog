package fr.upmc.CL.Jprolog.unification;

import uk.ac.ucl.cs.programming.coursework.unification.UnificationStrategy;

/*
 * <b>UPMC student project : "CL - Conception des langages"</b>
 * <p>This Class is part of a student project at the Pierre and Marie Curie University (UPMC).</p>
 * <p>This is an open source project : feel free to use, share, and extend this Prolog interpreter.</p>
 * 
 * @author Amer Nasser, Ibtissam Tariqui, Alexis Deluze
 * @version 2.0
 */
public class RobinsonUnificationStrategyTest extends AbstractUnificationStrategyTest {

    // ------------------------------------------ Template methods

    @Override
    protected UnificationStrategy createUnificationStrategy() {
        return new RobinsonUnificationStrategy();
    }

}
