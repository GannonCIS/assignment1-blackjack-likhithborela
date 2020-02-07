/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.Currency;
/**
 *
 * @author borela001
 */
import java.util.Scanner;

public class Dealer {
    // making a dealerHand and a deck instance from which to actually get cards
    private Hand dealerHand = new Hand();
    private Deck gameDeck = new Deck();
    private Player[] myPlayers;
    private Scanner reader = new Scanner(System.in());
    
    //a boolean to determine if the dealer is bust as that can determine winners
    private boolean isDealerBust;
    //constructor of dealer
    public Dealer(int numOfPlayers){
        initMyPlayers(numOfPlayers);
    }
    //cleaner constructor method
    private void initMyPlayers(int _numOfPlayers){
        myPlayers = new Player[_numOfPlayers];
        for(int i = 0; i < myPlayers.length; i++){
            System.out.println("Player" + (i+1) + "what is your name?");
            String name = Scan.nextLine();
            if(name.equals("")){
                myPlayers = new Player(i+1);
            } else {
                myPlayers[i] = new Player(name);
            }
        }
    }
    //deals opening hand to all players
    private void dealOpeningHand(){
        for(int i = 0; i < 2; i++){
            for(Player currPlayer: myPlayers){
                currPlayer.getMyHand().addCard(gameDeck.dealCard());
            }
            dealerHand.addCard(gameDeck.dealCard());
        }
    }
    //essentially a cohesive method to check if the player wants a hit or if they are bust or if they have 5 cards so they are done
    private void takePlayerTurns(){
        for(Player currPlayer: myPlayers){
            while(myPlayers[i].getMyHand().getScore() < 21 && myPlayers[i].getMyHand().getNumofCards() < 5){
                System.out.println(currPlayer.getName() + "'s Hand");
                System.out.println("Wanna Hit? Enter Y for yes and N for no");
                Char takeHit = reader.next().charAt(0);
                if(opt == 'Y'){
                    myPlayers[i].getMyHand().addCard(myDeck.dealCard);
                }   
            }
            currPlayer.getMyHand().printHand();
        }
    }
    //checks if game is over if dealer bust
    private boolean playOutDealerHand(){
        while(dealerHand.getScore()){
            dealerHand.addCard(myDeck.dealCard());
        }
        isDealerBust = true;
        return isDealerBust;
    }
    //determines if dealer is bust so everyone is a winner or if the dealer won or if certain people beat the dealer
    private String declareWinner(){
        return null;//bruh u dumb if u dont remove this
    }
    //calls all the methods above to play the game, provides a simpler interface to play the game in the clinet class through abstraction
    public void playGame(){

    }
    
    
}
