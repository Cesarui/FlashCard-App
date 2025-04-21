package flashcardapp;

import java.util.ArrayList;

public class FlashcardApp {

    public static void main(String[] args) {
        
        ArrayList<Flashcard> cards = new ArrayList<>();
        
        cards.add(new Flashcard("Can i bark", "no"));
        cards.add(new Flashcard("Is the sky blue" , "no"));
        
        for(int i = 0; i < cards.size(); i++){
            System.out.println(i + 1  + ". " + cards.get(i));
        }
    }
   
}
