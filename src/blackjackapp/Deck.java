package blackjackapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author finda
 */
public class Deck {
    
    Random ran = new Random();
    private List<Card> cards = new ArrayList<Card>();
    
    public Deck()
    {
        for(Card.Suit s : Card.Suit.values())
        {
            for(Card.Rank r : Card.Rank.values())
            {
                cards.add(new Card(s,r));
            }//end of nested for
        }//end of for
    }//end of constructor
    
    public void removeCard(Card c)
    {
        cards.remove(c);
    }
    
    public void addCard(Card c)
    {
        cards.add(c);
    }
    
    public Card getCard()
    {
        Card c = cards.get(ran.nextInt(cards.size()) + 1);
        
        return c;
    }
    
    public void printDeck()
    {
        for(int i = 0; i< cards.size(); i++)
        {
            System.out.println(cards.get(i).toString());
        }
    }
    
    public void shuffleDeck()
    {
        Collections.shuffle(cards);
    }
    
    public int sizeOfDeck()
    {
    int d = cards.size();
        return d;
    }

}
