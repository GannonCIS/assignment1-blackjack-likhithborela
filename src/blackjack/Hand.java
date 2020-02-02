/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

/**
 *
 * @author gubotdev
 */
public class Hand {
    //initializing how many an array for a players hand
    private Card[] myCards = new Card[5];
    private int numOfCards = 0;
    private int score = 0;
    //constructor for hand
    public Hand(){

    }
    //accessor method to see the number of cards, useful for dealer class to determine if a player can take a hit
    public int getNumOfCards(){
        return numOfCards;
    }
    //
    public int getScore(){
        return score;
    }
    //adding a card to a players hand
    public void addCard(Card newCard){

    }
    //showing a players hand to the player
    public void printHand(){
        
    }
    
}
