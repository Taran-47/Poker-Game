
/**
 * Write a description of class Hand here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Hand extends SetOfCards
{
    public Hand(){
        max=5;}

    public Hand(ArrayList<Card> cards){
        max=5;
        this.cards=cards;}

    public String evaluate(){

        if(straightFlush()){
            return "Straight Flush";
        }
        else if(flush()){
            return "Flush";
        }
        else if(Straight()){
            return "Straight";
        }
        else
            return matches();

    }

    private boolean flush(){
        Card c = cards.get(0);
        Suit suit= c.getSuit();
        for(int i=1; i<cards.size();i++){
            if(cards.get(i).getSuit()!=suit)
                return false;
        }return true;
    }                 

    private boolean Straight(){
        int[] array=new int[5];
        for(int i=0;i<5;i++){
            array[i]=cards.get(i).getrank().isgetValue();
        }
        Arrays.sort(array);
        for(int i=0;i<array.length;i++){
            if(array[i]!=array[i+1]-1){
                return false;}
        }
        return true;

    }
    private boolean straightFlush(){
        if(flush()&&Straight()){
            return true;}
        return false;

    }

    private String matches(){
        int[] array=new int[5];
        for(int i=0;i<5;i++){
            array[i]=cards.get(i).getrank().isgetValue();
        }
        Arrays.sort(array);
        int count=0;
        int pos=0;
        for(int i=0;i<cards.size()-1;i++){
            if(array[i]==array[i+1]){
                count++;
                pos=i;
            }
        }
        if(count==1)
            return "One Pair";
        if(count==2){
            if(array[pos-1]==array[pos]&&array[pos]==array[pos+1]){
                return "Three of a Kind";
            }
            else
                return "Two Pair";
        }
        if(count==3){
            if(array[pos-2]==array[pos-1]&&array[pos-1]==array[pos]&&array[pos]==array[pos+1]){
                return "Four of a Kind";
            }
            else
                return "Full House";
        }
        return "Nothing ("+highest()+" high)";
    }

    private Rank highest(){
        int[] array=new int[5];
        for(int i=0;i<5;i++){
            array[i]=cards.get(i).getrank().isgetValue();
        }
        Arrays.sort(array);
        for(int i=0;i<cards.size();i++){
            if(cards.get(i).getrank().isgetValue()==array[4])
                return cards.get(i).getrank();
        }
        return null;
    }

    public String toString(){
        return super.toString();
    }
}
