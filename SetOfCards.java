
/**
 * Abstract class SetOfCards - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
import java.util.*;
public abstract class SetOfCards

{
    protected ArrayList<Card> cards;
    protected int max;

    public SetOfCards(){
        cards=new ArrayList<>();
        max=52;
    }

    public void setCards(ArrayList<Card> yoyo){
        cards=yoyo;
    }

    public ArrayList<Card> getCards(){
        return cards;
    }

    public void addCard(Card kuku){
        cards.add(kuku);
    }

    public String toString(){

        StringBuilder str = new StringBuilder();
        for(Card c: cards){
            str.append(c.toString()+" ");}
        return str.toString();}
}

