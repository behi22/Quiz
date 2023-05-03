import java.util.ArrayList;

/**
 *         A class that creates Multiple Choice Questions inherited from Question.
 *         @author bbabai00
 */
public class MultiChoiceQuestion extends Question {
	private ArrayList<String> choices = new ArrayList<String>();
	
	/**
	 * constructor for making Multiple Choice questions
	 * @param q: a string that contains the question
	 * @param diff: an integer that contains the difficulty level
	 * @author bbabai00
	 */
	public MultiChoiceQuestion(String q, int diff) {
		super(q, "", diff);
	}
	
	/**
	 * A function that displays the question for Multiple Choice questions
	 * @return the question
	 * @author bbabai00
	 */
	public String display() {
		int num = 1;
		String str = super.getQuestion() + "\n";
		for(String s: choices) {
			str += num + ". ";
			str += s + "\n";
			num++;
		}
		str += "Enter all correct choices. For example, if you think 1 and 2 are correct enter 12";
		return str;
	}
	
	/**
	 * A function that adds choices for the question.
	 * @param c: the choice for the question that could be correct or false
	 * @param f: the correctness of the Answer
	 * @author bbabai00
	 */
	public void addChoice(String c, boolean f) {
		if(c != null) {
			choices.add(c);
			if(f) {
				super.setAnswer(super.getAnswer() + (choices.indexOf(c) + 1));
			}
		}
	}
}