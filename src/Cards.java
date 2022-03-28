import java.util.ArrayList;

public class Cards {
    int num;
    Suites suit;

    public Cards(int num, Suites suit){
        this.num = num;
        this.suit = suit;
    }

    ArrayList<Cards> cardsList = new ArrayList<>();
    for(int i = 0; i < 52; i++){
        cardsList.add((Math.random() * 10 + 1), Suites);
    }
}
