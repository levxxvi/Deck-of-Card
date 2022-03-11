import java.util.ArrayList;

public class Cards {
    int num;
    Suites suit;

    public Cards(int num, Suites suit){
        this.num = num;
        this.suit = suit;
    }

    ArrayList<Cards> cards = new ArrayList<>();
}
