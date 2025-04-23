package flashcardapp;

public class Flashcard {
    // Flashcard Class, for more organization!
    
    String question;
    String answer;
    
    public Flashcard(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }
    
    @Override
    public String toString(){
        return "Q: " + question + " | A: " + answer;
    }
}
