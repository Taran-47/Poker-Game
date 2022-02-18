
/**
 * Write a description of class Card here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Card
{ 
    private Suit suit;
    private Rank rank;
    public Card( Suit suit, Rank rank){
        this.suit= suit;
        this.rank=rank;
    }

    public Suit getSuit(){
        return suit;
    }

    public Rank getrank(){
        return rank;
    } 

    public String toString(){
        return rank+" "+"of"+" "+suit;
    }
}
 