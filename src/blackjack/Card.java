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
public class Card {
    //identifiers for each cards value and type
    public final String RANK, SUIT;
    //constructs the card object with a suit and a numerical value or face card value
    public Card(String RANK, String SUIT){
        this.RANK = RANK;
        this.SUIT = SUIT;
    }   
}
