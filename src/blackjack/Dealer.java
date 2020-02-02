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

    private Hand dealerHand = new Hand();
    private Deck gameDeck = new Deck();

    private boolean isDealerBust;

    public Dealer(Hand dealerHand, Deck gameDeck){
        this.dealerHand = dealerHand;
        this.gameDeck = gameDeck;
    }

    private Card dealOpeningHand(){
        //i dont really know what data type this returns, if any, i am thinking cards but i dont know
        return null;
    }

    private Card takePlayerTurns(){
        return null;
    }

    private boolean playOutDealerHand(){
        return isDealerBust;
    }

    private String declareWinner(){
        return null;
    }

    public void playGame(){

    }
    
    
}
