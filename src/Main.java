import java.util.*;
import java.util.Collections;

public class Main {
    /*
        card class
        arraylist (or linked list) for cards
        sort from greatest to least->suites are worth more
        hand creator
     */
    public static void main(String[] args) {
        LinkedList<Cards> cardsList = new LinkedList<>();

        createDeck(cardsList);
        for(int i = 0; i < 52; i++){
            Cards cards = cardsList.get(i);
            System.out.println(cards.num.getNum() + " of " + cards.suit.getSuit());
        }

        Collections.shuffle(cardsList);

        ArrayList<Cards> hand = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            hand.add(cardsList.pollLast());
        }
        Iterator<Cards> iterator = hand.iterator();
        System.out.println("**********This is your hand!**********");
        while (iterator.hasNext()){
            Cards cards = iterator.next();
            System.out.println(cards.num.getNum() + " of " + cards.suit.getSuit());
        }
        Collections.sort(hand);

        System.out.println("**********Sort by Suit**************");
        for(Cards card : hand){
            System.out.println(card.num.getNum() + " of " + card.suit.getSuit());
        }

        CustomComparator c = new CustomComparator();
        Collections.sort(hand, c);
        System.out.println("**********Sort by Num**************");
        for(Cards card : hand){
            System.out.println(card.num.getNum() + " of " + card.suit.getSuit());
        }

    }

    private static void createDeck(LinkedList<Cards> cardsList) {
        cardsList.add(new Cards(Num.ACE, Suites.SPADES));
        cardsList.add(new Cards(Num.KING, Suites.SPADES));
        cardsList.add(new Cards(Num.QUEEN, Suites.SPADES));
        cardsList.add(new Cards(Num.JACK, Suites.SPADES));
        cardsList.add(new Cards(Num.TEN, Suites.SPADES));
        cardsList.add(new Cards(Num.NINE, Suites.SPADES));
        cardsList.add(new Cards(Num.EIGHT, Suites.SPADES));
        cardsList.add(new Cards(Num.SEVEN, Suites.SPADES));
        cardsList.add(new Cards(Num.SIX, Suites.SPADES));
        cardsList.add(new Cards(Num.FIVE, Suites.SPADES));
        cardsList.add(new Cards(Num.FOUR, Suites.SPADES));
        cardsList.add(new Cards(Num.THREE, Suites.SPADES));
        cardsList.add(new Cards(Num.TWO, Suites.SPADES));
        cardsList.add(new Cards(Num.ACE, Suites.HEARTS));
        cardsList.add(new Cards(Num.KING, Suites.HEARTS));
        cardsList.add(new Cards(Num.QUEEN, Suites.HEARTS));
        cardsList.add(new Cards(Num.JACK, Suites.HEARTS));
        cardsList.add(new Cards(Num.TEN, Suites.HEARTS));
        cardsList.add(new Cards(Num.NINE, Suites.HEARTS));
        cardsList.add(new Cards(Num.EIGHT, Suites.HEARTS));
        cardsList.add(new Cards(Num.SEVEN, Suites.HEARTS));
        cardsList.add(new Cards(Num.SIX, Suites.HEARTS));
        cardsList.add(new Cards(Num.FIVE, Suites.HEARTS));
        cardsList.add(new Cards(Num.FOUR, Suites.HEARTS));
        cardsList.add(new Cards(Num.THREE, Suites.HEARTS));
        cardsList.add(new Cards(Num.TWO, Suites.HEARTS));
        cardsList.add(new Cards(Num.ACE, Suites.CLOVERS));
        cardsList.add(new Cards(Num.KING, Suites.CLOVERS));
        cardsList.add(new Cards(Num.QUEEN, Suites.CLOVERS));
        cardsList.add(new Cards(Num.JACK, Suites.CLOVERS));
        cardsList.add(new Cards(Num.TEN, Suites.CLOVERS));
        cardsList.add(new Cards(Num.NINE, Suites.CLOVERS));
        cardsList.add(new Cards(Num.EIGHT, Suites.CLOVERS));
        cardsList.add(new Cards(Num.SEVEN, Suites.CLOVERS));
        cardsList.add(new Cards(Num.SIX, Suites.CLOVERS));
        cardsList.add(new Cards(Num.FIVE, Suites.CLOVERS));
        cardsList.add(new Cards(Num.FOUR, Suites.CLOVERS));
        cardsList.add(new Cards(Num.THREE, Suites.CLOVERS));
        cardsList.add(new Cards(Num.TWO, Suites.CLOVERS));
        cardsList.add(new Cards(Num.ACE, Suites.DIAMONDS));
        cardsList.add(new Cards(Num.KING, Suites.DIAMONDS));
        cardsList.add(new Cards(Num.QUEEN, Suites.DIAMONDS));
        cardsList.add(new Cards(Num.JACK, Suites.DIAMONDS));
        cardsList.add(new Cards(Num.TEN, Suites.DIAMONDS));
        cardsList.add(new Cards(Num.NINE, Suites.DIAMONDS));
        cardsList.add(new Cards(Num.EIGHT, Suites.DIAMONDS));
        cardsList.add(new Cards(Num.SEVEN, Suites.DIAMONDS));
        cardsList.add(new Cards(Num.SIX, Suites.DIAMONDS));
        cardsList.add(new Cards(Num.FIVE, Suites.DIAMONDS));
        cardsList.add(new Cards(Num.FOUR, Suites.DIAMONDS));
        cardsList.add(new Cards(Num.THREE, Suites.DIAMONDS));
        cardsList.add(new Cards(Num.TWO, Suites.DIAMONDS));
    }
}
