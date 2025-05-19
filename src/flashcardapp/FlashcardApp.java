package flashcardapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FlashcardApp {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Flashcard> cards = new ArrayList<>();
        HashMap<String, Flashcard> questionNumber = new HashMap<>();
        
        boolean stay = true;
        
        System.out.println("""
                               Welcome to your Study Buddy!
                               Press 1 to add your first question & answer!   
                               """);
        
        while(stay){
           
            int option = scanner.nextInt();
            scanner.nextLine();
            
            switch (option) {
                case 1 -> {
                    System.out.println("What's your question?");
                    String question = scanner.nextLine();
                    System.out.println("Now what's the answer?");
                    String answer = scanner.nextLine();
                    
                    cards.add(new Flashcard(question, answer));
                    for(int i = 0; i < cards.size(); i++){
                    // Assigns i + 1 into a String value, basically when i is 1, 
                    // it'll be "1" after. 
                     questionNumber.put(String.valueOf(i + 1), cards.get(i));
                    }
                }
                case 2 -> {
                    System.out.println("Here are your flashcards!");
                    for (int i = 0; i < cards.size(); i++) {
                        System.out.println(i + 1 +". " + cards.get(i));
                    }
                }
                case 3 -> {
                    
                }
            }
             System.out.println("""
                               What would you like to do now?
                               1. Add a Flashcard!
                               2. View Flashcards
                               """);
        
        }      
    }
}
