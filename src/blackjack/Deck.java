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
public class Deck {
    //initializing variables 
    private Card[] myCards = new Card[52];
    private String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"}; 
    private String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    private int nextCard = 0;
    //the constructor
    public Deck(){
        initDeck();
    }
    //initializes a deck by creating deck objects and assigning them into the myCards array
    private void initDeck(){
        for(int s = 0; s < suits.length; s++){
            for(int r = 0; r < ranks.length; r++){
                myCards[(s*13) + r] = new Card(ranks[r], suits[s]);
            }
        }
    }
    //shuffles the myCards arrays values through a math.random loop
    private void shuffle(){

    }
    
    //test method
    public void printDeck(){
        for(int i = 0; i < myCards.length;i++){
            System.out.println(myCards[i].RANK + " of " + myCards[i].SUIT);
        }
    }
    //deals card to a player from the array
    public Card dealCard(){
        return null;
    }

}
