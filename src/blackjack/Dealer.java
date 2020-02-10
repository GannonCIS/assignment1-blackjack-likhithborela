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
import java.util.Scanner;
import java.util.Arrays;
import java.util.*;

public class Dealer {
    // making a dealerHand and a deck instance from which to actually get cards
    private Hand dealerHand = new Hand();
    private Deck gameDeck = new Deck();
    private Player[] myPlayers;
    private Scanner reader = new Scanner(System.in);
    //constructor of dealer
    public Dealer(int numOfPlayers){
        initMyPlayers(numOfPlayers);
    }
    //cleaner constructor method
    private void initMyPlayers(int _numOfPlayers){
        myPlayers = new Player[_numOfPlayers];
        for(int i = 0; i < myPlayers.length; i++){
            System.out.println("Player " + (i+1) + " what is your name?");
            String name = reader.nextLine();
            if(name.equals("")){
                myPlayers[i] = new Player(i+1);
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
            while(currPlayer.getMyHand().getScore() < 21 && currPlayer.getMyHand().getNumOfCards() < 5){
                System.out.println(currPlayer.getName() + "'s Hand");
                currPlayer.getMyHand().printHand();
                System.out.println("Wanna Hit? Enter Y for yes and N for no");
                char takeHit = reader.next().charAt(0);
                if(takeHit == 'Y'){
                    currPlayer.getMyHand().addCard(gameDeck.dealCard());
                } else if(takeHit == 'N') {
                    break;
                }
            }
            System.out.println(currPlayer.getMyHand().getScore());
            System.out.println("");
        }
    }
    //checks if game is over if dealer bust
    private int playOutDealerHand(){
        while(dealerHand.getScore() < 17){
            dealerHand.addCard(gameDeck.dealCard());
        }
        
        return dealerHand.getScore();
    }
        //determines if dealer is bust so everyone is a winner or if the dealer won or if certain people beat the dealer
    private void declareWinner(){
        Player dealer = new Player("Dealer");
        ArrayList<Player> winners = new ArrayList<Player>();
        int dealerScore = playOutDealerHand();
        if(dealerScore > 21){
            for(Player currPlayer: myPlayers){
                if(currPlayer.getMyHand().getScore() <= 21){
                    winners.add(currPlayer);
                }
            } 
        } else {
            for(Player currPlayer: myPlayers){
                if(currPlayer.getMyHand().getScore() > dealerScore && currPlayer.getMyHand().getScore() <= 21){
                    winners.add(currPlayer);
                } else if(currPlayer.getMyHand().getScore() >= dealerScore){
                
                } else if (currPlayer.getMyHand().getNumOfCards() == 5 && currPlayer.getMyHand().getScore() <= 21 && dealerScore <= 21){
                    winners.add(currPlayer);
                }
            }
        }
        if(winners.size() == 0){
            winners.add(dealer);
        }
        System.out.println("WINNERS:");
        for(Player currPlayer: winners){
            System.out.println(currPlayer.getName());
        }    
    }
    //calls all the methods above to play the game, provides a simpler interface to play the game in the clinet class through abstraction
    public void playGame(){
        dealOpeningHand();
        takePlayerTurns();
        declareWinner();
        System.out.println("Dealer Score: " + playOutDealerHand());
    }    
}
