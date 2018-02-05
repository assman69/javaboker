/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaboker;

//https://stackoverflow.com/questions/23329132/building-a-deck-of-cards-in-java-using-2-different-enums/23329140#23329140

public class Card implements Comparable<Card>
{
  // Maa ja arvo
	public int suit;
	public int rank;
	
	@Override
	public int compareTo(Card o) 
	{
	     if (this.rank == (o.rank))
	            return 0;
	     else if ((this.rank) > (o.rank))
	            return 1;
	     else
	           return -1;
	}
	

}