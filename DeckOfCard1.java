package com.bridgelabz.Day_11;

public class DeckOfCard1 {
	 public static void main(String[] args) {
		    int[] deck = new int[52];
		    String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
		    String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

		    for (int i = 0; i < deck.length; i++) {
		      deck[i] = i;
		    }
		    
		    for (int i = 0; i < deck.length; i++) {
		      int index = (int)(Math.random() * deck.length);
		      int temp = deck[i];
		      deck[i] = deck[index];
		      deck[index] = temp;
		    }
		    
		    for (int i = 0; i < 52; i++) {
		      String suit = suits[deck[i] / 13];	
		      String rank = ranks[deck[i] % 13];
		     if (i>=0 && i <= 8) {
		    	 System.out.println("Player-1 "+rank+" of "+suit);
		     }
		     if (i>=9 && i <= 17) {
		    	 System.out.println("Player-2 "+rank+" of "+suit);
		     }
		     if (i>=18 && i <= 26) {
		    	 System.out.println("Player-3 "+rank+" of "+suit);
		     }
		     if (i>=27 && i <= 35) {
		    	 System.out.println("Player-4 "+rank+" of "+suit);
		     }
		    }
		    
		  }
}
