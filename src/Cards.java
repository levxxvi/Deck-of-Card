import java.util.Comparator;

public class Cards implements Comparable<Cards>{
    /*String num;
    String suit;

    public Cards(String num, String suit){
        this.num = num;
        this.suit = suit;
    }*/
    Num num;
    Suites suit;

    public Cards(Num num, Suites suit){
        this.num = num;
        this.suit = suit;
    }

    @Override
    public int compareTo(Cards o) {
        if(this.suit.compareTo(o.suit) >= 0){
            return 1;

        } else if (this.suit.compareTo(o.suit) <= 0){
            return -1;
        }
        return 0;
    }

    /*
    @Override
    public int compareTo(Cards o) {
        if(this.suit.compareTo(o.suit) <= 0){
            if(this.num.compareTo(o.num) >= 0){
                return 1;
            }
        } else if (this.suit.compareTo(o.suit) >= 0){
            if(this.num.compareTo(o.num) >= 0){
                return 1;
            }
            else {
                return -1;
            }
        }
        return 0;
    }
    */

    /*
    @Override
    public int compareTo(Cards o) {
        if(this.suit.compareTo(o.suit) <= 0 && this.num.compareTo(o.num) >= 0){
            return 2;
        } else if (this.suit.compareTo(o.suit) <= 0 && this.num.compareTo(o.num) <= 0) {
            return 1;
        } else if (this.suit.compareTo(o.suit) >= 0 && this.num.compareTo(o.num) >= 0){
            return -1;
        } else if (this.suit.compareTo(o.suit) >= 0 && this.num.compareTo(o.num) <= 0){
            return -2;
        }
        return 0;
    }
     */

    /*
    @Override
    public int compareTo(Cards o) {
        if(this.suit.compareTo(o.suit) <= 0){
            if(this.num.compareTo(o.num) >= 0){
                return 2;
            } else if(this.num.compareTo(o.num) <= 0){
                return 1;
            }
        } else if (this.suit.compareTo(o.suit) >= 0 && this.num.compareTo(o.num) >= 0){
            if(this.num.compareTo(o.num) >= 0){
                return -1;
            } else if(this.num.compareTo(o.num) <= 0){
                return -2;
            }
        }
        return 0;
    }

     */
}
