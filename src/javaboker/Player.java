/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaboker;



public class Player 
{
  
	// ottaa 5
	public Card[] draw(Deck deck)
	{
		Card[] hand = deck.deal();
		return hand;
	}
	
	// vaihtaa
	public Card redraw(int counter, Deck deck)
	{
		Card card = deck.redeal();
		return card;
	}

        
        
}