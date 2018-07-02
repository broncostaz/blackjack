/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjackapp;



/**
 *
 * @author finda
 */
public class Card {
    
     public static enum Suit{
        SPADES,
        HEARTS,
        CLUBS,
        DIAMONDS
    }
    
    public static enum Rank{
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        JACK,
        QUEEN,
        KING,
        ACE
    }
  
    private Suit mySuit;
    private Rank myRank;
    private String x, y;
    
    public Card(Suit suit, Rank rank)
    {
        this.mySuit = suit;
        this.myRank = rank;        
    }
    
    public Suit getSuit(Suit suit)
    {
        return suit;
    }
    
    public Rank getRank(Rank rank)
    {
        return rank;
    }
    
    public int getValue()
    {
        return myRank.ordinal() + 2;
    }
    
    public String getSuitAsString()
    {
        switch(mySuit)
        {
            case HEARTS:
                return "Hearts";
            case DIAMONDS:
                return "Diamonds";
            case CLUBS:
                return "Clubs";
            case SPADES:
                return "Spades";
            default:
                return "Unknown";
        }
    }
    
    public String getRankAsString()
    {
        switch(myRank)
        {
            case TWO:
                return "Two";
            case THREE:
                return "Three";
            case FOUR:
                return "four";
            case FIVE:
                return "five";
            case SIX:
                return "Six";
            case SEVEN:
                return "Seven";
            case EIGHT:
                return "Eight";
            case NINE:
                return "Nine";
            case TEN:
                return "Ten";
            case JACK:
                return "Jack";
            case QUEEN:
                return "Queen";
            case KING:
                return "King";
            case ACE:
                return "Ace";
            default:
                return "Unknown";
        }
    }
    
    @Override
    public String toString()
    {
        return getRankAsString() + " of " + getSuitAsString();
    }
}//end of class


