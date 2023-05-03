
/**
 *         A class that creates Fill In Questions inherited from Question.
 *         @author bbabai00
 */
public class FillInQuestion extends Question {
	/**
	 * constructor for making fill in questions
	 * @param str: a string that contains the question and the answer
	 * @param diff: an integer that contains the difficulty level
	 * @author bbabai00
	 */
	public FillInQuestion(String str, int diff) {
		super("", "", diff);
		String question = "";
		int start = 0, end = 0;
		boolean found = false;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '_' && !found) {
				start = i;
				found = true;
			} else if(str.charAt(i) == '_' && found) {
				end = i;
			}
		}
		for(int i = 0; i < str.length(); i++) {
			if(i < end && i > start) {
				question += "_";
			} else {
				question += str.charAt(i);
			}
		}
		super.setAnswer(str.substring(start + 1, end));
		super.setQuestion(question);
	}
}