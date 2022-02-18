
/**
 * Enumeration class Rank - write a description of the enum class here
 *
 * @author (HArnoor singh sidhu 3111085)
 * @version (version number or date here)
 */
public enum Rank
{
    TWO(1),THREE(2),FOUR(3),FIVE(4),SIX(6),SEVEN(7),EIGHT(8),NINE(9),TEN(10),JACK(11),QUEEN(12),KING(13),ACE(14);
    int getValue;
    private Rank(int getValue){
    this.getValue=getValue;}
    public int isgetValue(){
        return getValue;
    }
}
