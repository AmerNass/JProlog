package fr.upmc.CL.Jprolog.unification;

import uk.ac.ucl.cs.programming.coursework.unification.UnificationStrategy;


public class RobinsonUnificationStrategyTest extends AbstractUnificationStrategyTest {

    // ------------------------------------------ Template methods

    @Override
    protected UnificationStrategy createUnificationStrategy() {
        return new RobinsonUnificationStrategy();
    }

}
