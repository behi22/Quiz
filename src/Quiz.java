import java.util.*;

/**
 *         A class that uses the Question class to create Quiz objects.
 *         @author bbabai00
 */
public class Quiz {
	Scanner in = new Scanner(System.in);
	static int total = 0;
	private ArrayList<Question> questions;
	private int total_q, attempt;

	/**
	 * constructor for making quizzes
	 * @author bbabai00
	 */
	public Quiz() {
		setQuestions();
		this.total_q = 0;
		this.attempt = 0;
		total++;
	}
	
	/**
	 * A setter for making new array list of questions
	 * @author bbabai00
	 */
	public void setQuestions() {
		this.questions = new ArrayList<Question>(25); 
	}
	
	/**
	 * A function that adds a question to our quiz
	 * @author bbabai00
	 */
	public void add(Question q) {
		if(q != null && total_q <= 25) {
			questions.add(q);
			total_q++;
		}
	}
	
	/**
	 * A function that prints out how many quizzes we have to do. 
	 * @author bbabai00
	 */
	public void getNumOfQuiz() {
		System.out.println("You have " + total + " quizzes to do");
	}
	
	/**
	 * A function that presents each question, and its difficulty,
	 * in turn to the user, accepts an answer for each one,
	 * and keeps track of the results. 
	 * @author bbabai00
	 */
	public void giveQuiz() {
		int counter = 0;
		attempt = 0;
		for(Question i: questions) {
			System.out.println(i.display());
			String ans = in.nextLine();
			if(i.isCorrect(ans)) {
				attempt++;
				System.out.println("Correct!");
			} else {
				System.out.println("InCorrect!");
			}
			counter++;
		}
		System.out.println("Your Score is: " + attempt + " out of " + counter);
	}
	
	/**
	 * A overloaded function that presents each question, and its difficulty,
	 * in turn to the user, accepts an answer for each one,
	 * and keeps track of the results. 
	 * @param min: minimum difficulty of the questions that will be added
	 * @param max: maximum difficulty of the questions that will be added
	 * @author bbabai00
	 */
	public void giveQuiz(int min, int max) {
		int counter = 0;
		attempt = 0;
		for(Question i: questions) {
			if(i.getDiff() <= max && i.getDiff() >= min) {
				System.out.println(i.display());
				String ans = in.nextLine();
				if(i.isCorrect(ans)) {
					attempt++;
					System.out.println("Correct!");
				} else {
					System.out.println("InCorrect!");
				}
				counter++;
			}
		}
		System.out.println("Your Score is: " + attempt + " out of " + counter);
	}
	
}