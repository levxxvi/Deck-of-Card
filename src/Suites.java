import java.util.Random;

public enum Suites {
    SPADES("Spades"),
    HEARTS("Hearts"),
    CLOVERS("Clovers"),
    DIAMONDS("Diamonds");

    private final String SUITNAME;
    Suites(String suit){
        this.SUITNAME = suit;
    }
    public String getSuit(){
        return this.SUITNAME;
    }

    public static Suites getRandomSuit() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}