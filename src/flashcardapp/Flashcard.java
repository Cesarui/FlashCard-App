package flashcardapp;

public class Flashcard {
    // Flashcard Class, for more organization!
    
    private String question;
    private String answer;
    
    public Flashcard(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }
    
    /* Getters and Setters represent encapsulation,
       encapsulation is a principle to hide internal data...
       and only letting code interact with it through controlled methods
    
       Right now question and answer are private so nothing can mess with it
       But you can safely modify its value with getters and setters!
    */
    
    public String getAnswer(){
        
        return answer;
    }
    
    public void setAnswer(String answer){
        
        this.answer = answer;
    }
    
    public String getQuestion(){
        
        return question;
    }
    
    public void setQuestion(String question) {
        
        this.question = question;
    }
    
    @Override
    public String toString(){
        return "Q: " + question + " | A: " + answer;
    }
}
