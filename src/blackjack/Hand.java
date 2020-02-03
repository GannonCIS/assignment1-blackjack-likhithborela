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
        if(numOfCards > 4){
            System.out.println("Too many cards for this hand");
        } else {
            myCards[numOfCards] = newCard;
            numOfCards++;

            try{
                score += Integer.parseInt(newCard.RANK);
            }catch(java.lang.NumberFormatException ex){
                if(newCard.RANK.equals("Ace")){
                    score += 1;
                }else{
                    score += 10;
                }
            }         
        }
    }
    //showing a players hand to the player
    public void printHand(){
        for(int i = 0; i < myCards.length;i++){
            System.out.println(myCards[i].RANK + " of " + myCards[i].SUIT);
        }
    }   
}
