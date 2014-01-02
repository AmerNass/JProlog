package fr.upmc.CL.Jprolog.terms;

import uk.ac.ucl.cs.programming.coursework.terms.Term;

public class PrologList implements Term{

	private Term head;
	private PrologList tail;

	public PrologList(Term head, PrologList tail)
	{
		this.head = head;
		this.tail = tail;
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

	@Override
	public boolean occurs(Term term) {
		if(tail == null)
		{
			return false;
		}
		else{
			if (head.equals(term)) 
			{
				return true;
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
