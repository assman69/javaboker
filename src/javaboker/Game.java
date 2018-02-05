/*
Santeri Niemi
 */
package javaboker;

//https://stackoverflow.com/questions/2795350/how-to-put-a-scanner-input-into-an-array-for-example-a-couple-of-numbers
import java.awt.BorderLayout;
import java.util.Arrays;
import java.util.Scanner;





public class Game
{
  private final int HAND_SIZE = 5;
	int again = 1;
	private int bet =1;
        int cash = 1;
        int money = 100;
	private int asd=1, asd2=1,asd3=1,asd4=1,asd5=1;
	Scanner scan = new Scanner(System.in);
	Deck deck = new Deck();
	Player player = new Player();
	Card[] hand;
        
        //Tavoitteena saada arrayn arvo 
public void maybeworknow(int asd ,int asd2 ,int asd3, int asd4,int asd5){
             String s = String.format("%d%d",hand[0].suit, hand[0].rank);
             String s2= String.format("%d%d",hand[1].suit, hand[1].rank);
             String s3= String.format("%d%d",hand[2].suit, hand[2].rank);
             String s4= String.format("%d%d",hand[3].suit, hand[3].rank);
              String s5= String.format("%d%d",hand[4].suit, hand[4].rank);
                        asd = Integer.parseInt(s);
                        asd2 = Integer.parseInt(s2);
                        asd3 = Integer.parseInt(s3);
                        asd4 = Integer.parseInt(s4);
                        asd5 = Integer.parseInt(s5);
                        Game1 face = new Game1();
                        face.gui(asd,asd2,asd3,asd4,asd5);
                        
                       System.out.println(asd);           //lowtier debuggereita, kattelin onko arvot oikein
                        System.out.println(asd2);
                         System.out.println(asd3);
                          System.out.println(asd4);
                          System.out.println(asd5);
}

	// pelaa
	public void play()
	{
            
		while (again == cash )
		{
			// pakka yäyteen
			deck.fillDeck();
			                 
			deck.shuffle();
			
                        //aseta panos
                        this.bet();
                        
			// korttien veto
			hand = player.draw(deck);
                    this.maybeworknow(asd, asd2, asd3, asd4, asd5);
			// järjestää kortit nätisti		
			Arrays.sort(hand);
			
			// näyttää kortit ja vetää uusia kortteja
			this.checkHand();
			hand = this.redraw();
			 this.maybeworknow(asd, asd2, asd3, asd4, asd5);
                          
			// järjestää uudestaan
                        //tekee halutun käden testausta varten, uncomment for värisuora
                       // this.makeHand(); 
			Arrays.sort(hand);
                        //näyttää käden
                        
                        this.checkHand();
			
			// vertailee kättä
			this.evaluate();
                        if (cash == 1) {
                        this.again();
                    }
                        else break;     
		}
		System.out.println("Thanks for playing! =]");
	}
        //kuuntelee seuraavaa numeroa
	public void again(){
            
          System.out.println("Press 1 to play again, other for no.");
            again = scan.nextInt();
        }
        


	// tekee halutun käden testauksia varten
	public void makeHand()
	{
		hand[0].rank = 1;
		hand[1].rank = 2;
		hand[2].rank = 3;
		hand[3].rank = 4;
		hand[4].rank = 5;
		
		hand[0].suit = 1;
		hand[1].suit = 1;
		hand[2].suit = 1;
		hand[3].suit = 1;
		hand[4].suit = 1;
	}
	
	// näyttää käden
	public void checkHand()
	{
		for (int handCounter = 0; handCounter < HAND_SIZE; handCounter++)
		{
			this.display(hand[handCounter]);
                        
		}
	}
	
	// vedetäänkö uusia kortteja?
	public Card[] redraw()
	{
		for (int counter = 0; counter < 5; counter++)
		{
			System.out.print("Redraw card " + (counter + 1) + "?" +
					" (1 for yes, 0 for no)");
			int answer = scan.nextInt();
			if (answer == 1)
			{
				hand[counter] = player.redraw(counter, deck);
                                
                               
			}
		}
		deck.refreshDeckPosition();
		return hand;
	}
	
	
	
