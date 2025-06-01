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
                               WELCOME TO YOUR STUDY BUDDY!
                               ____________________________________________
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
                    
                    /*
                    cards.size gets assigned to index, makes sense because
                    the first card is 0 but the size is 1, so if you add String
                    "1" then get the card size which is 1 but minus 1,
                    that gets the card at index 0.
                    
                    for example: We add a card, index is 1 because size of cards
                    is 1, now that index value gets added as a String, which makes
                    the first card be key 1, then you get the card and add it since
                    card.get gets the number of cards.size - 1. Which is 0.
                    */
                    int index = cards.size();
                    questionNumber.put(String.valueOf(index), cards.get(cards.size() - 1));
                }
                case 2 -> {
                    System.out.println("Here are your flashcards!");
                    for (int i = 0; i < cards.size(); i++) {
                        System.out.println(i + 1 +". " + cards.get(i));
                    }
                }
                case 3 -> {
                    System.out.println("""
                                       How do you want to study?
                                       1. Quiz me on everything
                                       2. Choose a specific flashcard
                                       """);
                    int quizMode = scanner.nextInt();
                    scanner.nextLine();
                    
                    switch (quizMode) {
                        case 1 -> {
                            for (int i = 0; i < cards.size(); i++) {
                                System.out.println("-> " + cards.get(i).getQuestion() + "?");
                                String tempAnswer = scanner.nextLine();
                                
                                if (tempAnswer.equalsIgnoreCase(cards.get(i).getAnswer())) {
                                    System.out.println("""
                                                       CORRECTTT!!
                                                       
                                                       ____________________________________________
                                                       """);
                                }
                                else {
                                    System.out.println("Beeeeep, wrong answer :( ");
                                }
                            }
                        }
                    }
                }
            }
             System.out.println("""
                               \nWhat would you like to do now?
                               1. Add a Flashcard 
                               2. View Flashcards
                               3. Quiz Mode!
                               4. Exit
                               """);
        
        }      
    }
}
