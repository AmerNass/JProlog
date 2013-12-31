package uk.ac.ucl.cs.programming.coursework.evaluation;

/**
 * first
 */
public abstract class EvaluationException extends Exception {

    public EvaluationException() {
        
    }

    public EvaluationException(String message) {
        super(message);
    }

    public EvaluationException(String message, Throwable cause) {
        super(message, cause);
    }

}
