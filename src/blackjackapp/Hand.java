/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjackapp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author finda
 */
public class Hand {
    
    private List<Card> cards = new ArrayList<Card>();
    
    public Hand(){}
    
    public void removeCard(Card c)
    {
        cards.remove(c);
    }
    
    public void addCard(Card c)
    {
        cards.add(c);
    }
    
    public int sizeOfHand()
    {
        int d = cards.size();
        return d;
    }
    
     public int countAce(int count)   
    {//start of 
        count = 0;
        try {//start of try
            for(int i = 0; i<cards.size(); i++)
            {//start of for
                if(cards.get(i).getValue() == 14)
                {//start of if
                    count++;
                }//end of if
            }//end of for
            }//end of try
        catch(IndexOutOfBoundsException e)
        {//start of catch
            System.out.println(e.getMessage());
        }//end of catch
        
        catch(Exception e)
        {//start of catch
            System.out.println(e.getMessage());
        }//end of catch
        
        return count;
    }//end of method
     
     //prints the cards in the users hands 
     public String printCardInHand(int i)
     {//start of method
       return cards.get(i).toString();
     }//end of method
     
     //only used for dealer cause it prints out only the dealers second card
     public void printDealerHand()
     {//start of method
         System.out.println(cards.get(1).toString());
     }//end of method
    
}//end of class
