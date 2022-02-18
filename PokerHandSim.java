
/**
 * Write a description of class PokerHandSim here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class PokerHandSim
{
   public static void main(String[] args){
       Deck d = new Deck();
       d.shuffle();
      Card[][] players = new Card[4][5];
      ArrayList<Card> s= new ArrayList<>();
      System.out.println("Poker Simulation - initial Hand");
      for(int i =0; i<players.length;i++){
          System.out.println("Player "+(i+1)+":");
          for(int j=0; j<players[i].length;j++){
              players[i][j]=d.deal();
                  s.add(players[i][j]);}
                  Hand t = new Hand(s);
                String j=t.evaluate();
                
                System.out.println(t.toString()+"\n"+j);
                s.clear();
            }
        }
    }