
/**
 * Write a description of class Deck here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Deck extends SetOfCards{
    
    
    public Deck(){ max=52;
        createCards();
    }
    private void createCards(){
        Suit[] suitt = Suit.values();
        Rank [] rankk = Rank.values();
        for(int i=0;i<rankk.length;i++){
            
            for(int j=0;j<suitt.length;j++){
                Card c = new Card(suitt[j], rankk[i]);
                cards.add(c);
            }
            
        }
        
    }public void shuffle(){
        Collections.shuffle(cards);
    } 
    public Card deal(){
        Card c =  cards.get(0);
        cards.remove(0);
        return c;
        
}}
            
             
    