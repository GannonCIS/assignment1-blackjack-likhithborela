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
public class Player {
    //initializes a players hand and gives the player a name
    private Hand myHand = new Hand();
    private String name;
    //constructs a player with a given name
    public Player(String name){
        this.name = name;
    }
    //overloaded constructor if player is name less
    public Player(int playerNum){
        name = "Player" + playerNum;
    }
    //accessor method to get the players name
    public String getName(){
        return name;
    }
    public Hand getMyHand(){
        return myHand;
    }


    
}
