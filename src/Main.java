import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    /*
        card class
        arraylist (or linked list) for cards
        sort from greatest to least->suites are worth more
        hand creator
     */
    public static void main(String[] args) {
        ArrayList<Cards> cardsList = new ArrayList<>();
        for(int i = 0; i < 52; i++){
            cardsList.add((Math.random() * 10 + 1), Suites);
        }
        Iterator<Cards> iterator = cardsList.iterator();
        while (iterator.hasNext()){
            Cards cards = iterator.next();
            System.out.println(cards);
        }
    }
}
