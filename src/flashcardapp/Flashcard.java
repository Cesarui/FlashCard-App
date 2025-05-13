package flashcardapp;

public class Flashcard {
    // Flashcard Class, for more organization!
    
    String question;
    String answer;
    
    public Flashcard(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }
    
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
