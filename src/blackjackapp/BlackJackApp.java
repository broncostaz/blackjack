/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjackapp;

import java.util.Random;

/**
 *
 * @author finda
 */
public class BlackJackApp {
    
    Random ran = new Random();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //a deck of 52 cards
        Deck blackjackDeck = new Deck();
        //the hands
        Hand userOne = new Hand();
        Hand dealer = new Hand();
        double chips = 5000.00;
        String [][] formats = new String[2][2];
        
        //shuffle the deck
        System.out.println("The dealer shuffles the deck.");
        blackjackDeck.shuffleDeck();
   
        //first card the user is dealt and the card is removed from the deck 
        Card dealtOne = blackjackDeck.getCard();
        userOne.addCard(dealtOne);
        blackjackDeck.removeCard(dealtOne);
        
        Card dealersFacedown = blackjackDeck.getCard();
        dealer.addCard(dealersFacedown);
        blackjackDeck.removeCard(dealersFacedown);
        
        //2nd card the user is dealt and the card is removed from the deck
        Card dealtTwo = blackjackDeck.getCard();
        userOne.addCard(dealtTwo);
        blackjackDeck.removeCard(dealtTwo);
        
        Card dealersFaceup = blackjackDeck.getCard();
        dealer.addCard(dealersFaceup);
        blackjackDeck.removeCard(dealersFaceup);
        
        System.out.println(formatApp(formats, userOne, dealer));
        
        /*
        userOne.printHand();
        dealer.printDealerHand();
        System.out.println(blackjackDeck.sizeOfDeck());
        */
    }//end of main method
    
    public static String [][] formatApp(String [][] blackjackFormat,
            Hand user, Hand dealer)
    {
        blackjackFormat = new String [][] 
        { 
            {"======================","  =  ", "========================="},
            {"||     YOUR CARDS    ||"," =  ","||     DEALER CARDS     ||"},
            {"======================","  =  ", "========================="}, 
            {"||                   || "," = ", "||                 ||"},
            {"||" + user.printCardInHand(0), "||   =   ||", "Dealer card Face down" },
            {"||" + user.printCardInHand(1), "||   =   ||", dealer.printCardInHand(1)},
            {"=====================", "  =  ", "========================="}
        };
        
        
        
        return blackjackFormat;
    }
    
    //figure out if card is a face card
    public boolean isFaceCard(Card c)
    {//start of method
        if(c.getValue() >= 11 && c.getValue() <= 13 )
        {    
            return true;
        }
        else
        {
        return false;
        }
    }//end of method
    /**
    public int changeValue(Card c)
    {
        if(isFaceCard(c))
        {
            
        }
        else{
            if(isAce(c))
            {
                
            }
            else{
                return c.getValue();
            }
        }
    }
    */
    
    //figure out if card is a ace
    public boolean isAce(Card c)
    {
        if(c.getValue() == 14)
        {
            return true;
        }
        else
        {
            return false;
        }
    }//end of m
    
   
}
