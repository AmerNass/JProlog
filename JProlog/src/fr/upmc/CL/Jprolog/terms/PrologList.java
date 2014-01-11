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
public class PrologList implements Term{

	private Term head;
	private PrologList tail;

	public PrologList(Term head, PrologList tail)
	{
		this.head = head;
		this.tail = tail;
	}

	public PrologList(String argument) {
		argument = argument.trim();
		if(argument.length() == 2)
		{
			head = null;
			tail = null;
		}
		else if(argument.contains("|"))
		{
			String[] headAndTail = argument.split("|");
			String h = headAndTail[0];
			String t = headAndTail[1];
			
			h = h.substring(1);
			t = t.substring(0,t.length() - 1);
			
		}
		
	}

	public Term getHead() {
		return head;
	}

	public void setHead(Term head) {
		this.head = head;
	}

	public PrologList getTail() {
		return tail;
	}

	public void setTail(PrologList tail) {
		this.tail = tail;
	}

	//a revoir
	@Override
	public boolean occurs(Term term) {

		if (head.equals(term)) 
		{
			return true;
		}
		else{
			if(tail == null)
			{
				return false;
			}
			else
				return occurs(tail);
		}
	}


	@Override
	public Term substitute(Term term, Term replacement) {

		if(tail == null)
		{
			return this;
		}
		else{

			if(term.equals(head))
			{
				head = replacement;
				return tail.substitute(term, replacement);
			}
			else
			{
				return tail.substitute(term, replacement);
			}
		}

	}


}
