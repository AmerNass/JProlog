package fr.upmc.CL.Jprolog.terms;

import uk.ac.ucl.cs.programming.coursework.terms.Term;

/*
 * <b>UPMC student project : "CL - Conception des langages"</b>
 * <p>This Class is part of a student project at the Pierre and Marie Curie University (UPMC).</p>
 * <p>This is an open source project : feel free to use, share, and extend this Prolog interpreter.</p>
 * 
 * @author Amer Nasser, Ibtissam Tariqui, Alexis Deluze
 * @version 2.0
 */
public class PrologPredicate implements Term{

	private EOperation operation;
	private Term left;
	private Term right;
	
	
	
	public PrologPredicate(EOperation operation, Term left, Term right) {
		super();
		this.operation = operation;
		this.left = left;
		this.right = right;
	}

	public EOperation getOperation() {
		return operation;
	}

	public void setOperation(EOperation operation) {
		this.operation = operation;
	}

	public Term getLeft() {
		return left;
	}

	public void setLeft(Term left) {
		this.left = left;
	}

	public Term getRight() {
		return right;
	}

	public void setRight(Term right) {
		this.right = right;
	}

	@Override
	public boolean occurs(Term term) {
		return this.left.occurs(term) || this.right.occurs(term);
	}

	@Override
	public Term substitute(Term term, Term replacement) {
		Term l = left.substitute(term, replacement);
		Term r = right.substitute(term, replacement);
		
		return new PrologPredicate(this.operation, l, r);
		
	}
	

}
