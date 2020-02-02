/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

/**
 *
 * @author borela001
 */
public class Dealer {
    // making a dealerHand and a deck instance from which to actually get cards
    private Hand dealerHand = new Hand();
    private Deck gameDeck = new Deck();
    //a boolean to determine if the dealer is bust as that can determine winners
    private boolean isDealerBust;
    //constructor of dealer
    public Dealer(Hand dealerHand, Deck gameDeck){
        this.dealerHand = dealerHand;
        this.gameDeck = gameDeck;
    }
    //deals opening hand to all players
    private void dealOpeningHand(){

    }
    //essentially a cohesive method to check if the player wants a hit or if they are bust or if they have 5 cards so they are done
    private void takePlayerTurns(){

    }
    //checks if game is over if dealer bust
    private boolean playOutDealerHand(){
        return isDealerBust;
    }
    //determines if dealer is bust so everyone is a winner or if the dealer won or if certain people beat the dealer
    private String declareWinner(){
        return null;
    }
    //calls all the methods above to play the game, provides a simpler interface to play the game in the clinet class through abstraction
    public void playGame(){

    }
    
    
}
