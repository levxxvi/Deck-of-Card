import java.util.Random;

public enum Num {
    ACE("Ace"),
    KING("King"),
    QUEEN("Queen"),
    JACK("Jack"),
    TEN("Ten"),
    NINE("Nine"),
    EIGHT("Eight"),
    SEVEN("Seven"),
    SIX("Six"),
    FIVE("Five"),
    FOUR("Four"),
    THREE("Three"),
    TWO("Two");

    private final String NUMNAME;
    Num(String num){
        this.NUMNAME = num;
    }
    public String getNum(){
        return this.NUMNAME;
    }

    public static Num getRandomNum() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