	//panostus
	public void bet(){
            System.out.println("Balance: "+ money + "€");
            System.out.print("Bet: ");
                    bet = scan.nextInt();
                    money = money - bet;
                    System.out.println("Balance: "+money +"€");
                    if (money >=0) {
                cash=1;
            }
                    else cash=0;
        }
	// tekee stringin jokaiselle kädessä olevalle kortille
	public void display(Card card)
	{
		if (card.rank == 1)
		{
			System.out.print("Ace of ");
                        
		}
		if (card.rank == 2)
		{
			System.out.print("Two of ");
                        
		}
		if (card.rank == 3)
		{
			System.out.print("Three of ");
                        
		}
		if (card.rank == 4)
		{
			System.out.print("Four of ");
                        
		}
		if (card.rank == 5)
		{
			System.out.print("Five of ");
                       
		}
		if (card.rank == 6)
		{
			System.out.print("Six of ");
		}
		if (card.rank == 7)
		{
			System.out.print("Seven of ");
		}
		if (card.rank == 8)
		{
			System.out.print("Eight of ");
		}
		if (card.rank == 9)
		{
			System.out.print("Nine of ");
		}
		if (card.rank == 10)
		{
			System.out.print("Ten of ");
		}
		if (card.rank == 11)
		{
			System.out.print("Jack of ");
		}
		if (card.rank == 12)
		{
			System.out.print("Queen of ");
		}
		if (card.rank == 13)
		{
			System.out.print("King of ");
		}
		if (card.suit == 1)
		{
			System.out.print("Spades");
                        
			System.out.println();
		}
		if (card.suit == 2)
		{
			System.out.print("Hearts");
                      
			System.out.println();
		}
		if (card.suit == 3)
		{
			System.out.print("Diamonds");
                       
			System.out.println();
		}
		if (card.suit == 4)
		{
			System.out.print("Clubs");
                      
			System.out.println();
		}
		
	}
        

    

// Jakaa voitot ja tarkastaa mikä käsi tuli
public void evaluate()
	{
		if (this.royalFlush() == 1)
		{
			System.out.println("You have a royal flush!");
                        money = money + bet*300;
                        System.out.println("You won: "+bet*300+"€");
		}
		else if (this.straightFlush() == 1)
		{
			System.out.println("You have a straight flush!");
                        money = money + bet*30;
                        System.out.println("You won: "+bet*30+"€");
		}       
		else if (this.fourOfaKind() == 1)
		{
			System.out.println("You have four of a kind!");
                        money = money + bet*15;
                        System.out.println("You won: "+bet*15+"€");
		}
		else if (this.fullHouse() == 1)
		{
			System.out.println("You have a full house!");
                        money = money + bet*8;
                        System.out.println("You won: "+bet*8+"€");
		}
		else if (this.flush() == 1)
		{
			System.out.println("You have a flush!");
                        money = money + bet*4;
                        System.out.println("You won: "+bet*4+"€");
		}
		else if (this.straight() == 1)
		{
			System.out.println("You have a straight!");
                        money = money + bet*4;
                        System.out.println("You won: "+bet*4+"€");
		}
		else if (this.triple() == 1)
		{
			System.out.println("You have a triple!");
                        money = money + bet*3;
                        System.out.println("You won: "+bet*3+"€");
		}
		else if (this.twoPairs() == 1)
		{
			System.out.println("You have two pairs!");
                        money = money + bet*2;
                        System.out.println("You won: "+bet*2+"€");
		}
		else if (this.pair() == 1)
		{
			System.out.println("You have a pair!");
                        money = money ;            
                      System.out.println("You lost: "+bet+"€");
		}
		else
		{
			int highCard = this.highCard();
			System.out.println("Your highest card is " + highCard);
                        money = money;
                        System.out.println("You lost: "+bet+"€");
		}
                
	}
	
	// tarkastaa kunkkuvärisuoran
	public int royalFlush()
	{
		if (hand[0].rank == 1 && hand[1].rank == 10 && hand[2].rank == 11 &&
				hand[3].rank == 12 && hand[4].rank == 13)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
	// kattoo värisuoran
	public int straightFlush()
	{
		for (int counter = 1; counter < 5; counter++)
		{
			if (hand[0].suit != hand[counter].suit)
			{
				return 0;
			}
		}
		for (int counter2 = 1; counter2 < 5; counter2++)
		{
			if (hand[counter2 - 1].rank != (hand[counter2].rank - 1))
			{
				return 0;
			}
				
		}
		return 1;
		
	}
	
	// kattoo neloset
	public int fourOfaKind()
	{
		if (hand[0].rank != hand[3].rank && hand[1].rank != hand[4].rank)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
	
	// täyskäsi
	public int fullHouse()
	{
		int comparison = 0;
		for (int counter = 1; counter < 5; counter++)
		{
			if (hand[counter - 1].rank == hand[counter].rank)
			{
				comparison++;
			}
		}
		if (comparison == 3)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
	// väri
	public int flush()
	{
		for (int counter = 1; counter < 5; counter++)
		{
			if (hand[0].suit != hand[counter].suit)
			{
				return 0;
			}
		}
		return 1;
	}
	
	// suora
	public int straight()
	{
		for (int counter2 = 1; counter2 < 5; counter2++)
		{
			if (hand[counter2 - 1].rank != (hand[counter2].rank - 1))
			{
				return 0;
			}
				
		}
		return 1;
	}
	
	// kolomoset
	public int triple()
	{
		if (hand[0].rank == hand[2].rank || hand[2].rank == hand[4].rank)
		{
			return 1;
		}
		return 0;
	}
	
	// kaks paria
	public int twoPairs()
	{
		int check = 0;
		for(int counter = 1; counter < 5; counter++)
		{
			if (hand[counter - 1].rank == hand[counter].rank)
			{
				check++;
			}
		}
		if (check == 2)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
	// pari
	public int pair()
	{
		int check = 0;
		for(int counter = 1; counter < 5; counter++)
		{
			if (hand[counter - 1].rank == hand[counter].rank)
			{
				check++;
			}
		}
		if (check == 1)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
	// hai
	public int highCard()
	{
		int highCard = 0;
		for (int counter = 0; counter < 5; counter++)
		{
			if (hand[counter].rank > highCard)
			{
				highCard = hand[counter].rank;
			}
		}
		return highCard;
	}
        
}
        

//      huono ja turha yritys saada sirrettyä array arvoja
//        public void kortteja(Card card){
//          int  counter = 0;
//               String [] myArray = {s};    
//            for (int i = 0; i < 5; i++) {
//                 
//            
//    
//            if (card.suit == 1 && card.rank ==1) {
//                s = "aceofspades";
//                counter++;
//                myArray[i] =s;
//            }
//            if (card.suit == 1 && card.rank ==2) {
//                s = "twoofspades";
//                counter++;
//                
//            }
//            if (card.suit == 1 && card.rank ==3) {
//                s = "threeofspades";
//                counter++;
//                
//            }
//            if (card.suit == 1 && card.rank ==4) {
//                s = "fourofspades";
//                counter++;
//               
//            }
//            if (card.suit == 1 && card.rank ==5) {
//                s = "fiveofspades";
//                counter++;
               

        
    
  

 



    




