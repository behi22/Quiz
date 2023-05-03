
/**
 *         A class that uses the Quiz class to create and test the Quiz.
 *         @author bbabai00
 */
public class QuizTime {
	/**
	 *         our main function that starts the quiz!
	 *         @author bbabai00
	 */
	public static void main(String[] args) {
		// sample quiz
		Quiz myQuiz = new Quiz();
		// sample controlled quiz
		Quiz ControlledQuiz = new Quiz();
		// normal questions
		Question q1 = new Question("enter 5", "5");
		Question q2 = new Question("enter 6", "6", 1);
		Question q3 = new Question("what color is pain?", "red", 10);
		Question q4 = new Question("what color is the sky?", "blue", 3);
		Question q5 = new Question("what is the capital of Iran?", "Tehran", 6);
		Question q6 = new Question("how many planets are there in the solar system?", "9", 4);
		Question q7 = new Question("what is the color of orange?", "orange", 2);
		// fill in questions
		FillInQuestion q8 = new FillInQuestion("Violets are _purple_", 1);
		FillInQuestion q9 = new FillInQuestion("Costa Rica is located in _central america_", 5);
		FillInQuestion q10 = new FillInQuestion("Java is _easy_", 10);
		// numeric questions
		NumericQuestion q11 = new NumericQuestion("17.2 - 15.1", "2.1", 0.00001, 2);
		NumericQuestion q12 = new NumericQuestion("1.232 - 1.1", "0.132", 0.00001, 6);
		NumericQuestion q13 = new NumericQuestion("1777.25 - 15.15", "1762.1", 0.00001, 9);
		// multiple choice questions
		MultiChoiceQuestion q14 = new MultiChoiceQuestion("what are the possible colors of ants?", 7);
		q14.addChoice("black", true);
		q14.addChoice("green", false);
		q14.addChoice("orange", false);
		q14.addChoice("red", true);
		MultiChoiceQuestion q15 = new MultiChoiceQuestion("which ones are cats?", 4);
		q15.addChoice("bulldog", false);
		q15.addChoice("lion", true);
		q15.addChoice("tiger", true);
		q15.addChoice("zebra", false);
		MultiChoiceQuestion q16 = new MultiChoiceQuestion("which ones are colors?", 3);
		q16.addChoice("black", true);
		q16.addChoice("green", true);
		q16.addChoice("piano", false);
		q16.addChoice("red", true);
		q16.addChoice("violin", false);
		q16.addChoice("orange", true);
		q16.addChoice("guitar", false);
		// adding to normal quiz
		myQuiz.add(q1);
		myQuiz.add(q2);
		myQuiz.add(q3);
		myQuiz.add(q4);
		myQuiz.add(q5);
		myQuiz.add(q6);
		myQuiz.add(q7);
		myQuiz.add(q8);
		myQuiz.add(q9);
		myQuiz.add(q10);
		myQuiz.add(q11);
		myQuiz.add(q12);
		myQuiz.add(q13);
		myQuiz.add(q14);
		myQuiz.add(q15);
		myQuiz.add(q16);
		// adding to controlled quiz
		ControlledQuiz.add(q1);
		ControlledQuiz.add(q2);
		ControlledQuiz.add(q3);
		ControlledQuiz.add(q4);
		ControlledQuiz.add(q5);
		ControlledQuiz.add(q6);
		ControlledQuiz.add(q7);
		ControlledQuiz.add(q8);
		ControlledQuiz.add(q9);
		ControlledQuiz.add(q10);
		ControlledQuiz.add(q11);
		ControlledQuiz.add(q12);
		ControlledQuiz.add(q13);
		ControlledQuiz.add(q14);
		ControlledQuiz.add(q15);
		ControlledQuiz.add(q16);
		// showing the total number of quizzes
		myQuiz.getNumOfQuiz();
		// taking the normal quiz
		myQuiz.giveQuiz();
		// taking the controlled quiz
		ControlledQuiz.giveQuiz(3,8);
	}
}