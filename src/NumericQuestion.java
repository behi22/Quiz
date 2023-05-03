
/**
 *         A class that creates Numeric Questions inherited from Question.
 *         @author bbabai00
 */
public class NumericQuestion extends Question {
	private double tolerance;
	
	/**
	 * constructor for making Numeric questions
	 * @param q: a string that contains the question
	 * @param a: a string that contains the answer
	 * @param tol: a double number that contains the tolerance
	 * @param diff: an integer that contains the difficulty level
	 * @author bbabai00
	 */
	public NumericQuestion(String q, String a, double tol, int diff) {
		super(q, a, diff);
		this.tolerance = tol;
	}
	
	/**
	 * A function that returns true if the attempted 
	 * answer is the correct answer for the current question
	 * while taking the tolerance into account.
	 * @param a: the Attempted Answer for the question
	 * @return true or false
	 * @author bbabai00
	 */
	public boolean isCorrect(String a) {
		if(Double.parseDouble(a) <= (Double.parseDouble(super.getAnswer()) + tolerance) && Double.parseDouble(a) >= (Double.parseDouble(super.getAnswer()) - tolerance)) {
			return true;
		}
		return false;
	}
}