
/**
 *         A class that simulates short-answer style questions to be placed on a quiz.
 *         @author bbabai00
 */
public class Question {
	private String question, answer;
	private int difficulty;

	/**
	 * constructor for making questions
	 * @param q: a string that contains the question
	 * @param a: a string that contains the answer
	 * @param diff: an integer that contains the difficulty level
	 * @author bbabai00
	 */
	public Question(String q, String a, int diff) {
		this.setQuestion(q);
		this.setAnswer(a);
		this.setDiff(diff);
	}
	
	/**
	 * overloaded constructor for making questions that sets difficulty to default 1
	 * @param q: a string that contains the question
	 * @param a: a string that contains the answer
	 * @author bbabai00
	 */
	public Question(String q, String a) {
		this(q, a, 1);
	}
	
	/**
	 * A getter for question
	 * @return question: the question
	 * @author bbabai00
	 */
	public String getQuestion() {
		return this.question;
	}

	/**
	 * A setter for question
	 * @param q: the new question
	 * @author bbabai00
	 */
	public void setQuestion(String q) {
		if(q != null) {
			this.question = q;
		} else {
			this.question = "";
		}
	}
	
	/**
	 * A getter for answer
	 * @return answer: the answer
	 * @author bbabai00
	 */
	public String getAnswer() {
		return this.answer;
	}

	/**
	 * A setter for answer
	 * @param a: the new answer
	 * @author bbabai00
	 */
	public void setAnswer(String a) {
		if(a != null) {
			this.answer = a;
		} else {
			this.answer = "";
		}
	}
	
	/**
	 * A getter for the difficulty of questions
	 * @return difficulty: the difficulty of questions
	 * @author bbabai00
	 */
	public int getDiff() {
		return this.difficulty;
	}

	/**
	 * A setter for the difficulty of questions
	 * if the new difficulty isn't between 1 and 10 it would be assigned to the default 1
	 * @param diff: the new difficulty of questions
	 * @author bbabai00
	 */
	public void setDiff(int diff) {
		if(diff > 0 && diff < 11) {
			this.difficulty = diff;
		} else {
			this.difficulty = 1;
		}
	}
	
	/**
	 * the basic toString function for the Question Class
	 * @author bbabai00
	 */
	public String toString() {
		String result = "******* Question Summary *******";
		result += "\nQuestion: " + this.getQuestion();
		result += "\nAnswer: " + this.getAnswer();
		result += "\nDifficulty Level: " + this.getDiff();
		return result + "\n";
	}
	
	/**
	 * A function that returns true if the attempted 
	 * answer is the correct answer for the current question.
	 * @param attemptedAnswer: the Attempted Answer for the question
	 * @return true or false
	 * @author bbabai00
	 */
	public boolean isCorrect(String attemptedAnswer) {
		return (attemptedAnswer.toLowerCase().equals(getAnswer().toLowerCase()));
	}
	
	/**
	 * A function that returns a string containing the question and difficulty of
	 * the current question. 
	 * @return the question
	 * @author bbabai00
	 */
	public String display() {
		String result = "";
		result += this.getQuestion();
		result += "\t(Difficulty: " + this.getDiff() + ")";
		return result;
	}
}