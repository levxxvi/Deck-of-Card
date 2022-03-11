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
}