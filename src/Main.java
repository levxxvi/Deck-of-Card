import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Main {
    /*
        card class
        arraylist (or linked list) for cards
        sort from greatest to least->suites are worth more
        hand creator
     */
    public static void main(String[] args) {
        /*String randomNum = Num.getRandomNum();
        String randomSuit = Suites.getRandomSuit();

        ArrayList<Cards> cardsList = new ArrayList<>();
        for(int i = 0; i < 52; i++){
            cardsList.add(randomNum, randomSuit);
        }*/
        new Num num;

        Num randomNum = Num.getRandomNum();
        Suites randomSuit = Suites.getRandomSuit();

        ArrayList<Cards> cardsList = new ArrayList<>();
        for(int i = 0; i < 52; i++){
            cardsList.add(randomNum, randomSuit);
        }
        Iterator<Cards> iterator = cardsList.iterator();
        while (iterator.hasNext()){
            Cards cards = iterator.next();
            System.out.println(cards);
        }
    }
}
