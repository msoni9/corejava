package main.com.java.bridgepattern;

public interface Questions {

	public void nextQuestion();

	public void previousQuestion();

	public void newQuestion(String q);

	public void deleteQuestion(String q);

	public void displayQuestion();

	public void displayAllQuestions();
}
